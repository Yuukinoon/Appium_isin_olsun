package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import pages.JobPostingsPage;
import pages.LoginPage;
import pages.SearchPage;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;

public class MyStepdefs {

    private AppiumDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    SearchPage searchPage;
    JobPostingsPage jobPostingsPage;

    @Given("the user open the application with android")
    public void theUserOpenTheApplicationWithAndroid() throws MalformedURLException {

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
        driver = Driver.getDriver();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), androidCaps);

    }

    @When("the user clicks the is ariyorum button")
    public void theUserClicksTheisAriyorumButton() {
        loginPage.clickIsAriyorumButton();

    }

    @And("the user clicks the search button")
    public void theUserClicksTheSearchButton() {
        homePage.clickSearchButton();

    }

    @And("the user search for job name as {string} jobs")
    public void theUserSearchForJobs(String string) {
        loginPage = new LoginPage(driver);
        searchPage.setJobNameInput("jobname");

    }

    @Then("the user clicks the second search button")
    public void theUserClicksTheSecondSearchButton() {
        searchPage.clickSearchButton2();

    }

    @And("the user can see the postings for job name as {string} jobs")
    public void theUserCanSeeThePostingsForJobs(String string) {
        jobPostingsPage.assertToSuccessfulMessage();


    }

}
