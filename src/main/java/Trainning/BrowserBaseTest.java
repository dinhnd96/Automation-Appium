package Trainning;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserBaseTest {
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
        options.setChromedriverExecutable("D:\\untitled1\\src\\chromedriver.exe");
        options.setCapability("browserName","Chrome");
//        options.setApp("C:\\Users\\Dev\\Desktop\\APKFiles\\resources\\ApiDemos-debug.apk");
        options.setApp("C:\\Users\\Dev\\Downloads\\General-Store.apk");
//        options.setApp("C:\\Users\\Dev\\Desktop\\app-arm64-v8a-releaseStaging.apk");
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    public Double getFommattedAmount(String amount){
      Double price = Double.parseDouble(amount.substring(1));
      return price;
    };

    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
    }
    }

