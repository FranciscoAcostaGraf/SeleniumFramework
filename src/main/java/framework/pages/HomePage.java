package framework.pages;

import static framework.ui.LocatorType.*;

import framework.config.ConfigReader;
import framework.ui.LocatorStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public final By textBox = LocatorStrategy.get(ID, "item-0");

    public HomePage(WebDriver driver) {
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
        By link = LocatorStrategy.get(CONTAINS_TEXT, locator);
        ui.click(link);
    }
    
}
