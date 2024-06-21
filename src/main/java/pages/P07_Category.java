package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static util.Utility.generateRandomIntFrom1To3;
import static util.Utility.generateRandomIntFrom1To4;

public class P07_Category {
    private final WebDriver driver;
    private final By category = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    private final By subCategory = By.cssSelector("body > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(1)");

    public P07_Category(WebDriver driver) {
        this.driver = driver;
    }

    public P07_Category hoverOnCategory() throws InterruptedException {
        Thread.sleep(1000);
        WebElement hoverAction = driver.findElement(category);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverAction).perform();
        Thread.sleep(2000);
        return this;
    }

    public P07_Category hoverOnSubcategory() throws InterruptedException {
        Thread.sleep(2000);
        WebElement hoverOnSubcategory = driver.findElement(subCategory);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOnSubcategory).click().perform();
        Thread.sleep(2000);
        return this;
    }
}
