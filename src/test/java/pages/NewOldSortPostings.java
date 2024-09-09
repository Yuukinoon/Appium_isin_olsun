package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitElements;

public class NewOldSortPostings {
    public AppiumDriver driver;
    WaitElements waitElements = new WaitElements();

    @FindBy(id="com.isinolsun.app:id/totalCountHeader")
    private WebElement currentPostings;

    public NewOldSortPostings(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void assertToSuccesMessage(){
        waitElements.waitForElement(driver,currentPostings,20 );
        Assert.assertTrue(currentPostings.isDisplayed());
    }

}
