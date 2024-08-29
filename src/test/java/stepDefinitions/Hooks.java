package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Hooks {
    public WebDriverWait wait;
    public AppiumDriver driver;


    @Before
    public void beforeScenario() throws MalformedURLException {
        Driver.getDriver();
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    }



    @After
    public void afterScenario(){
        Driver.closeDriver();
    }


}
