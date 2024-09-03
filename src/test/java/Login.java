import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Methods{
    @Test(priority = 3)
    public void VerifyLogin() throws InterruptedException {
        clickandsend(By.name("email"),"mark@admin.com");
        clickandsend(By.name("password"),"mark");
        click(By.xpath("//*[@id=\":r0:\"]"));
        sleepThread(500);
        URLvalidator("https://dashboard.aqaryint.com/dashboard/default");
    }
    @Test(priority = 1)
    public void verifyinlineEmail() throws InterruptedException {
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
        InlineErrorValidator(By.xpath("//*[@id=\"standard-weight-helper-text-email-login\"]"),"Email Address / Username is Required");
    }
    @Test(priority = 2)
    public void verifyinlinePass(){
        InlineErrorValidator(By.xpath("//*[@id=\"standard-weight-helper-text-password-login\"]"),"You must enter valid password");
    }
}