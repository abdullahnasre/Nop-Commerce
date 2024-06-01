package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static util.Utility.generateRandomIntFrom1To3;
import static util.Utility.generateRandomIntFrom1To4;

public class P07_Category {
    private final WebDriver driver;
    //(//ul[@class='top-menu notmobile'])/li[1]
    private final By category = By.xpath("(//ul[@class='top-menu notmobile'])/li["+generateRandomIntFrom1To4()+"]");
    private final By subCategory = By.xpath("//ul[@class='sublist first-level']/li["+generateRandomIntFrom1To3()+"]");

    // TODO constructor
    // TODO locators
    // TODO action methods


    public P07_Category(WebDriver driver) {
        this.driver = driver;
    }

    public P07_Category hoverOnCategory () throws InterruptedException {
        WebElement hoverAction = driver.findElement(category);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverAction).perform();
        Thread.sleep(2000);
        return  this;
    }

    public P07_Category hoverOnSubcategory () throws InterruptedException {
        WebElement hoverOnSubcategory = driver.findElement(subCategory);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOnSubcategory).click().perform();
        Thread.sleep(2000);
        return  this;
    }
}
