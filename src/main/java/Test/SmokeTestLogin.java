package Test;



import PageObject.CommunityScreen;
import PageObject.HomePageVconomics;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTestLogin extends BaseTest {
    @BeforeMethod
    public void BeforeMethod(){
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
    }
    @Test(priority = 0)
    public void LoginFail() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LoginFail("nguyenduydinh96@yahoo.com","Dinh123456");
        Thread.sleep(5000);

    }

    @Test(priority = 1)
    public void LoginSusscess() throws InterruptedException {

        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("nguyenduydinh96@yahoo.com","Dinh12345");
        Thread.sleep(5000);
    }


}

