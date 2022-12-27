package Test;


import PageObject.GodSendSceen;
import PageObject.HomePageVconomics;
import PageObject.VFactoryScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestVFactory extends BaseTest {
    @BeforeMethod
    public void BeforeMethod(){
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
    }

    @Test(priority = 0)
    public void CheckCreateNFT() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVfactory();
        VFactoryScreen vFactoryScreen = new VFactoryScreen(driver);
        vFactoryScreen.CreateNFT();
    }

    @Test(priority = 1)
    public void CheckNFTCreated() throws InterruptedException {
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVfactory();
        VFactoryScreen vFactoryScreen = new VFactoryScreen(driver);
        vFactoryScreen.CheckCreatedNFT();
    }




}

