package pages;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;
import utilities.WaitElements;

public class LoginPage {
    public AppiumDriver driver;
    WaitElements waitElements = new WaitElements();

    @FindBy(id="com.isinolsun.app:id/bluecollar_type_button")
    private WebElement isAriyorumButton;


    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickIsAriyorumButton(){
        waitElements.waitForElement(driver,isAriyorumButton,10 );
        isAriyorumButton.click();
    }




}
