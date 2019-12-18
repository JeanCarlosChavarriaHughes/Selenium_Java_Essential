import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jchavarr/Documents/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        // The objective is fill the form with valid data
        // Getting Form Elements
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement jobTitle = driver.findElement(By.id("job-title"));

        WebElement educationLevel1 = driver.findElement(By.id("radio-button-1"));
        WebElement educationLevel2 = driver.findElement(By.id("radio-button-2"));
        WebElement educationLevel3 = driver.findElement(By.id("radio-button-3"));

        WebElement sexOption1 = driver.findElement(By.id("checkbox-1"));
        WebElement sexOption2 = driver.findElement(By.id("checkbox-2"));
        WebElement sexOption3 = driver.findElement(By.id("checkbox-3"));

        WebElement experience1 = driver.findElement(By.cssSelector("option[value='1']"));
        WebElement experience2 = driver.findElement(By.cssSelector("option[value='2']"));
        WebElement experience3 = driver.findElement(By.cssSelector("option[value='3']"));
        WebElement experience4 = driver.findElement(By.cssSelector("option[value='4']"));

        WebElement datepicker = driver.findElement(By.id("datepicker"));

        WebElement submitButton = driver.findElement(By.cssSelector("div.col-sm-4.col-sm-offset-2 a.btn.btn-lg.btn-primary"));

        // Fill the form
        firstName.sendKeys("JEANCARLOS");
        lastName.sendKeys("CHAVARRIA HUGHES");
        jobTitle.sendKeys("Software Quality Assurance Engineer II");
        educationLevel3.click(); //grad school
        sexOption1.click(); //male
        experience3.click(); //5-9 years
        datepicker.click();
        datepicker.sendKeys("02/19/1992");
        datepicker.sendKeys(Keys.RETURN);

        submitButton.click();

        //Thread.sleep(5000);
        WebDriverWait wait10 = new WebDriverWait(driver, 10);
        WebElement alert = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        String expectedText = "The form was successfully submitted!";
        String actualText = alert.getText();

        assertEquals(expectedText, actualText);

        driver.quit();
    }
}
