package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_Wishlist {
    WebDriver driver;
    private final By updateWishList = By.xpath("//button[@id='updatecart']");


    public P09_Wishlist(WebDriver driver) {
        this.driver = driver;

    }

    public P09_Wishlist clickUpdateButton() {
        driver.findElement(updateWishList).click();
        return this;
    }
}
