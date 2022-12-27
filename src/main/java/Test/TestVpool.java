package Test;

import PageObject.HomePageVconomics;
import PageObject.VpoolScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestVpool extends BaseTest {

    @BeforeMethod
    public void BeforeMethod(){
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
    }
    @Test(priority = 0)
    public void StakingFlexibleWithOut2FA() throws InterruptedException {

        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        Thread.sleep(2000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVpool();
        Thread.sleep(2000);
        VpoolScreen vpoolScreen = new VpoolScreen(driver);
        vpoolScreen.SavingFlexible("2");
    }

    @Test(priority = 1)
    public void StakingLockedWithOut2FA() throws InterruptedException {

//        WelcomPage welcomPage = new WelcomPage(driver);
//        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        Thread.sleep(2000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVpool();
        Thread.sleep(2000);
        VpoolScreen vpoolScreen = new VpoolScreen(driver);
        vpoolScreen.SavingLocked("2");
    }

}
