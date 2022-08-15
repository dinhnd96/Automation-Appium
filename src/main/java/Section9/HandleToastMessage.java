package Section9;

import Trainning.BaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleToastMessage extends BaseTest {

    @Test
    public void FillForm() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).click();
//        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nguyen Duy Dinh");
        driver.hideKeyboard();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Afghanistan']")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String message = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        Assert.assertEquals(message  , "Please enter your name");
    }

}
