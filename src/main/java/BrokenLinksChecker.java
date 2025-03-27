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
    // ANSI escape codes for console colors
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m"; // Reset color to default

    public static void main(String[] args) {
        // Set up WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Open the website
        driver.get("https://moeving.com");

        // Get all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url != null && !url.isEmpty()) {
                // Skip non-HTTP links like "tel:", "mailto:", "javascript:void(0);"
                if (url.startsWith("http")) {
                    checkBrokenLink(url);
                } else {
                    System.out.println("Skipping Non-HTTP Link: " + url);
                }
            } else {
                System.out.println("Invalid link: " + link.getText());
            }
        }

        // Close the browser
        driver.quit();
    }

    // Method to check if a link is broken
    public static void checkBrokenLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode >= 400) {
                System.out.println(RED + "Broken Link: " + linkUrl + " --> Response Code: " + responseCode + RESET);
            } else {
                System.out.println("Valid Link: " + linkUrl);
            }

        } catch (IOException e) {
            System.out.println("Error checking link: " + linkUrl);
        }
    }
}

