package testcases;

import com.github.javafaker.Faker;
import drivers.DriverFactory;
import drivers.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected static WebDriver driver;
    protected Faker faker = new Faker();

    @Parameters("browser")
    @BeforeTest
    public void setupDriver(@Optional("chrome") String browser) {

        driver = DriverFactory.getNewInstance(browser);
        DriverHolder.setDriver(driver);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

