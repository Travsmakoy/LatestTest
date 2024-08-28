import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ClickDashboard extends Methods {
    @Test
    public void Click() throws InterruptedException {
        click(By.xpath("//*[@id=\"home\"]/div/div/div[1]/div/div[3]/div/div/div/div/a"));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        URLvalidator("https://dashboard.aqaryint.com/dashboard/pages/authentication/portal_registration/login");
    }
}
