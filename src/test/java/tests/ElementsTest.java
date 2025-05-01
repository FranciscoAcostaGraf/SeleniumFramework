package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import framework.pages.ElementsPage;
import io.qameta.allure.Feature;
import tests.base.BaseTest;

@Feature("Elements")
public class ElementsTest extends BaseTest {

    private ElementsPage home;

    @BeforeMethod
    @Parameters("browser")
    public void init(@Optional("chrome") String browser) {
        home = new ElementsPage(getDriver());
    }

    @Test(description = "Test Description")
    public void completeForm() {
        home.navigateTo("elements");
        home.goToTextBox();
        home.completeForm();

    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        super.tearDown(result);
    }

}