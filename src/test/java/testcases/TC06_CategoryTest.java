package testcases;

import org.testng.annotations.Test;
import pages.P02_Login;
import pages.P07_Category;
import util.Utility;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;

public class TC06_CategoryTest extends TestBase{
    String password = "P@ssword";
    static String generatedEmail = generateRandomEmail();

    @Test
    public void checkHoverOnCategory() throws InterruptedException {
        generatedEmail = generateRandomEmail();
        P07_Category category = new P07_Category(driver);
//        P02_Login login = new P02_Login(driver);
//        login.setEmail( Utility.SharedData.generatedEmail).setPassword( Utility.SharedData.password).clickLoginButtonWithScroll();
        System.out.println(generatedEmail);
        category.hoverOnCategory().hoverOnSubcategory();
    }
}
