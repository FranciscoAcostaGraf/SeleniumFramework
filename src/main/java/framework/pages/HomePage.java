package framework.pages;

import framework.ui.LocatorStrategy;
import framework.ui.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By logo = LocatorStrategy.get(LocatorType.CSS_SELECTOR, "img.custom-logo");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyLogoIsVisible() {
        validate.assertElementVisible(logo);
    }

    public void searchForProduct(String product) {
        ui.type(searchInput, product);
        ui.click(searchButton);
    }

    public void verifySearchResultsPresent() {
        validate.assertElementVisible(resultItem);
    }

    public void openCart() {
        ui.click(cartIcon);
    }

    public void verifyCartIsVisible() {
        validate.assertElementVisible(cartTitle);
    }
}
