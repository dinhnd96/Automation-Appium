package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WelcomPage extends AndroidActions {
    AndroidDriver driver;
    public WelcomPage(AndroidDriver driver){
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


    @FindBy(xpath = "//android.widget.EditText[@text='Email']")
    private WebElement emailField;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[58,1173][1022,1307]']")
    private WebElement signInBtn2;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[58,1173][1022,1307]']")
    private WebElement closeAdsBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[281,1448][800,1564]']")
    private WebElement confirmBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[332,1542][497,1707]']")
    private WebElement googleBtn;

    @FindBy(xpath = "//android.widget.LinearLayout[@index='1']")
    private WebElement accountGoogleBtn;

    @FindBy(id = "com.android.chrome:id/account_picker_selected_account")
    private WebElement accountGoogleBtn2;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[569,1542][734,1707]']")
    private WebElement facebookBtn;

    @FindBy(xpath = "//android.widget.TextView[@index='2']")
    private WebElement textWrongPassword;


    public void LogInAccount(String email , String password) throws InterruptedException {
        Thread.sleep(3000);
//        waitForElementVisible();
//        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[137,1756][943,1896]")).click();
        engBtn.click();
        continuteBtn.click();
        signInBtn.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInBtn2.click();
        Thread.sleep(2000);
        closeAdsBtn.click();
    }

    public void LogInAccount2(String email , String password) throws InterruptedException {
        Thread.sleep(3000);
        signInBtn.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInBtn2.click();
        Thread.sleep(2000);
    }

    public void LoginFail(String email , String password) throws InterruptedException {
        engBtn.click();
        continuteBtn.click();
        signInBtn.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInBtn2.click();
        Thread.sleep(5000);
        String textWrong = textWrongPassword.getAttribute("text");
        System.out.println(textWrong);
        String expectedText = "Username or password invalid. Your account will be temporarily locked if you enter the wrong password 5 times or more";
        Assert.assertEquals(textWrong,expectedText);
    }

    public void LoginWithGoogle(String email , String password) throws InterruptedException {
        engBtn.click();
        continuteBtn.click();
        signInBtn.click();
        googleBtn.click();
        Thread.sleep(2000);
        accountGoogleBtn.click();
        Thread.sleep(5000);

    }

    public void LoginWithFacebook(String email , String password) throws InterruptedException {
        engBtn.click();
        continuteBtn.click();
        signInBtn.click();
        facebookBtn.click();
        Thread.sleep(5000);

    }

    public void LogInAccount5times(String email , String password) throws InterruptedException {
        Thread.sleep(3000);

        engBtn.click();
        continuteBtn.click();
        signInBtn.click();

        String expectedText = "Username or password invalid. Your account will be temporarily locked if you enter the wrong password 5 times or more";
        for ( int i = 0 ; i < 6 ; i++) {
            emailField.sendKeys(email);
            passwordField.sendKeys(password + i);
            signInBtn2.click();
            confirmBtn.click();
            System.out.println("day la i " + i);
        }
    }

}
