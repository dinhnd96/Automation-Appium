package Section9;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class AppiumUtils {
    public String getScreenShotPath(String testCaseName , AppiumDriver driver) throws IOException {

        File source =  driver.getScreenshotAs(OutputType.FILE);
        String destinationFile =System.getProperty("user.dir") + "\\report\\"+testCaseName+".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;
    }
}
