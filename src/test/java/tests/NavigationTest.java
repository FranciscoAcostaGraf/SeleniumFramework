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

    @Test(description = "Should navigate to diff tabs")
    @Description("Verify that I can access to informes de gestión")
    public void navigateThroughTabs() {
        home.goToInformesGestion();
        home.goToTabs("Reporte De Comisiones Nacionales");
        home.goToTabs("Reporte De Comisiones Internacionales");
        home.goToTabs("Reporte De Vencimiento Nacionales");
        home.goToTabs("Reporte De Vencimiento Internacionales");
    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        super.tearDown(result);
    }
}
