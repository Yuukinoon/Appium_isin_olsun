package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;

public class JobPostingsPage {
    public AppiumDriver driver;
    Hooks hooks = new Hooks();

    @FindBy(id ="com.isinolsun.app:id/toolbar_title")
    private WebElement aramaSonuclari;

    public JobPostingsPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void assertToSuccessfulMessage(){
        hooks.waitForElement(driver,aramaSonuclari,10 );
        Assert.assertTrue(aramaSonuclari.isDisplayed());
    }
}
