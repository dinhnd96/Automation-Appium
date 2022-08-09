package Trainning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;
//
    @BeforeClass
    public  void ConfigurationAppium() throws MalformedURLException {
        //Appium Code -> Appium Server => Mobile

        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Dev\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("SM G960N");
        options.setApp("C:\\Users\\Dev\\Desktop\\APKFiles\\resources\\ApiDemos-debug.apk");
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
    }
    }

