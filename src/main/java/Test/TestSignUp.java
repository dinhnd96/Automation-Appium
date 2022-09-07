package Test;


import PageObject.SignUpPage;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignUp extends BaseTest {
//    @BeforeMethod
//    public void BeforeMethod(){
//        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
//        driver.startActivity(activity);
//    }

    @Test(priority = 1)
    public void CreateAccount() throws InterruptedException {
        String account = "abcd211@gmail.com";

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.SignUpAccount(account, "Dinh1234", "dinh", "");
        Thread.sleep(5000);
        Activity activity = new Activity("com.vconomics", "com.vconomics.MainActivity");
        driver.startActivity(activity);
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount2(account, "Dinh1234");

    }


}

