package Test;


import PageObject.HomePageVconomics;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import org.testng.annotations.Test;

public class TestDefibattle extends BaseTest {


    @Test
    public void Defibattle() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("nguyenduydinh96@yahoo.com", "Dinh12345");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickDefibattle();
        Thread.sleep(10000);
    }


}

