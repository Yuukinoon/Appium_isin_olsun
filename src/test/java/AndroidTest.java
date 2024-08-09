import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidTest {
    public AppiumDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    public String baseURL;
    @Test
    public void androidLaunchTest() throws MalformedURLException, InterruptedException{
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

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), androidCaps);
        //wait = new WebDriverWait(driver, 10);
        System.out.println("***** Android App *****");

      //DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone64_x86_64"); // Android emülatör veya cihaz adı
//        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\dozyaz\\IdeaProjects\\Appium_isinOlsun\\src\\main\\resources\\isinOlsun - Job Search_5.4.4GMS_APKPure.apk"); // APK dosyasının yolu
//        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.isinolsun.app"); // Uygulama paket adı
//       // capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ""); // Ana aktivite adı
//        driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);
//
//
//        //AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//
//
//        UiAutomator2Options options = new UiAutomator2Options();
//
//
//        //create object for AndroidDriver
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//
//        // Wait for and click on the blue collar type button element
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id=\"com.isinolsun.app:id/bluecollar_type_button\"]"))).click();

        // Wait for and click on the permission allow button element
       // wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_button"))).click();

       // wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_deny_button"))).click();





    }

}
