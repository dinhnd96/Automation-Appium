package PageObject;

import PageObject.Android.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.security.PublicKey;

public class MissionScreen extends AndroidActions {
    AndroidDriver driver;

    public MissionScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Mission 1']")
    private WebElement mission1Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Join Vconomics Vietnamese Telegram Group']")
    private WebElement mission1Day1Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Mission 2']")
    private WebElement mission2Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Invite 2 new members download Vconomics']")
    private WebElement mission1Day2Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Mission 3']")
    private WebElement mission3Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Retweet Twitter posts']")
    private WebElement mission1Day3Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Mission 4']")
    private WebElement mission4Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Take the tiny quiz']")
    private WebElement mission1Day4Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Mission 5']")
    private WebElement mission5Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Take the tiny quiz']")
    private WebElement mission1Day5Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Mission 6']")
    private WebElement mission6Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Daily Attendance']")
    private WebElement mission1Day6Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Mission 7']")
    private WebElement mission7Btn;

    @FindBy(xpath = "//android.widget.TextView[@text='Listing 01 NFT successfully']")
    private WebElement mission1Day7Btn;

    public void CheckMissionDay1() {
        mission1Btn.click();
        Assert.assertTrue(mission1Day1Btn.isDisplayed());
    }

    public void CheckMissionDay2() {
        mission2Btn.click();
        Assert.assertTrue(mission1Day2Btn.isDisplayed());
    }

    public void CheckMissionDay3() throws InterruptedException {
        swipeLeft(1);
        mission3Btn.click();
        Thread.sleep(2000);
        Assert.assertTrue(mission1Day3Btn.isDisplayed());
    }

    public void CheckMissionDay4() throws InterruptedException {
        swipeLeft(2);
        mission4Btn.click();
        Thread.sleep(2000);
        Assert.assertTrue(mission1Day4Btn.isDisplayed());
    }

    public void CheckMissionDay5() throws InterruptedException {
        swipeLeft(2);
        mission5Btn.click();
        Thread.sleep(2000);
        Assert.assertTrue(mission1Day5Btn.isDisplayed());
    }

    public void CheckMissionDay6() throws InterruptedException {
        swipeLeft(3);
        mission6Btn.click();
        Thread.sleep(2000);
        Assert.assertTrue(mission1Day6Btn.isDisplayed());
    }

    public void CheckMissionDay7() throws InterruptedException {
        swipeLeft(3);
        mission7Btn.click();
        Thread.sleep(2000);
        Assert.assertTrue(mission1Day7Btn.isDisplayed());
    }


}
