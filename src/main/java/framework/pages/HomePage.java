package framework.pages;

import framework.ui.LocatorStrategy;
import static framework.ui.LocatorType.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickButton (By locator){
        ui.click(locator);
    }

    public void goToInformesGestion() {
        ui.click(LocatorStrategy.get(CONTAINS_TEXT, "INFORMES DE GESTION"));
    }

    public void goToTabs(String locator){
        By link = LocatorStrategy.get(NORMALIZE, locator);
        ui.click(link);
    }
    

}
