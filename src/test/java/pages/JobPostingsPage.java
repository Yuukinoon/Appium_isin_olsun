package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitElements;

public class JobPostingsPage {
    public AppiumDriver driver;
    WaitElements waitElements = new WaitElements();

    @FindBy(xpath ="//android.widget.TextView[contains(@text,\"bulundu \")]")
    private WebElement aramaSonuclari;

    @FindBy(id="com.isinolsun.app:id/main_filter_cv")
    private WebElement filterButton;



    public JobPostingsPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickApplyFilterButton(){
        waitElements.waitForElement(driver,filterButton,10 );
        filterButton.click();
    }

    public void assertToSuccessfulMessage(){
        waitElements.waitForElement(driver,aramaSonuclari,10 );
        Assert.assertTrue(aramaSonuclari.isDisplayed());
    }

}
