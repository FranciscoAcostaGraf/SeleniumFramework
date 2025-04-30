package tests;

import framework.ui.*;
import framework.pages.HomePage;
import io.qameta.allure.*;
import tests.base.BaseTest;

import org.testng.ITestResult;
import org.testng.annotations.*;

@Feature("Navigation")
public class NavigationTest extends BaseTest{

    private HomePage home;

    @BeforeMethod
    @Parameters("browser")
    public void initHomePage(@Optional("chrome") String browser) {
        super.setUp(browser); // ya navega automáticamente
        home = new HomePage(getDriver());
    }

    @Test(description = "Should navigate to diff tabs")
    @Description("Verify that i can access to informes de gestion")
    public void navigateThroughTabs() {
        home.goToInformesGestion();
    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        super.tearDown(result);
    }
}
