package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_FilterPage {
    WebDriver driver;
    private final By shoesFilter = By.xpath("//input[@id='attribute-option-15']");
    public P08_FilterPage(WebDriver driver) {
        this.driver = driver;
    }

    public P08_FilterPage clickFiltercheckBox(){
        driver.findElement(shoesFilter).click();
        return this;
    }
}
