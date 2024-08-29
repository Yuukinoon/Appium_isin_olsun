package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Hooks;
import utilities.WaitElements;

import java.time.Duration;

public class SearchPage {
    public AppiumDriver driver;
    public WebDriverWait wait;
    WaitElements waitElements = new WaitElements();

    @FindBy(id="com.isinolsun.app:id/search_edit_text_input")
    private WebElement jobNameInput;


    @FindBy(id="com.isinolsun.app:id/toolbarSearch")
    private WebElement searchButton2;


    public SearchPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setJobNameInput(String jobname){
        waitElements.waitForElement(driver,jobNameInput,10 );
        jobNameInput.sendKeys(jobname);
    }


    public void clickSearchButton2(){
        waitElements.waitForElement(driver,searchButton2,10 );
        searchButton2.click();
    }

}
