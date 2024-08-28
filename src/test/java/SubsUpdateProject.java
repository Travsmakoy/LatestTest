import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SubsUpdateProject extends Methods {
    @Test(priority = 1)
    public void goLocalproject(){
        click(By.xpath("//p[normalize-space()='Local Projects']"));
        URLvalidator("https://dashboard.aqaryint.com/dashboard/project/project_management/local");
    }
    @Test(priority = 2)
    public void UpdateSubs(){
        click(By.xpath("(//div[@id='CompanyStatusCheckBox'])[1]"));
    }
}
