package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;

public class CommunityScreen extends AndroidActions {
    AndroidDriver driver;
    public CommunityScreen(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//android.widget.TextView[@index='2']")
    private WebElement totalMemberEle;

    @FindBy(xpath = "//android.widget.TextView[@text='Referral']")
    private WebElement referralEle;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[909,1387][957,1435]']")
    private WebElement smartContractCoppyBtn;


    public String getSmartContract(){
        smartContractCoppyBtn.click();
        String text = driver.getClipboardText();
        return text;
    }

    public void getPeopleNumber(){
        String realResult = totalMemberEle.getAttribute("text");
        String[] words=realResult.split("\\,");//splits the string based on whitespace
//using java foreach loop to print elements of string array
        Arrays.toString(words);
        String result = words[0] + words[1] + words[2];
        System.out.println(result);
    }

    public String GetTotalPeoPle(){
        String realResult = totalMemberEle.getAttribute("text"); totalMemberEle.getAttribute("text");
        String[] words=realResult.split("\\,");//splits the string based on whitespace
//using java foreach loop to print elements of string array
        Arrays.toString(words);
        String result = words[0] + words[1] + words[2];
        return result;
    }

}
