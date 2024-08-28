import org.testng.Assert;
import org.testng.annotations.Test;

public class startExecute extends Methods {
    @Test
    public void VerifyAqarySite(){
    driver.get("https://dashboard.aqaryint.com");
    URLvalidator("https://dashboard.aqaryint.com/");
    }
}
