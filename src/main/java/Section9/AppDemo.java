package Section9;

import Trainning.BaseTest;
import Trainning.BaseTestDemo;
import com.aventstack.extentreports.ExtentReports;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;


public class AppDemo extends BaseTest {


    @Test
    public  void AppDemo() throws MalformedURLException, InterruptedException {
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
        Thread.sleep(5000);
        // Jump direct to the screen
//        driver.findElement(By.xpath("//android.widget.TextView[@text='ENGLISH']")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[458,2033][622,2094]")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[72,1830][526,1991]']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("aodyzxpcmcixq@scpulse.com");
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Dinh1234");
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[58,1173][1022,1307]']")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[432,1949][648,2151]']")).click();


        double currentPoint = 0;
        double afterClick = currentPoint + 1 ;
        //CLick điểm danh
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[58,1052][1022,1186]']")).click();
        Thread.sleep(2000);
        //CLick tắt popup
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[963,239][1053,329]']")).click();
        Thread.sleep(2000);
        // Check Số MICS điểm danh
        String beforeClickBtn = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[491,469][536,613]']")).getText();
        double pointDisplay = Double.parseDouble(beforeClickBtn);

        Assert.assertEquals(afterClick , pointDisplay);
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[565,520][589,562]']")).click();
        Thread.sleep(2000);
        boolean isDisplayed = driver.findElement(By.xpath("//android.widget.TextView[@text='Daily attendance']")).isDisplayed();
        Assert.assertEquals(isDisplayed ,true);
    }


}
