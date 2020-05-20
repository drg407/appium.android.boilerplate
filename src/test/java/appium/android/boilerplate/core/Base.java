package appium.android.boilerplate.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import appium.android.boilerplate.pages.APIDemos;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Base {

    protected static AppiumDriver<MobileElement> driver;
    protected static WebDriverWait wait;
    public static APIDemos apiDemos;

    @BeforeTest
    public static void setup() throws IOException {

        final Properties prop = new Properties();
        final FileInputStream fis = new FileInputStream("src/global.properties");

        prop.load(fis);

        final File appDir = new File("src");
        final File app = new File(appDir, prop.getProperty("testApp"));

        final DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("app", app.getAbsolutePath());
        dc.setCapability("appActivity", prop.getProperty("appActivity"));
        dc.setCapability("appPackage", prop.getProperty("appPackage"));
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("udid", prop.getProperty("udid"));
        dc.setCapability("deviceName", prop.getProperty("deviceName"));
        dc.setCapability("platformVersion", prop.getProperty("platformVersion"));

        // Non-platform specific capabilities
        dc.setCapability("eventTimings", true);
        dc.setCapability("newCommandTimeout", 30);
        dc.setCapability("noReset", false);
        dc.setCapability("fullReset", false);

        driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        wait = new WebDriverWait(driver, 30);

        apiDemos = new APIDemos(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}