import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class ClickDashboard extends Methods {
    @Test
    public void Click() throws InterruptedException {
        click(By.xpath("(//a[normalize-space()='Go to Dashboard'])[1]"));
        sleepThread(500);
//        SwitchTab(1);
        URLvalidator("https://dashboard.aqaryint.com/dashboard/pages/authentication/portal_registration/login");
    }
}

