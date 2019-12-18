import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jchavarr/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();

        //WebElement autocomplete = driver.findElement(By.xpath("/html/body/div/div/div/a[3]"));
        //WebElement autocomplete = driver.findElement(By.cssSelector("div.dropdown-menu.show a#autocomplete"));
        WebElement autocomplete = driver.findElement(By.cssSelector("div.dropdown-menu.show a[href*=checkbox]"));
        autocomplete.click();

        Thread.sleep(5000);

        driver.quit();
    }
}