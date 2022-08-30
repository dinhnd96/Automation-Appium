package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageVconomics extends AndroidActions {
    AndroidDriver driver;
    public HomePageVconomics(AndroidDriver driver){
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[93,984][217,12101]']")
    private WebElement VscoreBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[310,1044][376,11110]']")
    private WebElement defibattleButton;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[503,1044][570,1110]']")
    private WebElement voucherBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[696,1044][762,1110]']")
    private WebElement referralBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[889,1044][955,1110]']")
    private WebElement godsendBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[117,1270][183,1336]']")
    private WebElement vpoolBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[310,1270][376,1336]']")
    private WebElement vuniBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[503,1270][570,1336]']")
    private WebElement missionBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[696,1270][762,1336]']")
    private WebElement vfactoryBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[72,2014][144,2086]']")
    private WebElement homeBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[288,2014][360,2086]']")
    private WebElement notifyBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[432,1949][648,2151]']")
    private WebElement giftBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[720,2014][792,2086]']")
    private WebElement communityBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[936,2014][1008,2086]']")
    private WebElement profileBtn;

    public void ClickVscore(){
        VscoreBtn.click();
    }

    public void ClickDefibattle(){
        defibattleButton.click();
    }

    public void ClickVoucher(){
        voucherBtn.click();
    }

    public void ClickRefferal(){
        referralBtn.click();
    }

    public void ClickGodsend(){
        godsendBtn.click();
    }

    public void ClickVpool(){
        vpoolBtn.click();
    }

    public void ClickVuni(){
        vuniBtn.click();
    }

    public void ClickMission(){
        missionBtn.click();
    }

    public void ClickVfactory(){
        vfactoryBtn.click();
    }

    public void ClickHome(){
        homeBtn.click();
    }

    public void ClickNotify(){
        notifyBtn.click();
    }

    public void ClickGift(){
        giftBtn.click();
    }

    public void ClickCommunity(){
        communityBtn.click();
    }

    public void ClickProfile(){
        profileBtn.click();
    }

}
