package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public AppiumDriver driver;

    @FindBy(id="com.isinolsun.app:id/search_edit_text_input")
    private WebElement searchButton;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

}
