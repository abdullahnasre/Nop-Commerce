package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_AddToCart {
    WebDriver driver;

    public P11_AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    private final By checkAgreeCheckbox = By.xpath("//input[@id='termsofservice']");
    private final By CheckoutButton = By.xpath("//button[@id='checkout']");

    public P11_AddToCart checkAgreeCheckbox() {
        driver.findElement(checkAgreeCheckbox).click();
        return this;
    }

    public P11_AddToCart pressCheckoutButton() {
        driver.findElement(CheckoutButton).click();
        return this;
    }

}
