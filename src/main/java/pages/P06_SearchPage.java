package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_SearchPage extends P02_Login {
    WebDriver driver;

    public P06_SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private final By searchField = By.cssSelector("input.search-box-text.ui-autocomplete-input");
    private final By productList = By.id("ui-id-1");
    private final By productTitles = By.xpath("//h1[normalize-space()='Apple MacBook Pro 13-inch']");
    private final By wishListButton = By.xpath("//button[@id='add-to-wishlist-button-4']");
    private final By wishListLink = By.xpath("//a[text()='wishlist']");
    private final By addTOCompareList = By.cssSelector("div[class='compare-products'] button[type='button']");
    private final By AddToCart = By.xpath("//button[@id='add-to-cart-button-4']");
    private final By AddToShoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    public P06_SearchPage setSearchInput(String searchInput) {
        driver.findElement(searchField).sendKeys(searchInput);
        return this;
    }

    public P06_SearchPage pressSearchButton() {
        driver.findElement(productList).click();
        return this;
    }

    public P06_SearchPage clickWishListButton() {
        driver.findElement(wishListButton).click();
        return this;
    }

    public P09_Wishlist clickWishListLink() {
        driver.findElement(wishListLink).click();
        return new P09_Wishlist(driver);
    }

    public P06_SearchPage clickAddCompareButton() {
        driver.findElement(addTOCompareList).click();
        return this;
    }


    public P10_ComparePage clickProductCompareLink() {
        return new P10_ComparePage(driver);
    }

    public List<WebElement> getProductTitles() {
        return driver.findElements(productTitles);
    }

    public P06_SearchPage AddToCartButton() {
        driver.findElement(AddToCart).click();
        return this;
    }

    public P11_AddToCart AddToCartLink() {
        driver.findElement(AddToShoppingCartLink).click();
        return new P11_AddToCart(driver);
    }
}

