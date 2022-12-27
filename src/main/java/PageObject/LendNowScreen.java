package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LendNowScreen extends AndroidActions {
    AndroidDriver driver;

    public LendNowScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,126][120,198]']")
    private WebElement backBtn;

    @FindBy(xpath = "//android.widget.EditText[@text='Amount']")
    private WebElement maxLendBox;

    @FindBy(xpath = "//android.widget.EditText[@bounds='[48,726][1032,860]']")
    private WebElement minLendBox;

    @FindBy(xpath = "//android.widget.EditText[@text='0 - 100%']")
    private WebElement aprBox;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
    private WebElement confirmBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='VLending']")
    private WebElement vLendingTitle;



    @FindBy(xpath = "//android.widget.TextView[@text='Borrow now']")
    private WebElement borrowBtn;


    public void CreateLend(){
        maxLendBox.sendKeys("2");
        minLendBox.sendKeys("1");
        aprBox.sendKeys("1");
        borrowBtn.click();
    }

    public void CheckSuccess() {
        String actualResult = vLendingTitle.getAttribute("text");
        Assert.assertEquals(actualResult, "VLending");
    }




}
