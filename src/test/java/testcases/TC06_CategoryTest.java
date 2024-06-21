package testcases;

import org.testng.annotations.Test;
import pages.P02_Login;
import pages.P07_Category;
import util.Utility;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;

public class TC06_CategoryTest extends TestBase{
    static String generatedEmail = generateRandomEmail();

    @Test
    public void checkHoverOnCategory() throws InterruptedException {
        generatedEmail = generateRandomEmail();
        P07_Category category = new P07_Category(driver);
        System.out.println(generatedEmail);
        category.hoverOnCategory().hoverOnSubcategory();
    }
}
