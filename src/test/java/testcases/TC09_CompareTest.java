package testcases;

import org.testng.annotations.Test;
import pages.P06_SearchPage;
import pages.P10_ComparePage;

public class TC09_CompareTest extends TestBase {

    String searchInput = "Apple MacBook Pro 13-inch";
    String searchInput2 = "Asus N551JK-XO076H Laptop";

    @Test
    public void checkCompareProducts() throws InterruptedException {
        P06_SearchPage searchPage = new P06_SearchPage(driver);
        P10_ComparePage comparePage = new P10_ComparePage(driver);
        Thread.sleep(Long.parseLong("3000"));
        searchPage.setSearchInput(searchInput).pressSearchButton().clickAddCompareButton();
        searchPage.setSearchInput(searchInput2).pressSearchButton().clickAddCompareButton();
        comparePage.clickProductCompareLink();
        Thread.sleep(Long.parseLong("3000"));
        comparePage.clearList();
        Thread.sleep(Long.parseLong("3000"));
    }
}
