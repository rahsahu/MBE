package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class LoginTest {

	WebDriver driver = null;

//	@BeforeMethod(groups = { "loadDriver" }, alwaysRun = true)
//	public void LoadDriverBeforeTest() {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setBrowserName("firefox");
//		capabilities.setPlatform(Platform.WINDOWS);
//		driver = new FirefoxDriver(capabilities);
//	}

	@Test(groups={"totest"})
	public void validLoginTest() {
		SoftAssert softAssert=new SoftAssert();
		Assertion hardAssert = new Assertion();
//	driver.get("https://www.google.com");
	Reporter.log("Verifying for title of my account page");
	softAssert.assertEquals("expected", "Wrong Title");
	softAssert.assertEquals(true, false);
//	hardAssert.assertTrue(false);
//	hardAssert.assertEquals(true, false);
//	softAssert.assertAll();

	}

//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//		if (driver != null)
//			driver.quit();
//	}

}