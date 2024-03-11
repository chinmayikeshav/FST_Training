import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Act_7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the football
        WebElement football = driver.findElement(By.id("draggable"));
        // Find the dropzone1
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        // Find the dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        // Perform drag and drop to dropzone 1
        builder.dragAndDrop(football,dropzone1).pause(1000).perform();

        java.lang.String d1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/p")).getText();

        if(d1.equals("Dropped!")){
            System.out.println("The ball dropped at dropzone1");
        }


        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(football, dropzone2).pause(1000).perform();
        java.lang.String d2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/p")).getText();

        if(d2.equals("Dropped!")){
            System.out.println("The ball dropped at dropzone2");
        }


        // Close the browser
        driver.close();
    }
}
