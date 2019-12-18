import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jchavarr/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileuploadfield = driver.findElement(By.id("file-upload-field"));
        fileuploadfield.sendKeys("file-to-upload.png");

        //WebElement chooseButton = driver.findElement(By.cssSelector("div.input-group.input-file span[0] button.btn.btn-secondary.btn-choose"));
        //chooseButton.click();
        //driver.close();
        //fileuploadfield.sendKeys("file-to-upload.png");

        //ebElement resetButton = driver.findElement(By.cssSelector("div.input-group.input-file span[1] button.btn.btn-warning.btn-reset"));
        //resetButton.click();

        driver.quit();
    }
}
