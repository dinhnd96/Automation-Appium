package Section6;

import Trainning.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LongPressClick extends BaseTest {
    @Test
    public  void LongPressClick() throws MalformedURLException, InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
//        driver.findElement(By.id("android:id/checkbox")).click();
//        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
//        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
//        Assert.assertEquals(alertTitle , "WiFi settings");
//        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("khongbiet");
//        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        LongPressClick(ele);

    }
}
