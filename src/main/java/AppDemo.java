import Trainning.BaseTest;
import Trainning.BaseTestDemo;
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
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

public class AppDemo extends BaseTestDemo {
    @Test
    public  void AppDemo() throws MalformedURLException, InterruptedException {
        // Jump direct to the screen
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
//        driver.findElement(By.xpath("//android.widget.TextView[@text='ENGLISH']")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']")).click();
//        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[458,2033][622,2094]")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[72,1830][526,1991]']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text='Email']")).sendKeys("ukejesqljc@scpulse.com");
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Dinh1234");
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[58,1173][1022,1307]']")).click();
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[432,1949][648,2151]']")).click();

        String beforeClickBtn = driver.findElement(By.xpath("//android.widget.TextView[@bounds='[477,469][549,613]']")).getText();
        Double pointDisplay = Double.parseDouble(beforeClickBtn);


        double afterClick = pointDisplay + 1 ;
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[58,1052][1022,1186]']")).click();
        Assert.assertEquals(afterClick , pointDisplay);
    }
}
