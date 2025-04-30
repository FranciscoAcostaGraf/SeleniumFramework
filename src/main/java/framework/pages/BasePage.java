package framework.pages;

import framework.ui.UiFunctions;
import framework.ui.UiValidations;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    protected UiFunctions ui;
    protected UiValidations validate;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.ui = new UiFunctions(driver);
        this.validate = new UiValidations(driver);
    }
}
