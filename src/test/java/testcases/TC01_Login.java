package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_Login;
import pages.P03_Registeration;
import util.SharedData;

import static util.Utility.getRandomFirstName;

public class TC01_Login extends TestBase {
    String password = "P@ssword";
    String generatedName = getRandomFirstName();
    // Retrieve the email from SharedData
    String generatedEmail = SharedData.sharedEmail;
    String fakeName = faker.name().fullName();
    String Email = faker.internet().emailAddress();
    String fakeAddress = faker.address().fullAddress();
    String WelcomeText = "Welcome to our store";

    @Test
    public void checkLoginWithValidData_P() throws InterruptedException {

        P02_Login loginPage = new P02_Login(driver);  // Pass driver instance
        loginPage.clickLoginTap()
                .setEmail(generatedEmail)
                .setPassword(password)
                .clickLoginButtonWithScroll();

        System.out.println(generatedEmail);
        System.out.println(password);

        Assert.assertTrue(new P02_Login(driver).verifySuccessMessage("Welcome to our store"), "not success");
    }

    @Test(priority = 2, description = "")
    public void dataDriven() throws InterruptedException {
        // Retrieve the email from SharedData
        String generatedEmail = SharedData.sharedEmail;

        P02_Login loginPage = new P02_Login(driver);  // Pass driver instance
        loginPage.clickLoginTap()
                .setEmail(generatedEmail)
                .setPassword(password)
                .clickLoginButtonWithScroll();

        System.out.println(generatedEmail);
        System.out.println(password);
    }
}