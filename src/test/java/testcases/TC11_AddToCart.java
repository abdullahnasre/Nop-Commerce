package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import util.SharedData;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;
import static util.Utility.getRandomFirstName;

public class TC11_AddToCart extends TestBase {
    String password = "sa@sa.com";
    String searchInput = "Apple MacBook Pro 13-inch";
    String generatedEmail = generateRandomEmail();//generateRandomEmail();  // Call the method
    String generatedName = getRandomFirstName();
    String generatedSharedEmail = SharedData.sharedEmail;


    @Test
    public void testSelectOption() throws InterruptedException {
        P03_Registeration registration = new P03_Registeration(driver);
        P12_CreateOrder createOrder = new P12_CreateOrder(driver);
        P06_SearchPage searchPage = new P06_SearchPage(driver);
        P02_Login login = new P02_Login(driver);
        String option = "Egypt";
        String successmsg = "Log out";


        registration.clickRegisterTap().setFirstName(generatedName).setLastName(generatedName).setEmail(generatedEmail).setPasswordField(password).setConfirmPasswordField(password).clickRegisterButton();
        Thread.sleep(Long.parseLong("3000"));
        login.clickLogout().clickLoginTap().setEmail(generatedSharedEmail).setPassword(password).clickLoginButtonWithScroll();
        searchPage.setSearchInput(searchInput).pressSearchButton().AddToCartButton().AddToCartLink().checkAgreeCheckbox().pressCheckoutButton();


        Thread.sleep(2000);
        createOrder.selectFromCountrtyDropdown(option);
        createOrder.setCityField("cairo").setAddressField("cairo").setPostalField("123").setPhoneField("011598569").pressContinueButton();
        createOrder.pressShippingContinueButton().presspaymentButton().pressPaymentInfoButton().pressConfirmOrderButton().pressContinueAfterOrder();

        Assert.assertTrue(new P12_CreateOrder(driver).verifySuccessMsgOrder(successmsg), "order not found");

        Thread.sleep(2000);
    }
}
