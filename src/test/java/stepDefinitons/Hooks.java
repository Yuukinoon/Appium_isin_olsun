package stepDefinitons;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.net.MalformedURLException;
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
    @BeforeStep
    public void beforeStep(){
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
