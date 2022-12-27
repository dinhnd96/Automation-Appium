package Test;


import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class LoginWithFacebook extends BaseTest {
    @BeforeMethod
    public void BeforeMethod(){
        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
        driver.startActivity(activity);
    }

    @Test(priority = 1)
    public void LoginSusscessWithFacebook() throws InterruptedException {

        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LoginWithFacebook("nguyenduydinh96@yahoo.com", "Dinh12345");
        Thread.sleep(5000);
//        Set<String> contexts = driver.getContextHandles();
//        for(String contextName : contexts) {
//            System.out.println(contextName);
//        }
//
//        driver.context("WEBVIEW_chrome");
//        System.out.println(driver.findElement(By.name("email")).getAttribute("rqnankohcq_1657793872@tfbnw.net"));
////        if (driver.findElement(By.name("email")).getText().contains("rqnankohcq_1657793872@tfbnw.net")){
////            driver.findElement(By.name("pass")).sendKeys("Dinh1234");
////        }else {
////            driver.findElement(By.name("email")).sendKeys("rqnankohcq_1657793872@tfbnw.net");
////
////        }
//        driver.findElement(By.id("m_login_password")).sendKeys("Dinh1234");
//        driver.findElement(By.name("login")).click();
//        Thread.sleep(15000);
//        driver.findElement(By.xpath("//android.widget.Button[@bounds='[63,1305][1017,1425]']")).click();
//
////        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
////        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//        driver.context("NATIVE_APP");
//        Thread.sleep(5000);
    }


}

