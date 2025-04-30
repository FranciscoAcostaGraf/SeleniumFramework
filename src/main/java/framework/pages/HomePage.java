package framework.pages;

import framework.ui.LocatorStrategy;
import framework.ui.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By informesGestion = LocatorStrategy.get(LocatorType.CONTAINS_TEXT, "INFORMES DE GESTION");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    
}
