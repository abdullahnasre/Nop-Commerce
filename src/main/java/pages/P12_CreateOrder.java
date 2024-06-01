package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class P12_CreateOrder {
    WebDriver driver;
    private final By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    private final By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    private final By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    private final By countryDropdown = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]");
    public P12_CreateOrder(WebDriver driver) {
        this.driver = driver;
    }

    public P12_CreateOrder setFirstName (){
        driver.findElement(firstName).sendKeys("abdullah");
        return this;
    }

    public P12_CreateOrder setlastName (){
        driver.findElement(lastName).sendKeys("abdullah");
        return this;
    }

    public P12_CreateOrder setEmailField (){
        driver.findElement(emailField).sendKeys("abdullah");
        return this;
    }

    public void selectFromCountrtyDropdown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(countryDropdown));
    }


}
