import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Act_11 {

        public static void main(String[] args) {
            // Set up Firefox driver
            WebDriverManager.firefoxdriver().setup();
            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();
            // Create the Wait object
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Open the page
            driver.get("https://v1.training-support.net/selenium/dynamic-controls");
            // Print the title of the page
            System.out.println("Home page title: " + driver.getTitle());

            // checkbox
            WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));

            //check if check box clicked
            System.out.println("Checkbox selected: " + checkbox.isSelected());

            //click checkbox
            checkbox.click();

            //check if check box clicked
            System.out.println("Checkbox selected: " + checkbox.isSelected());


            // Close the browser
            driver.close();
        }
    }


