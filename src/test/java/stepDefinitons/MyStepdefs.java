package stepDefinitons;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginPage;
import utilities.Driver;

import java.net.MalformedURLException;

public class MyStepdefs {
    private AppiumDriver driver;
    LoginPage loginPage;

    @Given("the user open the application with android {int}")
    public void theUserOpenTheApplicationWithAndroid(int arg0) throws MalformedURLException, InterruptedException {

            AppiumDriver driver = Driver.getDriver();
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
            System.out.println("***** Android App *****");
    }


    @When("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {

    }

    @And("the user clicks the search button")
    public void theUserClicksTheSearchButton() {
    }

    @And("the user search for {string} jobs")
    public void theUserSearchForJobs(String arg0) {
    }

    @Then("the user can see the postings for {string} jobs")
    public void theUserCanSeeThePostingsForJobs(String arg0) {
    }
}
