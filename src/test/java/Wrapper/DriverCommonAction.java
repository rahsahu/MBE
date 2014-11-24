package Wrapper;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DriverCommonAction {
	protected WebDriver driver = null;

	@DataProvider(name = "DP1")
	public static Object[][] createData() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "Pages", "Pages");

	}

	@DataProvider(name = "DPTWO")
	public static Object[][] createDataDPTWO() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "pid", "pidtwo");

	}

	@DataProvider(name = "DPAMOUNT")
	public static Object[][] createDataDPAmount() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "pid", "pidamount");

	}
	
	@BeforeMethod(groups={"loadDriver"},alwaysRun=true)
	public void LoadDriverBeforeTest() {
//		System.out.println("Before Metnod is getting called");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new FirefoxDriver(capabilities);
		

	}
	
	@DataProvider(name = "MProovTest")
	public static Object[][] createDataMProovTest() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "product", "MProovTest");

	}
	@DataProvider(name = "ProSportsTest")
	public static Object[][] createDataProSportsTest() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "product", "ProSportsTest");

	}
	
	@DataProvider(name = "AppyClubTest")
	public static Object[][] createDataAppyClubTest() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "product", "AppyClubTest");

	}	
	
	@DataProvider(name = "MHubTest")
	public static Object[][] createDataMHubTest() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "product", "MHubTest");

	}

	@DataProvider(name = "JooceyTest")
	public static Object[][] createDataJooceyTest() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "product", "JooceyTest");

	}
	
	@DataProvider(name = "InGameTest")
	public static Object[][] createDataInGameTestTest() {
		final String dir = System.getProperty("user.dir");
		System.out.println("current dir = " + dir);
		return UtilWrapper.getTableArray(dir
				+ "/src/test/resources/testdata/LINKS.xls", "product", "InGameTest");

	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
//		if(driver!=null)
			 driver.close();
	}
	
	@AfterTest(alwaysRun=true)
	public void teardown() {
		System.out.println("After Test is getting called");
		DriverWrapper.softAssert.assertAll();
		if(driver!=null)
		 driver.quit();
	}

	@DataProvider(name = "NLGEMPTY")
	public static  Object[][] createData(ITestContext context) {
		return getArray("NLG",context.getCurrentXmlTest().getParameter("Environment"));
	}

	@DataProvider(name = "HotMobileBabesEmpty")
	public static  Object[][] createDataHotMobileBabesEmpty(ITestContext context) {
		return getArray("HotMobileBabes",context.getCurrentXmlTest().getParameter("Environment"));
	}
	
	@DataProvider(name = "ProSportsEmpty")
	public static  Object[][] createDataprosportsEmpty(ITestContext context) {
		return getArray("ProSports",context.getCurrentXmlTest().getParameter("Environment"));
	}
	
	@DataProvider(name = "JooceyEmpty")
	public static  Object[][] createDataJooceyEmpty(ITestContext context) {
		return getArray("Joocey",context.getCurrentXmlTest().getParameter("Environment"));
	}
	
	@DataProvider(name = "TelstraOnDeskEmpty")
	public static  Object[][] createDataTelstraOnDeskEmpty(ITestContext context) {
		return getArray("TelstraOnDesk",context.getCurrentXmlTest().getParameter("Environment"));
	}
	
	@DataProvider(name = "mHubEmpty")
	public static  Object[][] createDatamHubEmpty(ITestContext context) {
		return getArray("mHub",context.getCurrentXmlTest().getParameter("Environment"));
	}
	
	@DataProvider(name = "FiiTREmpty")
	public static  Object[][] createDataFiiTREmpty(ITestContext context) {
		return getArray("FiiTR",context.getCurrentXmlTest().getParameter("Environment"));
	}
	
	@DataProvider(name = "InGameEmpty")
	public static  Object[][] createDataInGameEmpty(ITestContext context) {
		return getArray("InGame",context.getCurrentXmlTest().getParameter("Environment"));
	}
	
	@DataProvider(name = "mLoveEmpty")
	public static  Object[][] createDatamLoveEmpty(ITestContext context) {
		return getArray("mLove",context.getCurrentXmlTest().getParameter("Environment"));
	}
	@DataProvider(name = "mBrightEmpty")
	public static  Object[][] createDatamBrightEmpty(ITestContext context) {
		return getArray("mBright",context.getCurrentXmlTest().getParameter("Environment"));
	}
	@DataProvider(name = "mProovEmpty")
	public static  Object[][] createDatamProovEmpty(ITestContext context) {
		return getArray("mProov",context.getCurrentXmlTest().getParameter("Environment"));
	}
	@DataProvider(name = "GamesHausEmpty")
	public static  Object[][] createDataGamesHausEmpty(ITestContext context) {
		return getArray("GamesHaus",context.getCurrentXmlTest().getParameter("Environment"));
	}

	@DataProvider(name = "mBookClubEmpty")
	public static  Object[][] createDatamBookClubEmpty(ITestContext context) {
		return getArray("mBookClub",context.getCurrentXmlTest().getParameter("Environment"));
	}

	@DataProvider(name = "FreemiumEmpty")
	public static  Object[][] createDataFreemiumEmpty(ITestContext context) {
		return getArray("Freemium",context.getCurrentXmlTest().getParameter("Environment"));
	}

//	NLG
//	HotMobileBabes
//	ProSports
//	Joocey
//	TelstraOnDesk
//	mHub
//	FiiTR
//	InGame
//	mLove
//	mBright
//	mProov
//	GamesHaus
//	mBookClub
//	Freemium 
public static Object[][] getArray(String sheet,String Environment){
	final String dir = System.getProperty("user.dir");
	if(Environment.equalsIgnoreCase("stage"))
		return UtilWrapper.getTableArray(dir + "/src/test/resources/testdata/LINKS.xls", sheet, "StagePid");
	else
		return UtilWrapper.getTableArray(dir + "/src/test/resources/testdata/LINKS.xls", sheet, "EnvPid");
}
	
//	@DataProvider(name = "NLGGF")
//	public static  Object[][] createDataNLGGF(ITestContext context) {
//		final String dir = System.getProperty("user.dir");
//		
//		System.out.println("current dir = " + dir);
//		String Environment = context.getCurrentXmlTest().getParameter("Environment");
//		if(Environment.equalsIgnoreCase("stage"))
//		return UtilWrapper.getTableArray(dir
//				+ "/src/test/resources/testdata/LINKS.xls", "nlg", "Stagegf");
//		else
//			return UtilWrapper.getTableArray(dir
//					+ "/src/test/resources/testdata/LINKS.xls", "nlg", "Envgf");
//
//	}

}
