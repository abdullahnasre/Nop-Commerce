package testcases;

import org.testng.annotations.Test;
import pages.P02_Login;
import pages.P03_Registeration;
import pages.P06_SearchPage;
import pages.P12_CreateOrder;
import util.SharedData;

import static util.Utility.RandomEmailGenerator.generateRandomEmail;
import static util.Utility.getRandomFirstName;

public class TC11_AddToCart extends TestBase{
    String email = "sa@sa.com";
    String password = "sa@sa.com";
    String searchInput = "Apple MacBook Pro 13-inch";
    String searchInput2 = "Asus N551JK-XO076H Laptop";
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

        //new P03_Registeration(driver).clickRegisterTap().setFirstName("");
        //searchPage.clickLoginTap().setEmail(email).setPassword(password).clickLoginButtonWithScroll();
        registration.clickRegisterTap().setFirstName(generatedName).setLastName(generatedName).setEmail(generatedEmail).setPasswordField(password).setConfirmPasswordField(password).clickRegisterButton();
        Thread.sleep(Long.parseLong("3000"));
        login.clickLogout().clickLoginTap().setEmail(generatedSharedEmail).setPassword(password).clickLoginButtonWithScroll();
        searchPage.setSearchInput(searchInput).pressSearchButton().AddToCartButton().AddToCartLink().checkAgreeCheckbox().pressCheckoutButton();

        Thread.sleep(2000);
        System.out.println(generatedEmail);
        System.out.println(generatedSharedEmail);

        createOrder.selectFromCountrtyDropdown(option);
    }
}
