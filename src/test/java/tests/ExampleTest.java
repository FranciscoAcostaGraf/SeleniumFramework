package tests;

import framework.drivers.DriverFactory;
import framework.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import io.qameta.allure.*;

@Epic("E-commerce UI Tests")
@Feature("Home Page Features")
public class ExampleTest {

    private WebDriver driver;
    private HomePage home;

    @BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser) {
        driver = DriverFactory.createDriver(browser);
        driver.get("https://tiendaqa.centyc.com.ar/");
        home = new HomePage(driver);
    }

    @Test(description = "Should display logo on the homepage")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Visual branding")
    @Description("Verify that the store logo is visible on page load")
    public void testLogoIsVisible() {
        home.verifyLogoIsVisible();
    }

    @Test(description = "Should return search results for a product")
    @Severity(SeverityLevel.NORMAL)
    @Story("Search functionality")
    @Description("Search for 'Necronomicón' and ensure results appear")
    public void testSearchProduct() {
        home.searchForProduct("Necronomicón");
        home.verifySearchResultsPresent();
    }

    @Test(description = "Should open the cart and show it's empty")
    @Severity(SeverityLevel.MINOR)
    @Story("Shopping cart")
    @Description("Click on cart icon and verify empty cart message is shown")
    public void testOpenCart() {
        home.openCart();
        home.verifyCartIsVisible();
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
