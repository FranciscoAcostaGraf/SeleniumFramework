package tests.base;

import framework.drivers.DriverFactory;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public abstract class BaseTest {

    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    @BeforeMethod
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        System.out.println("=== Test started on: " + browser + " ===");
        WebDriver driver = DriverFactory.createDriver(browser);
        driverThreadLocal.set(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        WebDriver driver = getDriver();

        if (!result.isSuccess()) {
            saveScreenshot(result.getMethod().getMethodName());
        }

        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
        System.out.println("=== Test finished: " + result.getMethod().getMethodName() + " ===");
    }

    protected WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    @Attachment(value = "Screenshot on failure - {0}", type = "image/png")
    private byte[] saveScreenshot(String methodName) {
        WebDriver driver = getDriver();
        if (driver instanceof TakesScreenshot) {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }
        return new byte[0];
    }
}
