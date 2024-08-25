package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPostingsPage {
    public AppiumDriver driver;

    @FindBy(id ="com.isinolsun.app:id/toolbar_title")
    private WebElement aramaSonuclari;

    public JobPostingsPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void assertToSuccessfulMessage(){
        Assert.assertTrue(aramaSonuclari.isDisplayed());
    }
}
