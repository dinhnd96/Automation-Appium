package Test;


import PageObject.HomePageVconomics;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TestLogin extends BaseTest {

//    @BeforeMethod
//    public void BeforeMethod() {
//        Activity activity = new Activity("com.vconomics", "com.vconomics.MainActivity");
//        driver.startActivity(activity);
//    }

    @Test(priority = 0, groups = "Smoke")
    public void Login() throws InterruptedException {

        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        Thread.sleep(5000);
        Assert.assertTrue(true);
    }

//    @Test(priority = 1)
//    public void ClickDefiBattle() throws InterruptedException {
////        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
////        driver.startActivity(activity);
//
//        Thread.sleep(5000);
//        WelcomPage welcomPage = new WelcomPage(driver);
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickDefibattle();
//    }

//    @Test(priority = 2)
//    public void ClickVscore() throws InterruptedException {
////        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
////        driver.startActivity(activity);
//        Thread.sleep(5000);
//        WelcomPage welcomPage = new WelcomPage(driver);
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickVscore();
//        Assert.fail("Đây là message lỗi");
//        Thread.sleep(5000);
//    }
//    @Test(priority = 3)
//    public void ClickVoucher() throws InterruptedException {
////        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
////        driver.startActivity(activity);
//        Thread.sleep(5000);
//        WelcomPage welcomPage = new WelcomPage(driver);
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickVoucher();
//        Thread.sleep(5000);
//    }
//    @Test(priority =4)
//    public void ClickRefferal() throws InterruptedException {
////        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
////        driver.startActivity(activity);
//        Thread.sleep(5000);
//        WelcomPage welcomPage = new WelcomPage(driver);
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickRefferal();
//        Thread.sleep(5000);
//    }
//    @Test(priority = 5)
//    public void ClickGodsend() throws InterruptedException {
////        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
////        driver.startActivity(activity);
//        Thread.sleep(5000);
//        WelcomPage welcomPage = new WelcomPage(driver);
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickGodsend();
//        Thread.sleep(5000);
//    }
//    @Test(priority = 6)
//    public void ClickVpool() throws InterruptedException {
////        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
////        driver.startActivity(activity);
//        Thread.sleep(5000);
//        WelcomPage welcomPage = new WelcomPage(driver);
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickVpool();
//        Thread.sleep(5000);
//    }
}

