import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenSite extends Methods {
    @Test
    public void VerifyURL(){
    driver.get("https://dashboard.aqaryint.com");
    URLvalidator("https://dashboard.aqaryint.com/");
}
}
