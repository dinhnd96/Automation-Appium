package Test;

import PageObject.HomePageVconomics;
import PageObject.VExScreen;
import PageObject.VpoolScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestVEx extends BaseTest {

    @BeforeMethod
    public void BeforeMethod(){
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
    }

    @Test(priority = 0)
    public void CheckTrendScreen() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        Thread.sleep(2000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVEx();
        VExScreen vExScreen = new VExScreen(driver);
        vExScreen.CheckNFTMostViewed();
    }
    @Test(priority = 1)
    public void CheckHotOfferScreen() throws InterruptedException {
        Thread.sleep(2000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVEx();
        VExScreen vExScreen = new VExScreen(driver);
        vExScreen.CheckHotOffer();
    }

    @Test(priority = 2)
    public void CheckNewNFTScreen() throws InterruptedException {
        Thread.sleep(2000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVEx();
        VExScreen vExScreen = new VExScreen(driver);
        vExScreen.CheckNewNFT();
    }

    @Test(priority = 3)
    public void CheckTopVexScreen() throws InterruptedException {
        Thread.sleep(2000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVEx();
        VExScreen vExScreen = new VExScreen(driver);
        vExScreen.CheckTopVex();
    }

}
