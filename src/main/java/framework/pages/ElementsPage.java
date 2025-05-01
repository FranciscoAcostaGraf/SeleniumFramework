package framework.pages;

import static framework.ui.LocatorType.*;
import framework.config.ConfigReader;
import framework.ui.LocatorStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

    public final By textBox = LocatorStrategy.get(ID, "item-0");

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(By locator) {
        ui.click(locator);
    }

    public void navigateTo(String path) {
        String base = ConfigReader.get("base.url");
        if (base == null) {
            throw new RuntimeException("No se encontró 'base.url' en config.properties");
        }
        driver.get(base.replaceAll("/$", "") + "/" + path);
    }

    public void goToTextBox() {
        ui.click(textBox);
    }

    public void goToPage(String locator) {
        ui.click(LocatorStrategy.get(CONTAINS_TEXT, locator));
    }

    public void completeForm(){
        ui.type(LocatorStrategy.get(ID, "userName"), "Juanito Pablo Rearte");
        ui.type(LocatorStrategy.get(ID, "userEmail"), "gatitajugosa69@gmail.com");
        ui.type(LocatorStrategy.get(ID, "currentAddress"), "Chacabuco 25 ");
        ui.type(LocatorStrategy.get(ID, "permanentAddress"), "Tu hermana 420");
        ui.click(LocatorStrategy.get(ID, "submit"));
    }
}
