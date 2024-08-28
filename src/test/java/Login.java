import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Methods{
    @Test(priority = 2)
    public void VerifyLogin() throws InterruptedException {
        clicksend(By.name("email"),"mark@admin.com");
        clicksend(By.name("password"),"mark");
        click(By.xpath("//*[@id=\":r0:\"]"));
        Thread.sleep(500);
        URLvalidator("https://dashboard.aqaryint.com/dashboard/default");
    }
    @Test(priority = 1)
    public void verifyinline() throws InterruptedException {
        click(By.xpath("//*[@id=\":r0:\"]"));
        InlineErrorValidator(By.xpath("//*[@id=\"standard-weight-helper-text-email-login\"]"),"Email Address / Username is Required");
        Thread.sleep(500);
        InlineErrorValidator(By.xpath("//*[@id=\"standard-weight-helper-text-password-login\"]"),"You must enter valid password");
    }
}
