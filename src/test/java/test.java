import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class test {
    public AppiumDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    public String baseURL;

    @Test
    public void androidLaunchTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities androidCaps = new DesiredCapabilities();
        androidCaps.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
        androidCaps.setCapability("appium:automationName", "UIAutomator2");
        androidCaps.setCapability("appium:udid", "emulator-5554"); //DeviceId from "adb devices" command
        androidCaps.setCapability("appium:platformName", "Android");
        androidCaps.setCapability("appium:platformVersion", "14.0");
        androidCaps.setCapability("appium:skipUnlock", "true");
        androidCaps.setCapability("appium:app", System.getProperty("user.dir") + "\\src\\main\\resources\\isinOlsun.apk");
        androidCaps.setCapability("appium:fullReset", "true");
        androidCaps.setCapability("appium:noReset", "false");
        androidCaps.setCapability("appPackage", "com.isinolsun.app");
        androidCaps.setCapability("autoGrantPermissions", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), androidCaps);
        System.out.println("***** Android App *****");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.isinolsun.app:id/bluecollar_type_button"))).click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.id("com.isinolsun.app:id/bluecollar_type_button"))).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.isinolsun.app:id/search_edit_text_input"))).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("com.isinolsun.app:id/search_edit_text_input"))).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.isinolsun.app:id/search_edit_text_input"))).sendKeys("garson");
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("com.isinolsun.app:id/search_edit_text_input"))).sendKeys("garson");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.isinolsun.app:id/toolbarSearch"))).click();
       // wait.until(ExpectedConditions.elementToBeClickable(By.id("com.isinolsun.app:id/toolbarSearch"))).click();



    }
}
