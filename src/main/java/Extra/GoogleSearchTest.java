package Extra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleSearchTest {

    public static void main(String[] args) {

        // Declare strings for input and matching
        String searchText = "testing";
        String matchText = "interview";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        // Accept cookies if visible (optional)
        try {
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement acceptCookies = shortWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Accept all']")));
            acceptCookies.click();
        } catch (Exception ignored) {}

        // Enter search text
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        searchBox.sendKeys(searchText);

        // Wait for and collect suggestions
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> suggestions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.xpath("//ul[@role='listbox']//li[contains(@class, 'sbct')]")
        ));

        // Print all suggestions
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }

        // Click the suggestion that contains the match text
        boolean clicked = false;
        for (WebElement suggestion : suggestions) {
            String text = suggestion.getText().toLowerCase();
            if (text.contains(matchText.toLowerCase())) {
                System.out.println("Clicking on suggestion: " + text);
                suggestion.click();
                clicked = true;
                break;
            }
        }

        if (!clicked) {
            System.out.println("No suggestion with '" + matchText + "' found.");
        }

        // Optional wait before closing
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}

        driver.quit();
    }
}
