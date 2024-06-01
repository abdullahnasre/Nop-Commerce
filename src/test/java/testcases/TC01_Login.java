package testcases;

import org.testng.annotations.Test;
import pages.P02_Login;
import util.SharedData;

public class TC01_Login extends TestBase {
    String password = "P@ssword";

    @Test
    public void checkLoginWithValidData_P() throws InterruptedException {
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


//package testcases;
//
//import org.testng.annotations.Test;
//import pages.P02_Login;
//
//import static util.Utility.RandomEmailGenerator.generateRandomEmail;
//
//public class TC01_Login extends TestBase {
//    String password = "P@ssword";
//    String generatedEmail = generateRandomEmail();
//
//    @Test
//    public void checkLoginWithValidData_P() throws InterruptedException {
//        //String generatedEmail = generateRandomEmail();  // Call the method
//        P02_Login loginPage = new P02_Login(driver);  // Pass driver instance
//        loginPage.clickLoginTap()
//                .setEmail(generatedEmail)
//                .setPassword(password)
//                .clickLoginButtonWithScroll();
//        System.out.println(generatedEmail);
//        System.out.println(password);
//    }
//}
//
