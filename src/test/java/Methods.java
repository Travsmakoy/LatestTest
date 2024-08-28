import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Methods {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeSuite
    public void setUpSuite() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @AfterSuite
    public void tearDownSuite() throws InterruptedException {
        // Quit the WebDriver instance
        if (driver != null) {
            Thread.sleep(3000);
            driver.quit();
        }
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void clicksend(By locator, String value) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(value);
    }
    public void URLvalidator(String value){
        String ExpectedURL = value;
        Assert.assertEquals(driver.getCurrentUrl(),value);
    }
    public void InlineErrorValidator(By locator, String expectedValue) {
        WebElement inlineError = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actual = inlineError.getText();
        Assert.assertEquals(actual, expectedValue);
    }


    private void scrollPage(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }
}
