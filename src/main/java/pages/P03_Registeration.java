package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_Registeration {

    WebDriver driver;


    // TODO constructor
    // TODO locators
    // TODO action methods

    public P03_Registeration(WebDriver driver) {
        this.driver = driver;
    }

    private final By RegisterLink = By.xpath("//a[text()= 'Register']");
    private final By genderMale = By.id("gender-male");
    private final By firstName = By.id("FirstName");
    private final By lastName = By.id("LastName");
    private final By datePicker = By.cssSelector("inputs.date-of-birth");
    private final By EmailField = By.xpath("//input[@id='Email']");
    private final By PasswordField = By.xpath("//input[@id='Password']");
    private final By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private final By RegisterButton = By.xpath("//button[@id='register-button']");

    public P03_Registeration clickRegisterTap() {
        driver.findElement(RegisterLink).click();
        return this;
    }

    public P03_Registeration checkGender() {
        driver.findElement(genderMale).click();
        return this;
    }

    public P03_Registeration setFirstName(String getRandomFirstName) {
        driver.findElement(firstName).sendKeys(getRandomFirstName);
        return this;
    }

    public P03_Registeration setLastName(String getRandomFirstName) {
        driver.findElement(lastName).sendKeys(getRandomFirstName);
        return this;
    }

    public P03_Registeration setEmail(String generateRandomEmail) {
        driver.findElement(EmailField).sendKeys(generateRandomEmail);
        return this;
    }

    public P03_Registeration setPasswordField(String password) {
        driver.findElement(PasswordField).sendKeys(password);
        return this;
    }

    public P03_Registeration setConfirmPasswordField(String password) {
        driver.findElement(ConfirmPassword).sendKeys(password);
        return this;
    }

    public P03_Registeration clickRegisterButton() {
        driver.findElement(RegisterButton).click();
        return this;
    }
}
