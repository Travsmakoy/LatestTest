import io.qameta.allure.Allure;
import org.testng.annotations.Test;

public class startExecute extends Methods {
    @Test
    public void VerifyAqarySite(){
        Allure.story("As a user i want to go Aqary Website");
        driver.get("https://dashboard.aqaryint.com");
    URLvalidator("https://dashboard.aqaryint.com/");
    }
}
