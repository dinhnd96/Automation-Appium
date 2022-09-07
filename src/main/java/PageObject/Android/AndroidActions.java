package PageObject.Android;

import PageObject.AppiumUtils.AppiumUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class AndroidActions extends AppiumUtils {
    AndroidDriver driver;

    public AndroidActions(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void LongPressClick(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId() , "duration" , 2000
        ));
    }
    public void ScrollIntoView(){
        boolean canScrollMore;
        do {
            canScrollMore  = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 600, "top", 1500, "width", 1500, "height", 500,
                    "direction", "down",
                    "percent", 3.0
            ));
            System.out.println("canScrollMore" + canScrollMore);
        }while (canScrollMore);
    }


    public void swipeUp(int howManySwipes) {
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.8);
        int endVerticalY = (int) (size.height * 0.21);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {
                new TouchAction<>(driver).press(point(startVerticalX, startVerticalY))
                        .waitAction(waitOptions(ofSeconds(2))).moveTo(point(startVerticalX, endVerticalY)).release()
                        .perform();

            }
        } catch (Exception e) {
            //print error or something
        }
    }

    public void swipeLeft(int howManySwipes) {
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.8);
        int endVerticalY = (int) (size.height * 0.21);
        int startVerticalX = (int) (size.width / 2.1);
        int endVerticalX = (int) (size.width/ 1.4);
            // Thay đổi XOffset để lướt từ trái sang phải (xOffset lần 1 > lần 2 )
        try {
            for (int i = 1; i <= howManySwipes; i++) {
                new TouchAction<>(driver).press(point(1000, startVerticalY))
                        .waitAction(waitOptions(ofSeconds(2))).moveTo(point(100, startVerticalY)).release()
                        .perform();
            }
        } catch (Exception e) {
            //print error or something
        }
    }

    public void swipeDown(int howManySwipes) {
        Dimension size = driver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.8);
        int endVerticalY = (int) (size.height * 0.21);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {
                new TouchAction<>(driver).press(point(startVerticalX, endVerticalY))
                        .waitAction(waitOptions(ofSeconds(2))).moveTo(point(startVerticalX, startVerticalY))
                        .release().perform();
            }
        } catch (Exception e) {
            //print error or something
        }
    }



    public void ScrollIntoText(String text){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+text+"));"));
    }
    public void ScrollIntoElement(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId() , "direction", "down",
                "percent", 0.75
        ));
    }


    public void Swipe(){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 600, "top", 1000, "width", 400, "height", 400,
                "direction", "left",
                "percent", 0.75
        ));
    }



    public void SwipeLeft(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", "left",
                "percent", 0.75
        ));
    }

}
