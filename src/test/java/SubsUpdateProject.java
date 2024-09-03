import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SubsUpdateProject extends Methods {
    @Test(priority = 1)
    public void goLocalproject(){
        click(By.xpath("//p[normalize-space()='Local Projects']"));
        URLvalidator("https://dashboard.aqaryint.com/dashboard/project/project_management/local");
    }
    @Test(priority = 2)
    public void GoHoliday(){
        click(By.xpath("//button[normalize-space()='Projects']"));
        click(By.xpath("//*[@id=\"__next\"]/div/nav/div/div/div[2]/ul[12]/button"));
        click(By.xpath("//*[@id=\"__next\"]/div/nav/div/div/div[2]/ul[12]/div[1]/div/div/a/div/div/p"));
    }
}