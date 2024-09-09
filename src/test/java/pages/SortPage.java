package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitElements;

public class SortPage {
    public AppiumDriver driver;
    WaitElements waitElements = new WaitElements();

    @FindBy(id="com.isinolsun.app:id/newOldSort")
    private WebElement newOldSortButton;

    @FindBy(id="com.isinolsun.app:id/apply_filter")
    private WebElement applyButton;

    public SortPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickNewOldSortButton(){
        waitElements.waitForElement(driver,newOldSortButton,10 );
        newOldSortButton.click();
    }

    public void clickApplyButton(){
        waitElements.waitForElement(driver,applyButton,10 );
        applyButton.click();
    }


}
