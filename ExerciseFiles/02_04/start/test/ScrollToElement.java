import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jchavarr/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fullName);

        fullName.click();
        fullName.sendKeys("JeanCarlos Chavarria Hughes");

        date.click();
        date.sendKeys("02/19/1992");

        Thread.sleep(1000);
        driver.quit();
    }
}
