package testcases;

import org.testng.annotations.Test;
import pages.P06_SearchPage;
import pages.P09_Wishlist;

public class TC08_AddProductToWishlistTest extends TestBase{
    @Test
    public void checkAddTowishlist(){
        P09_Wishlist wishlist = new P09_Wishlist(driver);
        P06_SearchPage searchPage = new P06_SearchPage(driver);
        String searchInput = "Apple MacBook Pro 13-inch";

        searchPage.setSearchInput(searchInput).pressSearchButton().clickWishListButton().clickWishListLink();
        wishlist.clickUpdateButton();
    }
}
