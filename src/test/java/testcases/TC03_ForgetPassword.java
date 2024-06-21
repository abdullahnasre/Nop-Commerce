package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_Login;
import pages.P04_ForgetPassword;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;

public class TC03_ForgetPassword extends TestBase {

    @Test
    public void checkForgetPassword_P() {
        String generatedEmail = generateRandomEmail();
        String passwordText = "Password recovery"; // Call the method
        P04_ForgetPassword forgetPassword = new P04_ForgetPassword(driver);  // Pass driver instance
        forgetPassword.clickLoginLink().setEmail(generatedEmail).clickForgetPassword().setEmailAddress(generatedEmail).clickRecoverButton();
        Assert.assertTrue(new P04_ForgetPassword(driver).verifyPasswordRecover(passwordText), "not success");
    }
}
