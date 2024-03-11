import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Act_9 {
    public static void main(String[] args) {
        // Setup the driver
        WebDriverManager.firefoxdriver().setup();
        // Driver object reference
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/ajax");

        // Find the button and click it
        driver.findElement(By.cssSelector("button.violet")).click();
        // appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ajax-content")));
        // Find and print the new text
        System.out.println("-------- The text after clicking the button --------");
        String text = driver.findElement(By.id("ajax-content")).getText();
        System.out.println(text);



        // late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
        String late = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("-------- The delayed text is -------- \n"+late);


        // Close the browser
        driver.quit();
    }
}
