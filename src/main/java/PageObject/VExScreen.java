package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VExScreen extends AndroidActions {
    AndroidDriver driver;

    public VExScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }

    // Home Vex

    @FindBy(xpath = "//android.widget.TextView[@text='Search for creator or NFT category']")
    private WebElement searchBox;

    @FindBy(xpath = "//android.widget.TextView[@text='Trend']")
    private WebElement trendBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[313,455][500,588]']")
    private WebElement topVexBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[580,455][767,588]']")
    private WebElement hotOfferBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[917,495][965,549]']")
    private WebElement newNFTBtn;

    @FindBy(xpath = "//android.widget.TextView[@bounds='[922,722][1037,778]']")
    private WebElement seeAllMostViewedBtn;

    @FindBy(xpath = "//android.widget.TextView[@bounds='[922,1652][1037,1708]']")
    private WebElement seeAllHotCollectionsBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='See all']")
    private WebElement seeAllSuggestionsBtn;

    // checkNFT MostViewed
    @FindBy(xpath = "//android.widget.ImageView[@bounds='[44,819][577,1515]']")
    private WebElement firstNFTMostViewed;

    @FindBy(xpath = "//android.widget.ImageView[@bounds='[637,819][1080,1515]']")
    private WebElement secondNFTMostViewed;
    public void CheckNFTMostViewed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(firstNFTMostViewed.isDisplayed());
        Assert.assertTrue(secondNFTMostViewed.isDisplayed());
    }

    //checkNFT MostViewed Top Vex
    @FindBy(xpath = "//android.widget.TextView[@text='Watanabe']")
    private WebElement secondTopVex;

    @FindBy(xpath = "//android.widget.TextView[@text='Unfollow']")
    private WebElement unfollowBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Follow']")
    private WebElement followBtn;


    public void CheckTopVex() throws InterruptedException {
        Thread.sleep(2000);
        topVexBtn.click();
//        Assert.assertTrue(secondTopVex.isDisplayed());
        unfollowBtn.click();
        Thread.sleep(2000);
        followBtn.click();
    }

    // Check hot Offer
    @FindBy(xpath = "//android.widget.TextView[@text='001R']")
    private WebElement firstNftHotOffer;


    public void CheckHotOffer() throws InterruptedException {
        Thread.sleep(2000);
        hotOfferBtn.click();
//        Assert.assertTrue(firstNftHotOffer.isDisplayed());
    }

    // Check New NFT
    @FindBy(xpath = "//android.widget.ImageView[@bounds='[45,709][519,1352]']")
    private WebElement firstNftNewNFT;

    @FindBy(xpath = "//android.widget.ImageView[@bounds='[563,709][1037,1352]']")
    private WebElement secondNftNewNFT;

    public void CheckNewNFT() throws InterruptedException {
        Thread.sleep(2000);
        newNFTBtn.click();
        Assert.assertTrue(firstNftNewNFT.isDisplayed());
        Assert.assertTrue(secondNftNewNFT.isDisplayed());
    }

}
