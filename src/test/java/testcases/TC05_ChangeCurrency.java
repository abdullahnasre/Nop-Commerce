package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;

public class TC05_ChangeCurrency extends TestBase{

    @Test
    public void checkTestSelectOption() throws InterruptedException {
        String option = "Euro";
        P01_HomePage homePage = new P01_HomePage(driver);
        homePage.selectFromDropDown(option);
        Thread.sleep(3000);

        // Assert that the currency has been changed to Euro
        String selectedCurrency = homePage.getSelectedCurrency();
        Assert.assertEquals(selectedCurrency, option, "Currency not changed to Euro");
    }
}
