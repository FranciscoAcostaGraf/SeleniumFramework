package framework.pages;

import static framework.ui.LocatorType.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.ui.LocatorStrategy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickButton (By locator){
        ui.click(locator);
    }

    public void goToPage(String locator){
        By link = LocatorStrategy.get(CLASS_NAME, locator);
        ui.click(link);
    }

}
