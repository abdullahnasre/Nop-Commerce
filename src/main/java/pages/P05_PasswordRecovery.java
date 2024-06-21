package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_PasswordRecovery {
    private final WebDriver driver;
    private final By emailAddress = By.xpath("(//input)[3]");
    private final By recoverButton = By.xpath("//button[text()='Recover']");

    public P05_PasswordRecovery(WebDriver driver) {
        this.driver = driver;
    }

    public P05_PasswordRecovery setEmailAddress(String email) {
        driver.findElement(emailAddress).sendKeys(email);
        return this;
    }

    public P05_PasswordRecovery clickRecoverButton() {
        driver.findElement(recoverButton).click();
        return this;
    }
}
