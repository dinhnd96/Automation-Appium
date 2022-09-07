package Test;


import PageObject.GodSendSceen;
import PageObject.HomePageVconomics;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

public class TestGodSend extends BaseTest {


    @Test
    public void ChooseNumberCase() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("fvkqansgjvrafzd@leadwizzer.com", "Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickGodsend();
        GodSendSceen godSendSceen = new GodSendSceen(driver);
        godSendSceen.ChooseNumber();

        godSendSceen.ClickResult();
        Thread.sleep(2000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        godSendSceen.ClickWonToday();
        Thread.sleep(2000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        godSendSceen.ClickRule();
        Thread.sleep(2000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }




}

