package Trainning;

import PageObject.Android.FormPage;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;

//    @BeforeClass
//    public void setUp() throws MalformedURLException, URISyntaxException {
//        URL appiumUrl = new URL("http://localhost:4723/wd/hub");
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("deviceName", "SM G960N");
//        caps.setCapability("appium:app", "C:\\Users\\Dev\\Downloads\\General-Store.apk・");
//        //        caps.setChromedriverExecutable("D:\\untitled1\\src\\chromedriver.exe");
////        options.setCapability("C:\\Users\\Dev\\Desktop\\APKFiles\\resources\\ApiDemos-debug.apk");
////        options.setCapability("C:\\Users\\Dev\\Downloads\\General-Store.apk");
////        options.setCapability("C:\\Users\\Dev\\Desktop\\app-arm64-v8a-releaseStaging.apk");
//        driver = new AndroidDriver(appiumUrl, caps);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    }

//
//    @BeforeClass
//    public  void ConfigurationAppium() throws MalformedURLException {
//        //Appium Code -> Appium Server => Mobile
//
////        URL appiumUrl = new URL("http://localhost:4723/wd/hub");
////        DesiredCapabilities caps = new DesiredCapabilities();
////        caps.setCapability("platformName", "Android");
////        caps.setCapability("automationName", "UiAutomator2");
////        caps.setCapability("deviceName", "SM G960N");
////        caps.setCapability("appium:app", "C:\\Users\\Dev\\Downloads\\General-Store.apk");
////        driver = new AndroidDriver(appiumUrl, caps);
//
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("SM G960N");
////      options.setChromedriverExecutable("D:\\untitled1\\src\\chromedriver.exe");
////      options.setApp("C:\\Users\\Dev\\Desktop\\APKFiles\\resources\\ApiDemos-debug.apk");
//        options.setApp("C:\\Users\\Dev\\Downloads\\General-Store.apk");
////      options.setApp("C:\\Users\\Dev\\Desktop\\app-arm64-v8a-releaseStaging.apk");
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//    }

    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        URL appiumUrl = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "SM G960N");
//        caps.setCapability("appium:app", "C:\\Users\\Dev\\Downloads\\General-Store.apk");
//        caps.setChromedriverExecutable("D:\\untitled1\\src\\chromedriver.exe");
//        caps.setCapability("appium:app","C:\\Users\\Dev\\Desktop\\APKFiles\\resources\\ApiDemos-debug.apk");
//        caps.setCapability("appium:app","C:\\Users\\Dev\\Downloads\\General-Store.apk");
        caps.setCapability("appium:app","C:\\Users\\Dev\\Desktop\\app-arm64-v8a-releaseStaging.apk");
        caps.setCapability("appWaitActivity","*");
        driver = new AndroidDriver(appiumUrl, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void LongPressClick(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId() , "duration" , 2000
        ));
    }
    public void ScrollIntoView(){
        boolean canScrollMore;
        do {
            canScrollMore  = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 500, "top", 1000, "width", 1000, "height", 1000,
                    "direction", "down",
                    "percent", 50.0
            ));
            System.out.println(canScrollMore);
        }while (canScrollMore);

    }

    public void ScrollIntoText(String text){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+text+"));"));
    }
    public void ScrollIntoElement(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId() , "direction", "left",
                "percent", 0.75
        ));
    }

    public void Swipe(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId() , "direction", "left",
                "percent", 0.75
        ));
    }
    public Double getFommattedAmount(String amount){
      Double price = Double.parseDouble(amount.substring(1));
      return price;
    };

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    }

