import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddPromotions extends Methods {
    @Test(priority = 1)
    public void PromotionNavigate(){
        click(By.xpath("//button[normalize-space()='Projects']"));
        click(By.xpath("//p[normalize-space()='Promotions']"));
        URLvalidator("https://dashboard.aqaryint.com/dashboard/project/project_management/promotions");
    }
    @Test(priority = 2)
    public void verifyRequiredField(){
        click(By.xpath("//button[normalize-space()='Add Promotion Type']"));
        click(By.xpath("//input[@id='title']"));
        click(By.xpath("//button[normalize-space()='Submit']"));
        InlineErrorValidator(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[3]"),"Please provide a valid promotion type");
    }
    @Test(priority = 3)
    public void verifyAfterAdd(){
        clickandsend(By.xpath("//input[@id='title']"),"MarkyAutomation");
        click(By.xpath("//button[normalize-space()='Submit']"));
    }
    @Test(priority = 4)
    public void verifyExistPromo(){
        promoChecker(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]"),"MarkyAutomation");
    }
    @Test(priority = 5)
    public void verifyDelete(){
        click(By.xpath("//tbody/tr[1]/td[4]/div[1]/button[1]"));
        click(By.xpath("//button[normalize-space()='Yes']"));
        SuccessValidator(By.xpath("//div[@class='MuiBox-root css-0']//div[contains(text(),'Promotion Type Deleted successfully.')]"),"Promotion Type Deleted Successfully.");
    }
}
