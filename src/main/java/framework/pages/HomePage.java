package framework.pages;

import framework.ui.LocatorStrategy;
import framework.ui.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By logo = LocatorStrategy.get(LocatorType.CSS_SELECTOR, "img.custom-logo");
    private final By searchInput = LocatorStrategy.get(LocatorType.CSS_SELECTOR, "input[type='search']");
    private final By searchButton = LocatorStrategy.get(LocatorType.CSS_SELECTOR, "button[type='submit']");
    private final By resultItem = LocatorStrategy.get(LocatorType.CSS_SELECTOR, ".woocommerce-loop-product__title");
    private final By cartIcon = LocatorStrategy.get(LocatorType.CSS_SELECTOR, "a.cart-contents");
    private final By cartTitle = LocatorStrategy.get(LocatorType.CSS_SELECTOR, ".cart-empty");

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
