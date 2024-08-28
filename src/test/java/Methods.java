import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.ArrayList;

public class Methods {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeSuite
    public void setUpSuite() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @AfterSuite
    public void tearDownSuite() throws InterruptedException {
        // Quit the WebDriver instance
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
        }
    }
    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        System.out.println("Successfully Cliked the locator "+locator);
    }
    public void clickandsend(By locator, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
        System.out.println(value+" Is entered");
    }
    public void URLvalidator(String value){
        String ExpectedURL = value;
        Assert.assertEquals(driver.getCurrentUrl(),value);
    }
    public void checkIfAdded(By locator, String value){
        WebElement promoName = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actual = promoName.getText();
        Assert.assertEquals(actual,value);
     System.out.println(value+" Is added successfully");
    }
    public void InlineErrorValidator(By locator, String expectedValue) {
        WebElement inlineError = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actual = inlineError.getText();
        Assert.assertEquals(actual, expectedValue);
        System.out.println(expectedValue+" Is showing");
    }
    public void SuccessValidator(By locator, String expectedValue) {
        WebElement success = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actual = success.getText();
        Assert.assertEquals(actual, expectedValue);
    }
    public void SwitchTab(int num){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }
    public void scrollPage(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }
    public void sleepThread(int num) throws InterruptedException {
        Thread.sleep(num);
    }
}
