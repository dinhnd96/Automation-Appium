package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ChangePasswordScreen extends AndroidActions {
    AndroidDriver driver;

    public ChangePasswordScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//android.widget.EditText[@text='Please enter old password']")
    private WebElement oldPasslEle;

    @FindBy(xpath = "//android.widget.EditText[@text='New Password']")
    private WebElement newPasslEle;

    @FindBy(xpath = "//android.widget.EditText[@text='Please confirm Password']")
    private WebElement renewPasslEle;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[86,1613][994,1747]']")
    private WebElement submitBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Change password successfully. Please log in again.']")
    private WebElement successPopup;

    public void changePassword(String oldPass , String newPass){
        oldPasslEle.sendKeys(oldPass);
        newPasslEle.sendKeys(newPass);
        renewPasslEle.sendKeys(newPass);
        submitBtn.click();
    }

    public void CheckSuccess() {
        String actualResult = successPopup.getAttribute("text");
        Assert.assertEquals(actualResult, "Change password successfully. Please log in again.");
    }




}
