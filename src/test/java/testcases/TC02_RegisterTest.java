package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P03_Registeration;

import static pages.PageBase.captureScreenshot;
import static util.Utility.RandomEmailGenerator.generateRandomEmail;
import static util.Utility.getRandomFirstName;

public class TC02_RegisterTest extends TestBase {
    String password = "P@ssword";
    String generatedEmail = generateRandomEmail();  // Generate the email
    String generatedName = getRandomFirstName();
    String Successmsg = "Your registration completed";

    @Test
    public void checkRegisterWithValidData_P() {

        P03_Registeration registeration = new P03_Registeration(driver);
        registeration.clickRegisterTap().checkGender().setFirstName(generatedName);
        // TODO: screenshot after action before assertion
        captureScreenshot(driver, "register name");
        new P03_Registeration(driver).setLastName(generatedName)
                .setEmail(generatedEmail).setPasswordField(password).setConfirmPasswordField(password).clickRegisterButton();
        Assert.assertTrue(new P03_Registeration(driver).verifySuccessmessage(Successmsg));
        System.out.println(generatedEmail);
        System.out.println(password);
        // TODO: Capture screenshot after successful registration
        // TODO: screenshot after action before assertion
        captureScreenshot(driver, "register Positive");

        Assert.assertTrue(new P03_Registeration(driver).verifySuccessmessage("Your registration completed"), "not completed");
    }
}

