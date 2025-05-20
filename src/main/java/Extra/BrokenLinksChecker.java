package Extra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BrokenLinksChecker {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String[] urlsToCheck = {
                "https://www.moeving.com",
                "https://moeving.com/what-we-do/",
                "https://moeving.com/our-impact/",
                "https://moeving.com/ev-showroom/",
                "https://moeving.com/news/",
                "https://moeving.com/join-us/",
                "https://moeving.com/contact/"
        };

        Set<String> checkedLinks = new HashSet<>();

        for (String pageUrl : urlsToCheck) {
            System.out.println("\n🔎 Checking page: " + pageUrl);
            driver.get(pageUrl);
            Thread.sleep(2000); // wait for page load

            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("🔗 Total <a> tags found: " + links.size());

            int nullHref = 0, invalid = 0, duplicate = 0, validChecked = 0;

            for (WebElement link : links) {
                String href = link.getDomAttribute("href");

                if (href == null) {
                    nullHref++;
                    continue;
                }

                if (!href.startsWith("http") || href.contains("mailto:") || href.contains("javascript:") || href.contains("tel:")) {
                    invalid++;
                    continue;
                }

                if (checkedLinks.contains(href)) {
                    duplicate++;
                    continue;
                }

                checkedLinks.add(href);
                validChecked++;
                checkBrokenLink(href);
            }

            // Per page summary
            System.out.println("\n📋 Summary for: " + pageUrl);
            System.out.println("🚫 Null hrefs: " + nullHref);
            System.out.println("⚠️ Invalid links (mailto, tel, JS, etc.): " + invalid);
            System.out.println("🔁 Duplicates skipped: " + duplicate);
            System.out.println("✅ Valid links checked: " + validChecked);
        }

        driver.quit();
    }

    public static void checkBrokenLink(String linkUrl) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println("❌ Broken Link: " + linkUrl + " --> Response Code: " + responseCode);
            } else {
                System.out.println("✅ Valid Link: " + linkUrl);
            }

        } catch (IOException e1) {
            // Fallback to GET if HEAD fails
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
                connection.setRequestMethod("HEAD");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("❌ Broken Link (GET Fallback): " + linkUrl + " --> Response Code: " + responseCode);
                } else {
                    System.out.println("✅ Valid Link (GET Fallback): " + linkUrl);
                }
            } catch (IOException e2) {
                System.out.println("⚠️ Error checking link: " + linkUrl + " --> " + e2.getMessage());
            }
        }
    }
}
