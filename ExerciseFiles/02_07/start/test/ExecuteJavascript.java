import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jchavarr/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        modalButton.click();
        WebElement closeButton = driver.findElement(By.id("close-button"));
        Thread.sleep(3000);

        js.executeScript("arguments[0].click();", closeButton);
        Thread.sleep(3000);

        driver.quit();
    }
}
