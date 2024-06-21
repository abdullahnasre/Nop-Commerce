package testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.P06_SearchPage;

import java.util.List;


public class TC04_Search extends TestBase {
    String searchInput = "Apple MacBook Pro 13-inch";
    //String searchInput2 = "Asus N551JK-XO076H Laptop";

    @Test
    public void checkSearchFunction() throws InterruptedException {
        P06_SearchPage searchPage = new P06_SearchPage(driver);
        Thread.sleep(2000);
        searchPage.setSearchInput(searchInput).pressSearchButton();
        //searchPage.setSearchInput(searchInput2).pressSearchButton();


        // Assert that search results contain the expected product
        List<WebElement> productTitles = searchPage.getProductTitles();
        boolean isProductFound = productTitles.stream().anyMatch(title -> title.getText().contains(searchInput));
        Assert.assertTrue(isProductFound, "Expected product not found in the search results for: " + searchInput);
    }
}
