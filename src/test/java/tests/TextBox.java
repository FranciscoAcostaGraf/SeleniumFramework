package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import framework.pages.HomePage;
import io.qameta.allure.Feature;
import tests.base.BaseTest;

@Feature("TextBox")
public class TextBox extends BaseTest {

    private HomePage home;

    @BeforeMethod
    @Parameters("browser")
    public void init(@Optional("chrome") String browser) {
        super.setUp(browser);
        home = new HomePage(getDriver());
    }

    @Test(description = "Test Description")
    public void completeForm() {
        home.goToPage("card mt-4 top-card");
    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        super.tearDown(result);
    }

}