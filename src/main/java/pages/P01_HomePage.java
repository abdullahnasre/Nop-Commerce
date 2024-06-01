package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class P01_HomePage {

    WebDriver driver;
    private final By currencyDropdown = By.id("customerCurrency");
    private final By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    private final By shoesLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']");
    public P01_HomePage (WebDriver driver) {
        this.driver = driver;
    }


    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(currencyDropdown));
    }

    public P01_HomePage clickApparelLink() throws InterruptedException {
        WebElement hoverAction = driver.findElement(apparelLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverAction).perform();
        Thread.sleep(2000);
        return  this;
    }

    public P08_FilterPage clickShoesLink() throws InterruptedException {
        WebElement hoverAction = driver.findElement(shoesLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverAction).click().perform();
        Thread.sleep(2000);
        return  new P08_FilterPage(driver);
    }
}
