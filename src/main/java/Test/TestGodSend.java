package Test;


import PageObject.GodSendSceen;
import PageObject.HomePageVconomics;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TestGodSend extends BaseTest {


    @Test(priority = 0)
    public void CheckGodSend() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickGodsend();
        GodSendSceen godSendSceen = new GodSendSceen(driver);
//        godSendSceen.ChooseNumber();

        godSendSceen.ClickResult();
        Thread.sleep(2000);

        godSendSceen.ClickWonToday();
        Thread.sleep(2000);

        godSendSceen.ClickRule();
        Thread.sleep(2000);
    }






}

