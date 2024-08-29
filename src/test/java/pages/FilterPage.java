package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitElements;

public class FilterPage {
    public AppiumDriver driver;
    WaitElements waitElements = new WaitElements();

    @FindBy(id="com.isinolsun.app:id/radioDateLastSeven")
    private WebElement thisWeekButton;

    @FindBy(id="com.isinolsun.app:id/applyTypeApp")
    private WebElement applyTheAppButton;

    @FindBy(id="com.isinolsun.app:id/workTypeFullTime")
    private WebElement fullTimeButton;

    @FindBy(id="com.isinolsun.app:id/applyFilter")
    private WebElement applyFilterButton;

    public FilterPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickThisWeekButton(){
        waitElements.waitForElement(driver,thisWeekButton,10 );
        thisWeekButton.click();
    }

    public void clickApplyTheAppButton(){
        waitElements.waitForElement(driver,applyTheAppButton,10 );
        applyTheAppButton.click();
    }

    public void clickFullTimeButton(){
        waitElements.waitForElement(driver,fullTimeButton,10 );
        fullTimeButton.click();
    }

    public void clickApplyFilterButton(){
        waitElements.waitForElement(driver,applyFilterButton,10 );
        applyFilterButton.click();
    }
}
