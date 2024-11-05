import io.qameta.allure.Allure;
import org.testng.annotations.Test;

public class startExecute extends Methods {
    @Test
    public void VerifyAqarySite(){
        Allure.story("As a user i want to go Aqary Website");
        driver.get("http://192.168.1.138:8080/");
    URLvalidator("https://dashboard.aqaryint.com/");
    }
}