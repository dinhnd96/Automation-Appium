package Test;


import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWithGoogle extends BaseTest {
    @BeforeMethod
    public void BeforeMethod(){
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
    }

    @Test(priority = 1)
    public void LoginSusscessWithGoogle() throws InterruptedException {

        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LoginWithGoogle("nguyenduydinh96@yahoo.com", "Dinh12345");
        Thread.sleep(2000);
    }


}

