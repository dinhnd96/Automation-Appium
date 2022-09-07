package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReferralScreen extends AndroidActions {
    AndroidDriver driver;

    public ReferralScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='DINH123']")
    private WebElement referralCode;

    @FindBy(xpath = "//android.widget.TextView[@bounds='[856,987][911,1132]']")
    private WebElement totalRerral;

    public void CheckReferralCode() {
        String actualReferral = referralCode.getAttribute("text").toUpperCase();
        Assert.assertEquals(actualReferral, "DINH123");
    }

    public void CheckTotalReferral() {
        String actualTotalReferral = totalRerral.getAttribute("text");
        double val = Double.parseDouble(actualTotalReferral);

        Assert.assertEquals(val, 2);
    }


}
