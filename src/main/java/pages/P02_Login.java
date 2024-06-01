package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Utility;

import java.time.Duration;

public class P02_Login {
    private WebDriver driver;

    // TODO constructor
    // TODO locators
    // TODO action methods

    public P02_Login(WebDriver driver) {
        this.driver = driver;
    }

    private final By loginLink = By.xpath("//a[text()= 'Log in']");

    private final By EmailFieldLogin = By.xpath("//input[@id='Email']");

    private final By PasswordField = By.id("Password");

    private final By loginButton = By.xpath("//button[text()='Log in']");
    private final By clickLogout = By.xpath("//a[@class='ico-logout']");
    ////button[text()='Log in']

    public P02_Login clickLogout(){
        driver.findElement(clickLogout).click();
        return this;
    }

    public P02_Login setEmail(String generatedEmail) {
        driver.findElement(EmailFieldLogin).sendKeys(generatedEmail);
        return this;
    }

    public P02_Login setPassword(String password) {
        driver.findElement(PasswordField).sendKeys(password);
        return this;
    }

    public P02_Login clickLoginTap() {
        driver.findElement(loginLink).click();
        return this;
    }

    public void clickLoginButtonWithScroll() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
    }
}
