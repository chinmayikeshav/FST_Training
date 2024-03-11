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

public class Act_8 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the toggle button and click it
        WebElement checkbox = driver.findElement(By.id("toggleCheckbox"));
        checkbox.click();
        System.out.println("Checkbox clicked");

        // checkbox  disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Checkbox Disappeared");

        // Click the button again
        checkbox.click();

        // checkbox appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Checkbox Appeared");

        // Close the browser

        //implicit
//        WebElement checkbox = driver.findElement(By.id("toggleCheckbox"));
//        checkbox.click();
//        System.out.println("Checkbox clicked");
//
//        // Wait for the checkbox to disappear
//        System.out.println("Waiting for checkbox to disappear...");
//        WebElement dynamicCheckbox = driver.findElement(By.id("dynamicCheckbox"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOf(dynamicCheckbox));
//        System.out.println("Checkbox Disappeared");
//
//        // Click the button again
//        checkbox.click();
//        System.out.println("Checkbox clicked again");
//
//        // Wait for the checkbox to appear
//        System.out.println("Waiting for checkbox to appear...");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
//        System.out.println("Checkbox Appeared");
        driver.close();

    }

}
