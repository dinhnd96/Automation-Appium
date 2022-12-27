package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VLendingHomeScreen extends AndroidActions {
    AndroidDriver driver;

    public VLendingHomeScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.EditText[@bounds='[48,354][1032,488]']")
    private WebElement collateral1Box;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[840,126][912,198]']")
    private WebElement bellBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[952,126][1024,198]']")
    private WebElement orderBookBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Loan']")
    private WebElement loanBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Lend']")
    private WebElement lendBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[639,2007][1034,2143]']")
    private WebElement continutesBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[926,839][1034,947]']")
    private WebElement closeAdsBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Borrow now']")
    private WebElement borrowNowBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Lend now']")
    private WebElement lendNowBtn;

    public void CLickCloseAds(){
        closeAdsBtn.click();
    }
    public void CLickBorrowNow(){
        borrowNowBtn.click();
    }

    public void CLickLend(){
        lendBtn.click();
    }

    public void CLickLendNow(){
        lendNowBtn.click();
    }


    public void CheckSuccess() {
//        String actualResult = successPopup.getAttribute("text");
//        Assert.assertEquals(actualResult, "Change password successfully. Please log in again.");
    }




}
