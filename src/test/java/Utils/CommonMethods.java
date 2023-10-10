package Utils;

import StepDefinition.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {

    public static WebDriver driver;

    public static void LaunchBrowserNavigatetoURL() {

        ConfigReader.readProperties(Constants.CONFIG_READER_PATH);
        String browser = ConfigReader.getProperty("Browser");

        switch (browser) {
            case ("Chrome"):
                ChromeOptions co = new ChromeOptions();
                co.setHeadless(true);
                driver = new ChromeDriver(co);
                break;

            case ("Firefox"):
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("Url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        initializeElements();

    }

    public static void Iterator(WebElement element) {

    }

    public static void SendKeys(WebElement element, String str) {
        element.sendKeys(str);
    }

    public static void ClickElement(WebElement element) {
        element.click();
    }

    public static byte[] TakeScreenshot(String filename) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] PicBytes = ts.getScreenshotAs(OutputType.BYTES);
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot,
                    new File(Constants.SCREENSHOTS_PATH + filename+".png"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return PicBytes;
    }

    public static void CloseBrowser() {
        driver.close();
    }
}


