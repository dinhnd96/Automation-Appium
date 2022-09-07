package Test;


import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class SmokeTestLogin extends BaseTest {
    @BeforeMethod
    public void BeforeMethod() {
        Activity activity = new Activity("com.vconomics", "com.vconomics.MainActivity");
        driver.startActivity(activity);
    }
//    @Test(priority = 0 )
//    public void LoginFail() throws InterruptedException {
//        WelcomPage welcomPage = new WelcomPage(driver);
//        welcomPage.LoginFail("dinhnd96@gmail.com","Dinh123456");
//        Thread.sleep(5000);
//
//    }

    @Test(priority = 1, dataProvider = "getData")
    public void LoginSusscess(HashMap<String, String> input) throws InterruptedException {

        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount(input.get("email"), input.get("password"));
        Thread.sleep(5000);
    }

    @DataProvider
    public Object[][] getData() throws IOException {
//        return new Object[][] {{"dinhnd96@gmail.com","Dinh1234"},{"nguyenduydinh96@yahoo.com","Dinh1234"}};
        List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir") + "//src//Data//data.json");
        return new Object[][]{{data.get(0)}, {data.get(1)}};

    }

}

