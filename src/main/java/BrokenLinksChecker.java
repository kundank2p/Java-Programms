import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksChecker {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.nab.com.au/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getDomAttribute("href");

            if (url != null && url.startsWith("http")) {
                checkBrokenLink(url);
            }
        }

        driver.quit();
    }

    public static void checkBrokenLink(String linkUrl) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(linkUrl).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode >= 400) {
                System.out.println("Broken Link: " + linkUrl + " --> Response Code: " + responseCode);
            } else {
                System.out.println("Valid Link: " + linkUrl);
            }
        } catch (IOException e) {
            System.out.println("Error checking link: " + linkUrl);
        }
    }
}
