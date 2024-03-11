import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Act_6 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Home page title : " + driver.getTitle());
        System.out.println();
        Actions actions = new Actions(driver);

        // Perform the keypress event for the first letter of your name in caps
        actions.sendKeys("C").perform();
        System.out.println(driver.findElement(By.id("keyPressed")).getText());

        // Perform CTRL+a to select all text
        actions.keyDown(Keys.CONTROL).sendKeys("a").perform();

        // Perform CTRL+c to copy the selected text
        actions.keyDown(Keys.CONTROL).sendKeys("c").perform();
        driver.quit();
    }
}


