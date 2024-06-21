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
    private final By continueButton = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");
    private final By cityTextField = By.xpath("//input[@id='BillingNewAddress_City']");
    private final By addressTextField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    private final By postalCodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private final By phoneField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private final By shippingMethodButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private final By paymentMethodButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    private final By paymentInfoButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private final By confirmOrder = By.xpath("//button[normalize-space()='Confirm']");
    private final By successMsgOrder = By.xpath("//a[@class='ico-logout']");
    private final By continueAfterOrder = By.xpath("//button[normalize-space()='Continue']");

    public P12_CreateOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromCountrtyDropdown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(countryDropdown));
    }

    public P12_CreateOrder setCityField(String cityname) {
        driver.findElement(cityTextField).sendKeys(cityname);
        return this;
    }

    public P12_CreateOrder setAddressField(String addressField) {
        driver.findElement(addressTextField).sendKeys(addressField);
        return this;
    }

    public P12_CreateOrder setPostalField(String postalField) {
        driver.findElement(postalCodeField).sendKeys(postalField);
        return this;
    }

    public P12_CreateOrder setPhoneField(String phonenumber) {
        driver.findElement(phoneField).sendKeys(phonenumber);
        return this;
    }

    public P12_CreateOrder pressContinueButton() {
        driver.findElement(continueButton).click();
        return this;
    }

    public P12_CreateOrder pressShippingContinueButton() {
        driver.findElement(shippingMethodButton).click();
        return this;
    }

    public P12_CreateOrder presspaymentButton() {
        driver.findElement(paymentMethodButton).click();
        return this;
    }

    public P12_CreateOrder pressPaymentInfoButton() {
        driver.findElement(paymentInfoButton).click();
        return this;
    }

    public P12_CreateOrder pressConfirmOrderButton() {
        driver.findElement(confirmOrder).click();
        return this;
    }

    public boolean verifySuccessMsgOrder(String successmsg) throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(successMsgOrder).getText().contains(successmsg);
    }


    public void pressContinueAfterOrder() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(continueAfterOrder).click();
    }

    public P12_CreateOrder setFirstName() {
        driver.findElement(firstName).sendKeys();
        return this;
    }

    public P12_CreateOrder setlastName() {
        driver.findElement(lastName).sendKeys();
        return this;
    }

    public P12_CreateOrder setEmailField() {
        driver.findElement(emailField).sendKeys();
        return this;
    }


    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

}
