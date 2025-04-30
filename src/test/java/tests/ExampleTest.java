package tests;

import framework.base.BaseTest;
import framework.ui.*;
import framework.pages.HomePage;
import io.qameta.allure.*;

import org.testng.ITestResult;
import org.testng.annotations.*;

@Epic("E-commerce UI Tests")
@Feature("Home Page Features")
public class ExampleTest extends BaseTest {

    private HomePage home;

    @BeforeMethod
    @Parameters("browser")
    public void initHomePage(@Optional("chrome") String browser) {
        super.setUp(browser); // ya navega automáticamente
        home = new HomePage(getDriver());
    }

    @Test(description = "Should display logo on the homepage")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Visual branding")
    @Description("Verify that the store logo is visible on page load")
    public void testLogoIsVisible() {
        home.
    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        super.tearDown(result);
    }
}
