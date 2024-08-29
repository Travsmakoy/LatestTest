import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddHolidayHomes extends Methods{
    @Test(priority = 1)
    public void verifyField(){
        scrollPage(500);
        click(By.xpath("//button[normalize-space()='Submit']"));
        InlineErrorValidator(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-kyse2m']//div[contains(text(),'Missing Fields')]"),"Missing Fields");
    }
    @Test(priority = 2)
    public void addStay() throws InterruptedException {
        sleepThread(100);
    doubleClick(By.xpath("//input[@id='holidayHomeType']"),By.xpath("//li[@id='holidayHomeType-option-0']"));
    cleafield(By.xpath("//input[@id='en_title']"));
    clickandsend(By.xpath("//input[@id='en_title']"),"MarkAutomate");
    doubleClick(By.xpath("//input[@id='stay_category']"),By.xpath("//li[@id='stay_category-option-0']"));
    clickandsend(By.xpath("//input[@id='no_of_room']"),"10");
    clickandsend(By.xpath("//input[@id='price_night']"),"5");
    clickandsend(By.xpath("//input[@id='no_bathroom']"),"2");
    doubleClick(By.xpath("//input[@id='no_views']"),By.xpath("//li[@id='no_views-option-0']"));
    doubleClick(By.xpath("//input[@id='stay_package']"),By.xpath("//li[@id='stay_package-option-0']"));
}
    @Test(priority = 3)
public void addExp(){
    doubleClick(By.xpath("//input[@id='holidayHomeType']"),By.xpath("//li[@id='holidayHomeType-option-1']"));
    cleafield(By.xpath("//input[@id='en_title']"));
    clickandsend(By.xpath("//input[@id='en_title']"),"MarkAutomate");
    doubleClick(By.xpath("//input[@id='experience_category']"),By.xpath("//li[@id='experience_category-option-0']"));
    clickandsend(By.xpath("//input[@id='no_of_hours']"),"10");
    clickandsend(By.xpath("//input[@id='price_person']"),"500");
    doubleClick(By.xpath("//input[@id='experience_package']"),By.xpath("//li[@id='experience_package-option-0']"));
    scrollPage(550);
}
}
