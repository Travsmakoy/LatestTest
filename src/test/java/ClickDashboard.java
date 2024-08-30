import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class ClickDashboard extends Methods {
    @Test
    public void Click() throws InterruptedException {
        click(By.xpath("//*[@id=\"home\"]/div/div/div[1]/div/div[3]/div/div/div/div/a"));
        sleepThread(250);
        SwitchTab(1);
        URLvalidator("https://dashboard.aqaryint.com/dashboard/pages/authentication/portal_registration/login");
    }
}
