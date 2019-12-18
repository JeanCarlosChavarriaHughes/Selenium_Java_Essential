import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jchavarr/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //Windows handles are represented by string id in the browser.
        String originalHandle = driver.getWindowHandle();

        WebElement button = driver.findElement(By.id("new-tab-button"));
        button.click();

        // This for exemplifies how to move to another windows tab
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(originalHandle);
        }

        // This switchTo exemplifies how to move to the original tab.
        driver.switchTo().window(originalHandle);

        Thread.sleep(5000);
        driver.quit();
    }
}
