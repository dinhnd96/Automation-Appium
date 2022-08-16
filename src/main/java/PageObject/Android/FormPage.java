package PageObject.Android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    AndroidDriver driver;
//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
//        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).click();
//        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Nguyen Duy Dinh");
    public FormPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    };

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement nameField;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Female']")
    private WebElement femalelOptions;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Female']")
    private WebElement maleOptions;

    public void setNameField(String name){
        nameField.sendKeys(name);
        driver.hideKeyboard();
    }

    public void setGender(String gender){
        if (gender.contains("female")) {
            femalelOptions.click();
        } else {
            maleOptions.click();
        }
    }
}
