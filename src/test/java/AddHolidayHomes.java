import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddHolidayHomes extends Methods{
    @Test
    public void addHoliday(){
        click(By.xpath("//button[normalize-space()='Projects']"));
        click(By.xpath("//*[@id=\"__next\"]/div/nav/div/div/div[2]/ul[12]/button"));
        click(By.xpath("//*[@id=\"__next\"]/div/nav/div/div/div[2]/ul[12]/div[1]/div/div/a/div/div/p"));
        URLvalidator("https://dashboard.aqaryint.com/dashboard/holiday_home/addProperty");
    }
}
