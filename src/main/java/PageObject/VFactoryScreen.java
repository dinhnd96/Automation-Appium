package PageObject;

import PageObject.Android.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Set;

public class VFactoryScreen extends AndroidActions {
    AndroidDriver driver;

    public VFactoryScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        System.out.println("Day laf constructor");
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//android.widget.TextView[@text='List of NFT']")
    private WebElement listOfNFTBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[450,1967][630,2147]']")
    private WebElement createNFTBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[567,1789][693,1912]']")
    private WebElement chooseImgBtn;

    @FindBy(xpath = "//android.widget.ImageView[@bounds='[564,664][1080,1180]']")
    private WebElement thumbnailImgBtn;

    @FindBy(xpath = "//android.widget.ImageView[@bounds='[272,278][538,544]']")
    private WebElement secondImgBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[281,1367][799,1483]']")
    private WebElement confirmBtn;

    // Update NFT Screen
    @FindBy(xpath = "//android.widget.TextView[@text='Virtual World']")
    private WebElement vitualWorldOptions;

    @FindBy(xpath = "//android.widget.EditText[@text='Item name']")
    private WebElement nftNameField;

    @FindBy(xpath = "//android.widget.EditText[@text='Enter description no more than 1000 characters']")
    private WebElement descriptionField;

    @FindBy(xpath = "//android.widget.EditText[@bounds='[43,1882][526,2000]']")
    private WebElement priceField;

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[43,2036][1037,2170]']")
    private WebElement submitBtn;

    // List of NFT Screen
    @FindBy(xpath = "//android.widget.TextView[@bounds='[72,1747][1008,1825]']")
    private WebElement nftNameCreated;

    public void  CreateNFT() throws InterruptedException {
        Thread.sleep(2000);
        createNFTBtn.click();
        Thread.sleep(2000);
        createNFTBtn.click();
        Thread.sleep(2000);
        chooseImgBtn.click();
        Thread.sleep(2000);
        thumbnailImgBtn.click();
        Thread.sleep(2000);
        secondImgBtn.click();
//        confirmBtn.click();
        vitualWorldOptions.click();
        nftNameField.sendKeys("Dinh");
        descriptionField.sendKeys("Khong phai Dinh");
        priceField.sendKeys("1000");
        Thread.sleep(2000);
        submitBtn.click();
    }

    public void  CheckCreatedNFT() throws InterruptedException {
        listOfNFTBtn.click();
        String actualNftNameCreated = nftNameCreated.getAttribute("text");
        Assert.assertEquals(actualNftNameCreated,"Dinh");

    }

}
