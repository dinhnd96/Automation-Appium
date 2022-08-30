package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPage extends AndroidActions {
    AndroidDriver driver;
    public SignUpPage(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='ENGLISH']")
    private WebElement engBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Continue']")
    private WebElement continuteBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[72,1830][526,1991]']")
    private WebElement signInBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[554,1830][1008,1991]']")
    private WebElement signUpBtn;


    @FindBy(xpath = "//android.widget.EditText[@text='Full name']")
    private WebElement nameField;

    @FindBy(xpath = "//android.widget.EditText[@text='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//android.widget.EditText[@text='Referral Code']")
    private WebElement referralField;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[105,1482][165,1542]']")
    private WebElement termsBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[58,1842][1022,1976]']")
    private WebElement signUpSubmitBtn;



    public void SignUpAccount(String email , String password, String name,String referral) throws InterruptedException {
        Thread.sleep(3000);
        engBtn.click();
        continuteBtn.click();
        signUpBtn.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        referralField.sendKeys(referral);
        termsBtn.click();
        signUpSubmitBtn.click();
        Thread.sleep(2000);
    }



}
