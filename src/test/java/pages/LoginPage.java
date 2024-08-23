package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public AppiumDriver driver;

    @FindBy(id="com.isinolsun.app:id/bluecollar_type_button")
    private WebElement isAriyorumButton;

    @FindBy(id="com.isinolsun.app:id/search_edit_text_input")
    private WebElement searchButton;

    @FindBy(id="com.isinolsun.app:id/search_edit_text_input")
    private WebElement jobNameInput;

    @FindBy(id="com.isinolsun.app:id/toolbarSearch")
    private WebElement searchButton2;

    @FindBy(id ="com.isinolsun.app:id/toolbar_title")
    private WebElement aramaSonuclari;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickIsAriyorumButton(){
        isAriyorumButton.click();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void setJobNameInput(String jobName){
        jobNameInput.sendKeys(jobName);
    }
    public void clickSearchButton2(){
        searchButton2.click();
    }

    public void assertToSuccessfulMessage(){
        Assert.assertTrue(aramaSonuclari.isDisplayed());
    }

}
