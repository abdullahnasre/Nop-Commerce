package testcases;

import org.testng.annotations.Test;
import pages.P03_Registeration;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;
import static util.Utility.getRandomFirstName;

public class TC02_RegisterTest extends TestBase {
    String password = "P@ssword";
    String generatedEmail = generateRandomEmail();  // Generate the email
    String generatedName = getRandomFirstName();

    @Test
    public void checkRegisterWithValidData_P() throws InterruptedException {

        P03_Registeration registeration = new P03_Registeration(driver);
        registeration.clickRegisterTap().checkGender().setFirstName(generatedName).setLastName(generatedName)
                .setEmail(generatedEmail).setPasswordField(password).setConfirmPasswordField(password).clickRegisterButton();
        System.out.println(generatedEmail);
        System.out.println(password);
    }
}


//package testcases;
//
//import org.testng.annotations.Test;
//import pages.P03_Registeration;
//
//import static util.Utility.RandomEmailGenerator.generateRandomEmail;
//import static util.Utility.getRandomFirstName;
//
//public class TC02_RegisterTest extends TestBase {
//    String password = "P@ssword";
//    String generatedEmail = generateRandomEmail();  // Call the method
//    String generatedName = getRandomFirstName();
//
//    @Test
//    public void checkRegisterWithValidData_P() throws InterruptedException {
//
//        P03_Registeration registeration = new P03_Registeration(driver);
//        registeration.clickRegisterTap().checkGender().setFirstName(generatedName).setLastName(generatedName)
//                .setEmail(generatedEmail).setPasswordField(password).setConfirmPasswordField(password).clickRegisterButton();
//        System.out.println(generatedEmail);
//        System.out.println(password);
//    }
//}
