package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;

public class TC05_ChangeCurrency extends TestBase{

    @Test
    public void testSelectOption() throws InterruptedException {
        String option = "Euro";
        P01_HomePage homePage = new P01_HomePage(driver);
        homePage.selectFromDropDown(option);
        Thread.sleep(3000);
    }
}
