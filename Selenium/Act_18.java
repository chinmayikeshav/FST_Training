import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Act_18 {

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/selects");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // dropdown
        WebElement dd = driver.findElement(By.id("multi-select"));

        Select mulSel = new Select(dd);

        // Select the javascript option using visible text
        mulSel.selectByVisibleText("Javascript");

        List<WebElement> options = mulSel.getAllSelectedOptions();
        System.out.println("Options selected visible text: ");
        int i =1;
        for(WebElement option : options) {
            System.out.println(i+". "+option.getText());
            i++;
        }

        System.out.println();
        // Select 4,5,6 th index option
        for(i=4;i<=6;i++){
            mulSel.selectByIndex(i);

        }
        options = mulSel.getAllSelectedOptions();
        System.out.println("Options selected visible and index: ");
        i =1;
        for(WebElement option : options) {
            System.out.println(i+". "+option.getText());
            i++;
        }

        System.out.println();
        // Select NodeJs using value attribute
        mulSel.selectByValue("node");
        options = mulSel.getAllSelectedOptions();
        System.out.println("All options selected visible index and value: ");
        i =1;
        for(WebElement option : options) {
            System.out.println(i+". "+option.getText());
            i++;
        }


        System.out.println();
        // Deselect the 5th index option
        mulSel.deselectByIndex(5);

        //print the option again
        options = mulSel.getAllSelectedOptions();
        i =1;
        System.out.println("Selected options are after deselect: ");
        for(WebElement option : options) {
            System.out.println(i+". "+option.getText());
            i++;
        }



        // Close the browser
        driver.quit();
    }

}
