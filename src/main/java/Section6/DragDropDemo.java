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

public class DragDropDemo extends BaseTest {
    @Test
    public  void SwipeElement() throws MalformedURLException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement ele = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(),
                "endX", 710,
                "endY", 630
        ));
        Assert.assertEquals(driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getAttribute("text"),"Dropped!");

        Thread.sleep(3000);
    }
}
