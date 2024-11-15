import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;

public class AddHolidayHomes extends Methods{

    @Test(priority = 1)
    public void verifyField(){
        scrollPage(500);
        click(By.xpath("//button[normalize-space()='Submit']"));
        InlineErrorValidator(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-kyse2m']//div[contains(text(),'Missing Fields')]"),"Missing Fields");
    }
    @Test(priority = 2)
    public void addStay() throws InterruptedException {
    Allure.story("As a user i can add Holiday Home Stay");
    sleepThread(100);
    doubleClick(By.xpath("//input[@id='holidayHomeType']"),By.xpath("//li[@id='holidayHomeType-option-0']"));
    clearfield(By.xpath("//input[@id='en_title']"));
    clickandsend(By.xpath("//input[@id='en_title']"),"MarkAutomate");
    doubleClick(By.xpath("//input[@id='stay_category']"),By.xpath("//li[@id='stay_category-option-0']"));
    clickandsend(By.xpath("//input[@id='no_of_room']"),"10");
    clickandsend(By.xpath("//input[@id='price_night']"),"5");
    clickandsend(By.xpath("//input[@id='no_bathroom']"),"2");
    doubleClick(By.xpath("//input[@id='no_views']"),By.xpath("//li[@id='no_views-option-0']"));
    click(By.xpath("//li[@id='no_views-option-1']"));
    click(By.xpath("//li[@id='no_views-option-2']"));
    doubleClick(By.xpath("//input[@id=':R2ldala59uuul9vcq:']"),By.xpath("//li[@id=':R2ldala59uuul9vcq:-option-0']"));
    click(By.xpath("//li[@id='stay_package-option-1']"));
    click(By.xpath("//li[@id='stay_package-option-2']"));
}
    @Test(priority = 3)
    public void addExp(){
    Allure.story("As a user i can add Holiday Home Experience");
    doubleClick(By.xpath("//input[@id='holidayHomeType']"),By.xpath("//li[@id='holidayHomeType-option-1']"));
    clearfield(By.xpath("//input[@id='en_title']"));
    clickandsend(By.xpath("//input[@id='en_title']"),"MarkAutomate");
    doubleClick(By.xpath("//input[@id='experience_category']"),By.xpath("//li[@id='experience_category-option-0']"));
    click(By.xpath("//li[@id='experience_category-option-1']"));
    clickandsend(By.xpath("//input[@id='no_of_hours']"),"10");
    clickandsend(By.xpath("//input[@id='price_person']"),"500");
    doubleClick(By.xpath("//input[@id='experience_package']"),By.xpath("//li[@id='experience_package-option-0']"));
    click(By.xpath("//li[@id='experience_package-option-1']"));
    click(By.xpath("//li[@id='experience_package-option-2']"));
    click(By.xpath("//li[@id='experience_package-option-3']"));
    scrollPage(550);
}
    @Test(priority = 4)
    public void addLocation(){
        Allure.story("As a user i can add Location while adding Holiday Home");
        doubleClick(By.xpath("//input[@id='locationCountrySelect']"),By.xpath("//li[@id='locationCountrySelect-option-0']"));
        doubleClick(By.xpath("//input[@id='locationState']"),By.xpath("//li[@id='locationState-option-0']"));
        doubleClick(By.xpath("//input[@id='locationCitySelector']"),By.xpath("//li[@id='locationCitySelector-option-0']"));
        doubleClick(By.xpath("//input[@id='locationCommunity']"),By.xpath("//li[@id='locationCommunity-option-0']"));
        doubleClick(By.xpath("//input[@id='locationSubCommunity']"),By.xpath("//li[@id='locationSubCommunity-option-0']"));
        scrollPage(500);
    }
}