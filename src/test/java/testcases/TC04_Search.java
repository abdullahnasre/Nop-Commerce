package testcases;

import org.testng.annotations.Test;
import pages.P02_Login;
import pages.P06_SearchPage;


public class TC04_Search extends TestBase {
    String searchInput = "Apple MacBook Pro 13-inch";
    String searchInput2 = "Asus N551JK-XO076H Laptop";

    String password = "P@ssword";
    String email = "samo@samo.com";

    @Test
    public void checkSearchFunction() throws InterruptedException {
        //String generatedEmail = generateRandomEmail();  // Call the method
        //P02_Login login = new P02_Login(driver);
        P06_SearchPage searchPage = new P06_SearchPage(driver);
        searchPage.clickLoginTap().setEmail(email).setPassword(password).clickLoginButtonWithScroll();
        Thread.sleep(Long.parseLong("3000"));
        searchPage.setSearchInput(searchInput).pressSearchButton();
        searchPage.setSearchInput(searchInput2).pressSearchButton();
    }
}
