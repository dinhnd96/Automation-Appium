package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GodSendSceen extends AndroidActions {
    AndroidDriver driver;

    public GodSendSceen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//android.widget.TextView[@text='Random number']")
    private WebElement randomBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Submit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[114,1922][246,2054]']")
    private WebElement resultBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[281,1367][799,1483]']")
    private WebElement confirmBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[474,1922][606,2054]']")
    private WebElement wonTodayBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Rule']")
    private WebElement ruleBtn;


    public void ChooseNumber (){
        randomBtn.click();
        submitBtn.click();
        confirmBtn.click();
    }

    public void ClickResult(){
        resultBtn.click();
    }
    public void ClickWonToday(){
        wonTodayBtn.click();
    }

    public void ClickRule(){
        ruleBtn.click();
    }

}
