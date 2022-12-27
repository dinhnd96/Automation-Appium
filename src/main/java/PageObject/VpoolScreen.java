package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VpoolScreen extends AndroidActions {
    AndroidDriver driver;

    public VpoolScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("This is constructor");
        PageFactory.initElements(driver, this);
    }

    // Home Vpool
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,138][108,186]']")
    private WebElement backBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[957,125][1032,200]']")
    private WebElement walletBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[46,1134][1034,1401]']")
    private WebElement savingBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[46,1564][1034,1641]']")
    private WebElement savingHistoryBtn;


    //Saving Screen
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,138][108,186]']")
    private WebElement flexibleBackBtnSaving;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[135,314][405,362]']")
    private WebElement flexibleBtnSaving;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[679,314][941,365]']")
    private WebElement lockedBtnSavingBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[821,528][1034,618]']")
    private WebElement depositBtnSaving;

    //Locked Saving Screen
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[446,528][797,618]']")
    private WebElement durationBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[58,1986][1022,2120]']")
    private WebElement durationAcceptBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[821,528][1034,618]']")
    private WebElement lockedDepositBtn;


    // Saving flexible Subscipstion
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[1021,614][1051,629]']")
    private WebElement walletTypeDropdown;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Spot wallet (Vesting)']")
    private WebElement spotWalletOptions;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[75,1051][957,1195]']")
    private WebElement blockchainWalletOptions;

    @FindBy(xpath = "//android.widget.EditText[@text='Enter amount']")
    private WebElement enterMicsField;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[80,1704][110,1749]']")
    private WebElement checkBoxElement;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
    private WebElement confirmBtn;

    // Saving Locked Subscipstion
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[0,700][1080,834]']")
    private WebElement lockedWalletTypeDropdown;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Spot wallet (Vesting)']")
    private WebElement lockedSpotWalletOptions;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Blockchain wallet']")
    private WebElement lockedBlockchainWalletOptions;

    @FindBy(xpath = "//android.widget.EditText[@text='Enter amount']")
    private WebElement lockedEnterMicsField;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[80,1589][110,1634]']")
    private WebElement lockedCheckBoxElement;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
    private WebElement lockedConfirmBtn;


    public void ClickBackBtnSaving() {
        backBtn.click();
    }

    public void ClickWalletBtnSaving() {
        walletBtn.click();
    }

    public void ClickSaving() {
        savingBtn.click();
    }

    public void ClickSavingHistory() {
        savingHistoryBtn.click();
    }

    public void ClickFlexibleDeposit() {
        depositBtnSaving.click();
    }

    public void SavingFlexible(String ammout) throws InterruptedException {
        ClickSaving();
        ClickFlexibleDeposit();
        walletTypeDropdown.click();
        spotWalletOptions.click();
        enterMicsField.sendKeys(String.valueOf(ammout));
        checkBoxElement.click();
        confirmBtn.click();
        Thread.sleep(5000);
    }

    public void SavingLocked(String ammout) throws InterruptedException {
        ClickSaving();
        lockedBtnSavingBtn.click();
        durationBtn.click();
        durationAcceptBtn.click();
        lockedDepositBtn.click();
        lockedWalletTypeDropdown.click();
        lockedSpotWalletOptions.click();
        lockedEnterMicsField.sendKeys(String.valueOf(ammout));
        lockedCheckBoxElement.click();
        Thread.sleep(2000);
        lockedCheckBoxElement.click();
        lockedConfirmBtn.click();
        Thread.sleep(5000);
    }


}
