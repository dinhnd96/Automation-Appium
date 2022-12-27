package Test;


import PageObject.*;
import Trainning.BaseTest;
import org.testng.annotations.Test;

public class TestVLendingCreateLoan extends BaseTest {


//    @BeforeMethod
//    public void BeforeMethod() {
//        Activity activity = new Activity("com.vconomics", "com.vconomics.MainActivity");
//        driver.startActivity(activity);
//    }


    @Test(priority = 1)
    public void TestCreateLoan() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("jsawjexoncpi@scpulse.com", "Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        Thread.sleep(5000);
        homePageVconomics.ClickVLending();
        VLendingHomeScreen vLendingHomeScreen = new VLendingHomeScreen(driver);
        vLendingHomeScreen.CLickCloseAds();
        vLendingHomeScreen.CLickLendNow();
        LendNowScreen lendNowScreen = new LendNowScreen(driver);
        lendNowScreen.CreateLend();
        Thread.sleep(10000);
        lendNowScreen.CheckSuccess();
    }
}

