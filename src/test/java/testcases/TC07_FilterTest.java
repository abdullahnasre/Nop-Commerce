package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P08_FilterPage;

public class TC07_FilterTest extends TestBase {
    @Test
    public void checkFilterBox() throws InterruptedException {
        P01_HomePage homePage = new P01_HomePage(driver);
        P08_FilterPage filterPage = new P08_FilterPage(driver);

        homePage.clickApparelLink().clickShoesLink();
        filterPage.clickFiltercheckBox();
        Thread.sleep(2000);
    }
}
