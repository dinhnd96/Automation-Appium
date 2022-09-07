package Test;


import PageObject.HomePageVconomics;
import PageObject.MissionScreen;
import PageObject.ReferralScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMissionScreen extends BaseTest {


    @BeforeMethod
    public void BeforeMethod() {
        Activity activity = new Activity("com.vconomics", "com.vconomics.MainActivity");
        driver.startActivity(activity);
    }


    @Test(priority = 0)
    public void TestMissionDay1() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(2000);
        homePageVconomics.ClickMission();
        Thread.sleep(2000);
        MissionScreen missionScreen = new MissionScreen(driver);
        missionScreen.CheckMissionDay1();
    }

    @Test(priority = 1)
    public void TestMissionDay2() throws InterruptedException {
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(2000);
        homePageVconomics.ClickMission();
        Thread.sleep(2000);
        MissionScreen missionScreen = new MissionScreen(driver);
        missionScreen.CheckMissionDay2();
    }

    @Test(priority = 2)
    public void TestMissionDay3() throws InterruptedException {
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(2000);
        homePageVconomics.ClickMission();
        Thread.sleep(2000);
        MissionScreen missionScreen = new MissionScreen(driver);
        missionScreen.CheckMissionDay3();
    }

    @Test(priority = 3)
    public void TestMissionDay4() throws InterruptedException {

        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(5000);
        homePageVconomics.ClickMission();
        MissionScreen missionScreen = new MissionScreen(driver);
        missionScreen.CheckMissionDay4();
    }

    @Test(priority = 4)
    public void TestMissionDay5() throws InterruptedException {
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(2000);
        homePageVconomics.ClickMission();
        Thread.sleep(2000);
        MissionScreen missionScreen = new MissionScreen(driver);
        missionScreen.CheckMissionDay5();
    }

    @Test(priority = 5)
    public void TestMissionDay6() throws InterruptedException {
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(2000);
        homePageVconomics.ClickMission();
        Thread.sleep(2000);
        MissionScreen missionScreen = new MissionScreen(driver);
        missionScreen.CheckMissionDay6();
    }

    @Test(priority = 6)
    public void TestMissionDay7() throws InterruptedException {
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(2000);
        homePageVconomics.ClickMission();
        Thread.sleep(2000);
        MissionScreen missionScreen = new MissionScreen(driver);
        missionScreen.CheckMissionDay7();
    }


}

