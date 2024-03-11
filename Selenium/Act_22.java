import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Act_22 {

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Open the page
        driver.get("https://v1.training-support.net/selenium/popups");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        System.out.println();

        WebElement sign = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/button"));
        Actions action = new Actions(driver);

        // hover over
        action.moveToElement(sign).perform();
        String mess= sign.getAttribute("data-tooltip");
        System.out.println("The pop message is "+mess);

        //click the button
        sign.click();

        WebElement user = driver.findElement(By.id("username"));
        WebElement pass = driver.findElement(By.id("password"));
        user.sendKeys("admin");
        pass.sendKeys("password");

        WebElement but = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        but.click();

        WebElement m = driver.findElement(By.id("action-confirmation"));
        System.out.println("The log in message is "+m.getText());



        // Close the browser
        driver.quit();

    }

}
