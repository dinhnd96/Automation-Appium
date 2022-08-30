package Section9;

import PageObject.Android.FormPage;
import Trainning.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerce_tc_2 extends BaseTest {

    @Test
    public void FillForm() throws InterruptedException {
        FormPage formPage = new FormPage(driver);
//
//        formPage.setNameField("Dinh");
//        formPage.setGender("male");

//        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
//        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).click();
//        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nguyen Duy Dinh");
//        driver.hideKeyboard();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));

        int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        for (int i = 0 ; i < productCount ; i++) {
             String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
             if (productName.equalsIgnoreCase("Jordan 6 Rings")){
                 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
             }
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
            Thread.sleep(3000);
//        driver.findElement(By.id("//com.androidsample.generalstore:id/toolbar_title[@text='Cart']"));
//
//        String lastPageProduct = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
//        System.out.println("lastPageProduct" +lastPageProduct);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.)))
        String actualReult =  driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals(actualReult , "Jordan 6 Rings");

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.androidsample.generalstore:id/toolbar_title")));

    }

}
