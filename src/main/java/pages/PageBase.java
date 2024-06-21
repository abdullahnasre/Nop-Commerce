package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class PageBase {
    WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    private final By SEARCH_BOX = By.xpath("//input[@id='small-searchterms']");
    private final By CURRUNCY = By.xpath("//select[@id='customerCurrency']");

    public PageBase searchFunction(String keyword) {
        driver.findElement(this.SEARCH_BOX).sendKeys(keyword, Keys.ENTER);

        return this;
    }

    public PageBase convert_curruncy() {
        driver.findElement(this.CURRUNCY).click();
        return this;
    }

    public String check_url() {
        return driver.getCurrentUrl();
    }

    public PageBase scroll_down() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,360)", "");
        return this;
    }

    public PageBase Wait() throws InterruptedException {
        Thread.sleep(1300);
        return this;
    }

    // TODO: Capture Screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "/src/test/resources/Screenshots/" + screenshotName + System.currentTimeMillis() + ".png"));
        } catch (WebDriverException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}