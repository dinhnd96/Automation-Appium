package Section7;

import PageObject.Android.FormPage;
import Trainning.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppActivity extends BaseTest {

    @Test
    public  void Miscellaneous() throws MalformedURLException {
        // Jump direct to the screen
        Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
        driver.startActivity(activity);

        FormPage formPage = new FormPage(driver);
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle , "WiFi settings");

        driver.setClipboardText("khongbiet");
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        DeviceRotation lanScape = new DeviceRotation(0,0,90);
        driver.rotate(lanScape);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

    }

}
