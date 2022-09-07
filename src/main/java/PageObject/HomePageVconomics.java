package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageVconomics extends AndroidActions {
    AndroidDriver driver;

    public HomePageVconomics(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Vscore']")
    private WebElement VscoreBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Defibattle']")
    private WebElement defibattleButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Vouchers']")
    private WebElement voucherBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Referral'")
    private WebElement referralBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Godsend']")
    private WebElement godsendBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Vpool']")
    private WebElement vpoolBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Vuniverse']")
    private WebElement vuniBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Mission']")
    private WebElement missionBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='VFactory']")
    private WebElement vfactoryBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Vscore']")
    private WebElement homeBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='VFactory']")
    private WebElement notifyBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[432,1949][648,2151]']")
    private WebElement giftBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Community']")
    private WebElement communityBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Profile']")
    private WebElement profileBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='See more']")
    private WebElement seeMoreBtn;

    public void ClickVscore() {
        VscoreBtn.click();
    }

    public void ClickDefibattle() {
        defibattleButton.click();
    }

    public void ClickVoucher() {
        voucherBtn.click();
    }

    public void ClickRefferal() {
        referralBtn.click();
    }

    public void ClickGodsend() {
        godsendBtn.click();
    }

    public void ClickVpool() {
        vpoolBtn.click();
    }

    public void ClickVuni() {
        vuniBtn.click();
    }

    public void ClickMission() {
        missionBtn.click();
    }

    public void ClickVfactory() {
        vfactoryBtn.click();
    }

    public void ClickHome() {
        homeBtn.click();
    }

    public void ClickNotify() {
        notifyBtn.click();
    }

    public void ClickGift() {
        giftBtn.click();
    }

    public void ClickCommunity() {
        communityBtn.click();
    }

    public void ClickProfile() {
        profileBtn.click();
    }

}
