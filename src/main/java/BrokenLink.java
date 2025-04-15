import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLink {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.moeving.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String url = link.getDomAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("Link is either not configured or is empty");
                continue;
            }
            // Skip fragment-only URLs and non-http(s) URLs
            if (url.startsWith("#") || !url.startsWith("http")) {
                System.out.println("Skipping non-HTTP or fragment link: " + url);
                continue;
            }
            verifyLink(url);
        }
    }

    private static void verifyLink(String url) throws IOException {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println(url + " is a broken link. Response Code: " + responseCode);
            } else {
                System.out.println(url + " is a valid link. Response Code: " + responseCode);
            }
        } catch (Exception e) {
            System.out.println(url + " - Exception occurred -> " + e.getMessage());
        }
    }
}
