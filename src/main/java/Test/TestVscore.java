package Test;



import PageObject.HomePageVconomics;
import PageObject.VscoreScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVscore extends BaseTest {





    @Test(priority = 0)
    public void Vscore() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("nguyenduydinh96@yahoo.com","Dinh12345");
        Thread.sleep(5000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVscore();
        Thread.sleep(5000);

        VscoreScreen vscoreScreen = new VscoreScreen(driver);
        vscoreScreen.clickBellBtn();
        Thread.sleep(2000);
        vscoreScreen.clickBackBtnBell();
        Thread.sleep(2000);
        vscoreScreen.clickHistoryBtn();
        vscoreScreen.clickBackBtnSurveyHistory();
        vscoreScreen.clickSurveyBtn();
        vscoreScreen.clickLoanBtn();
        vscoreScreen.clickDepositBtn();


    }

    @Test(priority = 1)
    public void CheckSurVeyScreen() throws InterruptedException {
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
        Thread.sleep(5000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVscore();
        VscoreScreen vscoreScreen = new VscoreScreen(driver);

        // Credit history screen
        vscoreScreen.clickSurveyBtn();
        vscoreScreen.clickCreditHistoryBtn();
        vscoreScreen.clickBackBtnSurveyScreen();

        // Personal Profile screen
        vscoreScreen.clickPersonalProfileBtn();
        vscoreScreen.clickBackBtnBell();

        // Finance screen
        vscoreScreen.clickFinanceBtn();
        vscoreScreen.clickBackBtnFinanceScreen();

        // Characteristics screen
        vscoreScreen.clickCharacteristicBtn();
        vscoreScreen.clickBackBtnFinanceScreen();

    }

}

