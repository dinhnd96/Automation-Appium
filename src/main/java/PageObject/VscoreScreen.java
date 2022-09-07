package PageObject;

import PageObject.Android.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VscoreScreen extends AndroidActions {
    AndroidDriver driver;

    public VscoreScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,139][108,187]']")
    private WebElement backBtnBell;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,136][108,190]']")
    private WebElement backBtnSurveyHistory;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,125][123,200]']")
    private WebElement backBtnSurveyScreen;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,125][108,179]']")
    private WebElement backBtnFinanceSceen;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[48,135][108,189]']")
    private WebElement backBtn;
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[960,125][1032,200]']")
    private WebElement bellBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[812,1711][993,1813]']")
    private WebElement serveyStt;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[969,1888][993,1930]']")
    private WebElement historyBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[102,2021][168,2078]']")
    private WebElement homeBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[375,2021][435,2078]']")
    private WebElement surveyBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[647,2021][704,2078]']")
    private WebElement loanBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[918,2021][972,2078]']")
    private WebElement depositBtn;


    //Vscore - SurveyScreen
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[197,703][427,933]']")
    private WebElement creditHistoryBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[651,703][881,933]']")
    private WebElement personalProfileBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[258,1335][366,1443]']")
    private WebElement financeBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[730,1335][805,1443]']")
    private WebElement characteristicBtn;

    //Vscore - loanScreen
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[191,665][356,830]']")
    private WebElement homeLoansBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[723,665][888,830]']")
    private WebElement carLoansBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[191,1080][356,1245]']")
    private WebElement businessLoansBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[723,1080][888,1245]']")
    private WebElement secureLoansBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[191,1495][356,1660]']")
    private WebElement unsecureLoansBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[723,1495][888,1660]']")
    private WebElement creditCardBtn;


    //Vscore - depositScreen
    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[86,995][994,1129]']")
    private WebElement amoutField;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[86,1427][161,1502]']")
    private WebElement termCursor;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[86,1636][994,1770]']")
    private WebElement submitBtn;


    // Function on screen


    public void clickBackBtnBell() {
        backBtnBell.click();
    }

    public void clickBackBtnSurveyHistory() {
        backBtnSurveyHistory.click();
    }

    public void clickBackBtnSurveyScreen() {
        backBtnSurveyScreen.click();
    }

    public void clickBackBtnFinanceScreen() {
        backBtnFinanceSceen.click();
    }

    public void clickBackBtn() {
        backBtn.click();
    }

    public void clickBellBtn() {
        bellBtn.click();
    }

    public void clickSurveyStatus() {
        surveyBtn.click();
    }

    public void clickHistoryBtn() {
        historyBtn.click();
    }

    public void clickHomeBtn() {
        homeBtn.click();
    }

    public void clickSurveyBtn() {
        surveyBtn.click();
    }

    public void clickLoanBtn() {
        loanBtn.click();
    }

    public void clickDepositBtn() {
        depositBtn.click();
    }

    public void clickCreditHistoryBtn() {
        creditHistoryBtn.click();
    }

    public void clickPersonalProfileBtn() {
        personalProfileBtn.click();
    }

    public void clickFinanceBtn() {
        financeBtn.click();
    }

    public void clickCharacteristicBtn() {
        characteristicBtn.click();
    }

    public void clickHomeLoansBtn() {
        homeLoansBtn.click();
    }

    public void clickCarLoansBtn() {
        carLoansBtn.click();
    }

    public void clickBusinessLoansBtn() {
        businessLoansBtn.click();
    }

    public void clickSecureLoansBtn() {
        secureLoansBtn.click();
    }

    public void clickUnsecureLoansBtn() {
        unsecureLoansBtn.click();
    }

    public void clickCreditCardBtn() {
        creditCardBtn.click();
    }

    public void setAmoutField(String amout) {
        amoutField.sendKeys(String.valueOf(amout));
    }

    public void termCursorHandle() {
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) termCursor).getId(),
                "endX", 931,
                "endY", 1449
        ));
    }

    public void ClickSubmitBtn() {
        submitBtn.click();
    }

}
