package Section9;



import PageObject.Android.CartPage;
import PageObject.Android.FormPage;
import PageObject.HomePageVconomics;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Section9.ExtentReporterNG.extentReports;

public class eCommerce_tc_1 extends BaseTest {
    HomePageVconomics homePageVconomics = new HomePageVconomics(driver);

    @Test
    public void Login() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("nguyenduydinh96@yahoo.com","Dinh12345");

    }

    @Test
    public void Vscore() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dnguyenduydinh96@yahoo.com","Dinh12345");
//        homePageVconomics.ClickVscore();
    }

    @Test
    public void Defibattle() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("nguyenduydinh96@yahoo.com","Dinh12345");
//        homePageVconomics.ClickDefibattle();
    }


}

