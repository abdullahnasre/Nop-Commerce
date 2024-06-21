package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_ForgetPassword {
    WebDriver driver;

    public P04_ForgetPassword(WebDriver driver) {
        this.driver = driver;
    }

    private final By LoginLink = By.xpath("//a[text()= 'Log in']");
    private final By EmailField = By.id("Email");
    private final By ForgotPasswordLink = By.xpath("//a[text() = 'Forgot password?']");
    private final By PasswordRecoveryText = By.xpath("//h1[normalize-space()='Password recovery']");

    public P04_ForgetPassword clickLoginLink() {
        driver.findElement(LoginLink).click();
        return this;
    }

    public P04_ForgetPassword setEmail(String email) {
        driver.findElement(EmailField).sendKeys(email);
        return this;
    }

    public P05_PasswordRecovery clickForgetPassword() {
        driver.findElement(ForgotPasswordLink).click();
        return new P05_PasswordRecovery(driver);
    }

    public boolean verifyPasswordRecover(String passwordText) {
        return driver.findElement(PasswordRecoveryText).getText().contains(passwordText);
    }
}
