package framework.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import framework.config.ConfigReader;

public class UiValidations {

    private WebDriver driver;

    public UiValidations(WebDriver driver) {
        this.driver = driver;
    }

    public void assertElementVisible(By locator) {
        WebElement element = driver.findElement(locator);
        Assert.assertTrue(element.isDisplayed(), "Expected element to be visible: " + locator);
    }

    public void assertTextEquals(By locator, String expectedText) {
        String actualText = driver.findElement(locator).getText();
        Assert.assertEquals(actualText, expectedText, "Text mismatch at: " + locator);
    }

    public void assertElementExists(By locator) {
        Assert.assertTrue(driver.findElements(locator).size() > 0, "Expected element to exist: " + locator);
    }

    public void verifyLink(String endpoint){
        Assert.assertTrue(driver.getCurrentUrl().contains(endpoint));
    }
}
