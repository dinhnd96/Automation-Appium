package Test;


import PageObject.HomePageVconomics;
import PageObject.ReferralScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TestReferralScreen extends BaseTest {


    @BeforeMethod
    public void BeforeMethod() {
        Activity activity = new Activity("com.vconomics", "com.vconomics.MainActivity");
        driver.startActivity(activity);
    }


    @Test(priority = 1)
    public void TestReferralCode() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(5000);
        homePageVconomics.ClickRefferal();
        ReferralScreen referralScreen = new ReferralScreen(driver);
        referralScreen.CheckReferralCode();
    }

    @Test(priority = 1)
    public void TestTotalReferral() throws InterruptedException {
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(5000);
        homePageVconomics.ClickRefferal();
        ReferralScreen referralScreen = new ReferralScreen(driver);
        referralScreen.CheckTotalReferral();
    }


}

