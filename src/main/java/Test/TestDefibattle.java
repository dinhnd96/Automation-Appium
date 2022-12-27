package Test;


import PageObject.HomePageVconomics;
import PageObject.WelcomPage;
import Trainning.BaseTest;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TestDefibattle extends BaseTest {


    @Test
    public void Defibattle() throws InterruptedException {
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.LogInAccount("dinhnd96@gmail.com", "Dinh1234");
        HomePageVconomics homePageVconomics = new HomePageVconomics(driver);
        homePageVconomics.ClickDefibattle();
        Thread.sleep(10000);
    }


}

