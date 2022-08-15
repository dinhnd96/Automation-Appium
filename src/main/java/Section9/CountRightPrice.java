package Section9;

import Trainning.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class CountRightPrice extends BaseTest {

    @Test
    public void CountRightPrice() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nguyen Duy Dinh");
        driver.hideKeyboard();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Afghanistan\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Afghanistan']")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(3000);

        List<WebElement> ProductPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        int count = ProductPrices.size();
        double sum = 0;
        for (int i = 0 ; i< count ; i++) {
            String amoutString = ProductPrices.get(i).getText();
            Double price = Double.parseDouble(amoutString.substring(1));
            sum = sum + price;
            System.out.println(sum);
        }
        String displaySum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        Double displayFommattedSum = getFommattedAmount(displaySum);
        Assert.assertEquals(displayFommattedSum,sum);
        WebElement ele = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        LongPressClick(ele);
        Thread.sleep(2000);
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.className("android.widget.CheckBox")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(5000);
        Set<String> contexts = driver.getContextHandles();
        for(String contextName : contexts) {
            System.out.println(contextName);
        }
        driver.context("WEBVIEW_com.androidsample.generalstore");
        driver.findElement(By.name("q")).sendKeys("Vcononomics");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.context("NATIVE_APP");

    }


}
