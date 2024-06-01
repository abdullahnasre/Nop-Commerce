package testcases;

import org.testng.annotations.Test;
import pages.P06_SearchPage;
import pages.P11_AddToCart;

public class TC10_CheckoutTest extends TestBase {
    String searchInput = "Apple MacBook Pro 13-inch";

    @Test
    public void CheckCheckoutButton(){
        P06_SearchPage searchPage = new P06_SearchPage(driver);
        P11_AddToCart addToCart = new P11_AddToCart(driver);

        searchPage.setSearchInput(searchInput).pressSearchButton().AddToCartButton().AddToCartLink();
        addToCart.checkAgreeCheckbox().pressCheckoutButton();
    }
}
