package PageObject.AppiumUtils;

import Trainning.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class AppiumUtils {
    AppiumDriver driver;

    public AppiumUtils(AppiumDriver driver) {

    }

    public Double getFommattedAmount(String amount){
        Double price = Double.parseDouble(amount.substring(0));
        return price;
    };

    public void waitForElementVisible(WebElement element , String atrribute , String value){
        System.out.println("Day roi nhes @@@");
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains((element),atrribute,value));
    }
}
