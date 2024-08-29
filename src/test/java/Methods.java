import io.qameta.allure.Allure;
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
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @AfterSuite
    public void tearDownSuite() throws InterruptedException {
        // Quit the WebDriver instance
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
            System.out.println("ALL TEST COMPLETE");
        }
    }
    public void click(By locator) {
        WebElement click = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String button = click.getText();
        click.click();
        Allure.step("Successfully Clicked "+ "'"+button+"'");;
    }
    public void clickandsend(By locator, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
        Allure.step(value+" entered successfully");
    }
    public void doubleClick(By locator,By locator1){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator1)).click();
    }
    public void URLvalidator(String value){
        String ExpectedURL = value;
        Assert.assertEquals(driver.getCurrentUrl(),value);
        Allure.step("You are in correct URL "+value);
    }
    public void checkIfAdded(By locator, String value){
        WebElement promoName = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actual = promoName.getText();
        Assert.assertEquals(actual,value);
        Allure.step(value+" is showing after adding");
    }
    public void InlineErrorValidator(By locator, String expectedValue) {
        WebElement inlineError = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actual = inlineError.getText();
        Assert.assertEquals(actual, expectedValue);
        Allure.step(expectedValue+" REQUIRED FIELDS / TOAST Is showing");
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
    public void cleafield(By locator){
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        clear.clear();
    }
}