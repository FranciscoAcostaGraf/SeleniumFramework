package tests;

import framework.pages.HomePage;
import io.qameta.allure.*;
import tests.base.BaseTest;
import org.testng.annotations.*;
import org.testng.ITestResult;

@Feature("Navigation")
public class NavigationTest extends BaseTest {

    private HomePage home;

    @BeforeMethod
    @Parameters("browser")
    public void init(@Optional("chrome") String browser) {
        super.setUp(browser);
        home = new HomePage(getDriver());
    }

    @Test(description = "Test Description")
    public void function() {
        
    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        super.tearDown(result);
    }
}