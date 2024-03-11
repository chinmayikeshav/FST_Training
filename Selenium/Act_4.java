import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Act_4 {



        public static void main(String[] args) {
            // Setup the Firefox driver(GeckoDriver)
            WebDriverManager.firefoxdriver().setup();

            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the browser
            driver.get("https://v1.training-support.net/selenium/target-practice");

            // Perform testing and assertions
            System.out.println("Home page title : " + driver.getTitle());

// Using XPath:
            // Find the 3rd header on the page and print its text to the console
            WebElement thirdHeader = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h3"));

            System.out.println("Text of the 3rd header: " + thirdHeader.getText());

            // Find the 5th header on the page and print its color
            WebElement fifthHeader = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));

            System.out.println("Color of the 5th header: " + fifthHeader.getCssValue("color"));

            // Using any other locator:
            // Find the violet button and print all its classes
            WebElement violetButton = driver.findElement(By.xpath("//button[text()='Violet']"));

            System.out.println("Classes of the violet button: " + violetButton.getAttribute("class"));

            // Find the grey button and print its text
            WebElement greyButton = driver.findElement(By.xpath("//button[contains(text(),'Grey')]"));

            System.out.println("Text of the grey button: " + greyButton.getText());


            // Close the browser
            // Feel free to comment out the line below
            // so it doesn't close too quickly
            driver.quit();
        }

}
