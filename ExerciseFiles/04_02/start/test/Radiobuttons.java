import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jchavarr/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        // Select the 3 radio buttons
        // wait some seconds before passing from 1 to 2 and 3.

        WebElement radioButton1  =  driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        Thread.sleep(2000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value=option2]"));
        radioButton2.click();

        Thread.sleep(2000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
