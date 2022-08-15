package Section10;

import Trainning.BrowserBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBroserTest extends BrowserBaseTest {
    @Test
    public void browserTest(){
//        driver.get("https://www.google.com/");
//        driver.findElement(By.name("q")).sendKeys("Vcononomics");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        driver.findElement(By.xpath("//a[@routerlink='/products']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        String name = driver.findElement(By.xpath("//a[normalize-space()='Devops']")).getText();
        Assert.assertEquals(name,"Devops");
    }
}
