package PageObject;

import PageObject.Android.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class ProfileScreen extends AndroidActions {
    AndroidDriver driver;

    public ProfileScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@index='13']")
    private WebElement versionText;

    @FindBy(xpath = "//android.widget.TextView[@text='Referral']")
    private WebElement referralEle;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[46,687][1034,1873]']")
    private WebElement element;


    public void ScrollIntoVersion() {
        swipeUp(5);
    }

    public String getVersionText() {
        System.out.println(versionText.getAttribute("text"));
        return versionText.getAttribute("text");
    }

}
