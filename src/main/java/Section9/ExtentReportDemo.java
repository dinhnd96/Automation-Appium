package Section9;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ExtentReportDemo {
    ExtentReports extentReports;
    public AndroidDriver driver;
    @BeforeTest
    public void config(){
        String path = System.getProperty("user.dir") + "\\report\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Reults");
        reporter.config().setDocumentTitle("Test Results");

        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Tester","Dinh Nguyen");

    }
    @Test
    public void initialDemo() throws MalformedURLException {
        extentReports.createTest("demo Test");
        URL appiumUrl = new URL("http://localhost:4723/wd/hub");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "SM G960N");
        caps.setCapability("appium:app", "C:\\Users\\Dev\\Downloads\\General-Store.apk");
        driver = new AndroidDriver(appiumUrl, caps);

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("SM G960N");
//      options.setChromedriverExecutable("D:\\untitled1\\src\\chromedriver.exe");
//      options.setApp("C:\\Users\\Dev\\Desktop\\APKFiles\\resources\\ApiDemos-debug.apk");
//        options.setApp("C:\\Users\\Dev\\Downloads\\General-Store.apk");
//      options.setApp("C:\\Users\\Dev\\Desktop\\app-arm64-v8a-releaseStaging.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Test okay nhes");
        extentReports.flush();
    }
}
