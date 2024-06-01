package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_ComparePage {
    WebDriver driver;
    private final By clearListLink = By.cssSelector("a.clear-list");
    private final By productCompareLink = By.xpath("//a[normalize-space()='product comparison']");
    private final By compareTable = By.xpath("//h1[text()='Compare products']");
    public P10_ComparePage(WebDriver driver) {
        this.driver = driver;
    }

    public P10_ComparePage clearList(){
        driver.findElement(clearListLink).click();
        return this;
    }

    public P10_ComparePage clickProductCompareLink() {
        driver.findElement(productCompareLink).click();
        return new P10_ComparePage(driver);
    }
}
