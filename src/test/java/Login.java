import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Methods{
    @Test
    public void VerifyLogin() throws InterruptedException {
        clicksend(By.name("email"),"mark@admin.com");
        clicksend(By.name("password"),"mark");
        click(By.xpath("//*[@id=\":r0:\"]"));
        Thread.sleep(1000);
        URLvalidator("https://dashboard.aqaryint.com/dashboard/default");
    }
}
