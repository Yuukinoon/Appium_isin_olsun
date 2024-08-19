package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private static AppiumDriver driver;


    public static AppiumDriver getDriver() throws MalformedURLException {
        DesiredCapabilities androidCaps = new DesiredCapabilities();
        if(driver == null){
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), androidCaps);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
