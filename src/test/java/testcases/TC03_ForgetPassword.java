package testcases;

import org.testng.annotations.Test;
import pages.P04_ForgetPassword;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;

public class TC03_ForgetPassword extends TestBase {

    @Test
    public void checkLoginWithValidData_P() throws InterruptedException {
        String generatedEmail = generateRandomEmail();  // Call the method
        P04_ForgetPassword forgetPassword = new P04_ForgetPassword(driver);  // Pass driver instance
        forgetPassword.clickLoginLink().setEmail(generatedEmail).clickForgetPassword().setEmailAddress(generatedEmail).clickRecoverButton();
    }
}
