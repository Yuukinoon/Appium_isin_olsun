package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitElements;

public class HomePage {
    public AppiumDriver driver;
    WaitElements waitElements = new WaitElements();
    @FindBy(id="com.isinolsun.app:id/search_edit_text_input")
    private WebElement searchButton;

    @FindBy(id="com.isinolsun.app:id/sort_order_cv")
    private WebElement sortOrderButton;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickSearchButton(){
        waitElements.waitForElement(driver,searchButton,10 );
        searchButton.click();
    }

    public void clickSortOrderButton(){
        waitElements.waitForElement(driver,sortOrderButton,10 );
        sortOrderButton.click();
    }

}
