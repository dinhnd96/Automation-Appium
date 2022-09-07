package Test;

import PageObject.HomePageVconomics;
import PageObject.VpoolScreen;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import org.testng.annotations.Test;

public class TestVpool extends BaseTest {


    @Test(priority = 0)
    public void Login() throws InterruptedException {

        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        Thread.sleep(2000);
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickVpool();
        Thread.sleep(2000);
        VpoolScreen vpoolScreen = new VpoolScreen(driver);
        vpoolScreen.SavingFlexible("2");
    }
}
