package Trainning;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.Duration;

public class BaseTestDemo {
    public AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        URL appiumUrl = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "SM G960N");
//        caps.setCapability("appium:app", "C:\\Users\\Dev\\Desktop\\app-arm64-v8a-releaseStaging.apk");
        driver = new AndroidDriver(appiumUrl, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception ignore) {}
    }
}
