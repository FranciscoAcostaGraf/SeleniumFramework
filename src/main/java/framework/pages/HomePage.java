package framework.pages;

import framework.ui.LocatorStrategy;
import static framework.ui.LocatorType.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By informesGestion = LocatorStrategy.get(CONTAINS_TEXT, "INFORMES DE GESTION");
    private final By comisionesNacionales = LocatorStrategy.get(NORMALIZE, "Reporte De Comisiones Nacionales");
    private final By comisionesInteracionales = LocatorStrategy.get(NORMALIZE, "Reporte De Comisiones Internacionales");
    private final By vencimientosNacionales = LocatorStrategy.get(NORMALIZE, "Reporte De Vencimiento Nacionales");
    private final By vencimientoInternacionales = LocatorStrategy.get(NORMALIZE, "Reporte De Vencimiento Internacionales");

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
