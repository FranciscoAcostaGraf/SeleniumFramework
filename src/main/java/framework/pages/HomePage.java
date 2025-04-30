package framework.pages;

import framework.ui.LocatorStrategy;
import framework.ui.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public final By informesGestion = LocatorStrategy.get(LocatorType.CONTAINS_TEXT, "INFORMES DE GESTION");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickButton (By locator){
        ui.click(locator);
    }

    public void goToInformesGestion () {
        ui.click(informesGestion);
    }

}
