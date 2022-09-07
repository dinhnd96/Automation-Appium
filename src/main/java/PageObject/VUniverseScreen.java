package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;

public class VUniverseScreen extends AndroidActions {
    AndroidDriver driver;

    public VUniverseScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@index='2']")
    private WebElement totalMemberEle;

    @FindBy(xpath = "//android.widget.TextView[@text='Referral']")
    private WebElement referralEle;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[324,27][774,447]']")
    private WebElement myVuniverseBtn;




}
