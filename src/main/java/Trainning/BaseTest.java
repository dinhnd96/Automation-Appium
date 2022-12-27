package Trainning;

import PageObject.Android.FormPage;
import PageObject.AppiumUtils.AppiumUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws IOException, URISyntaxException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//Resources/data.properties");
        properties.load(fis);
        String ipAddress = System.getProperty("ipAddress") !=null ? System.getProperty("ipAddress") : properties.getProperty("ipAddress");
        String port = properties.getProperty("port");
        String divice = properties.getProperty("AndroidDevice");
        String url = "http://" + ipAddress + ":" + port + "/wd/hub";

        URL appiumUrl = new URL(url);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", divice);
//        caps.setCapability("appium:app", "C:\\Users\\Dev\\Downloads\\General-Store.apk");
//        caps.setChromedriverExecutable("D:\\untitled1\\src\\chromedriver.exe");
//        caps.setCapability("appium:app","C:\\Users\\Dev\\Desktop\\APKFiles\\resources\\ApiDemos-debug.apk");
//        caps.setCapability("appium:app","C:\\Users\\Dev\\Downloads\\General-Store.apk");
//        caps.setCapability("appium:app","C:\\Users\\Dev\\Desktop\\app-arm64-v8a-releaseStaging.apk");
        caps.setCapability("appium:app","C:\\Users\\Dev\\Desktop\\TestDev.apk");
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


    public void SwipeEle(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId() , "direction", "left",
                "percent", 0.75
        ));
    }


    public Double getFommattedAmount(String amount){
      Double price = Double.parseDouble(amount.substring(1));
      return price;
    };

    public List<HashMap<String , String>> getJsonData(String jsonFilePath) throws IOException {
        String jsonContent = FileUtils.readFileToString(new File(jsonFilePath));

        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String,String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });
        return data;
    };



    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
    }

