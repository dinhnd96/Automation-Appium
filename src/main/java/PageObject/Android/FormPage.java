package PageObject.Android;

import Trainning.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

public class FormPage extends AndroidActions {
    AndroidDriver driver;

    public FormPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="com.androidsample.generalstore:id/nameField" )
    private WebElement nameField;

    @FindBy(xpath ="//android.widget.RadioButton[@text='Female']" )
    private WebElement femalelOptions;

    @FindBy(xpath ="//android.widget.RadioButton[@text='Male']" )
    private WebElement maleOptions;

    @FindBy(id ="com.androidsample.generalstore:id/spinnerCountry" )
    private WebElement countryField;

    @FindBy(id ="com.androidsample.generalstore:id/btnLetsShop" )
    private WebElement btnLetShop;


    public void setCountryField(String countryName){
        countryField.click();
//        ScrollIntoText(countryName);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+countryName+"\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
    }

    public void setNameField(String name) {
        nameField.sendKeys(name);
        driver.hideKeyboard();

    }

    public void setGender(String gender){
        if (gender.contains("Female")) {
            femalelOptions.click();
        } else {
            maleOptions.click();
        }
    }

    public void clickBtn(){
        btnLetShop.click();
    }
}
