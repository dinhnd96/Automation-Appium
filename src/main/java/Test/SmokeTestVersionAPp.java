package Test;



import PageObject.CommunityScreen;
import PageObject.HomePageVconomics;
import PageObject.ProfileScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import io.appium.java_client.android.Activity;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTestVersionAPp extends BaseTest {
//    @BeforeMethod
//    public void BeforeMethod(){
//        Activity activity = new Activity("com.vconomics","com.vconomics.MainActivity");
//        driver.startActivity(activity);
//    }

    @Test(priority = 0)
    public void CheckVersionApp() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com","Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickProfile();
        Thread.sleep(5000);
        ProfileScreen profileScreen = new ProfileScreen(driver);
        profileScreen.ScrollIntoVersion();
        String realResult = profileScreen.getVersionText();
        Assert.assertTrue(realResult.contains("1.5.12"));
    }

//    @Test(priority = 1)
//    public void checkPeopleOnApp() throws InterruptedException {
//        WelcomPage welcomPage = new WelcomPage(driver);
//        welcomPage.LogInAccount("nguyenduydinh96@yahoo.com","Dinh12345");
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickCommunity();
//        Thread.sleep(5000);
//        CommunityScreen communityScreen = new CommunityScreen(driver);
//        String realResult = communityScreen.GetTotalPeoPle();
//        double val = Double.parseDouble(realResult);
//        double minValue = 400000;
//        Assert.assertTrue(val > minValue);
//    }
//    @Test(priority = 1)
//    public void getSmartContract() throws InterruptedException {
//        WelcomPage welcomPage = new WelcomPage(driver);
//        welcomPage.LogInAccount("nguyenduydinh96@yahoo.com","Dinh12345");
//        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
//        homePageVconomics.ClickCommunity();
//        Thread.sleep(5000);
//        CommunityScreen communityScreen = new CommunityScreen(driver);
//        String realContract = communityScreen.getSmartContract();
//        String expectedConTract = "https://bscscan.com/address/0xd1aa23b0303fa7c0c60c8f1e3823240d6f530c81";
//        Assert.assertEquals(expectedConTract,realContract);
//    }

}

