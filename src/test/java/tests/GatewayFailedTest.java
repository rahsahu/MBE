package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverWrapper;
import Wrapper.nlg.NLGGatewayFailedPage;

public class GatewayFailedTest extends DriverCommonAction  {

	private void commanTest(String aURL){
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		NLGGatewayFailedPage gp=new NLGGatewayFailedPage();
		util.elementPresent(gp.p);
		util.verifyContainText(gp.p, gp.pValue1);
		util.verifyContainText(gp.p, gp.pValue2);
		util.verifyContainText(gp.p, gp.pValue3);
		
//		Reporter.log("\nverification of Term and condition page");		
//		util.findElement(gp.termLink).click();
//		String winHandleBefore=driver.getWindowHandle();
//
//		util.SwitchWindow();
//		util.verifyTermAndConditionPage();
//
//		driver.close();
//		driver.switchTo().window(winHandleBefore);
//	
//		Reporter.log("<b>\nverification of Contact US page</b>");
//		util.findElement(gp.contactUsLink).click();
//		util.SwitchWindow();
//		util.verifyContactUsPage();
//		driver.close();
//		driver.switchTo().window(winHandleBefore);
//
//		
//		util.findElement(gp.privacyLink).click();
//		util.SwitchWindow();
//		Reporter.log("\nverification of Privacy Policy page");
//		util.verifyPrivacyPolicyPage();
//
//		
//		driver.close();
//		driver.switchTo().window(winHandleBefore);


	}
	
	@Test(dataProvider = "NLGEMPTY", groups = { "NLGGF","AUAllGF","all"})
	public void GatewayFailedTestNLG(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "ProSportsEmpty", groups = { "prosportsGF","AUAllGF","all"})
	public void GatewayFailedTestprosports(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "JooceyEmpty", groups = { "JooceyGF","AUAllGF","all"})
	public void GatewayFailedTestJoocey(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "TelstraOnDeskEmpty", groups = { "TelstraOnDeskGF","AUAllGF","all"})
	public void GatewayFailedTestTelstraOnDesk(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "mHubEmpty", groups = { "mHubGF","AUAllGF","all"})
	public void GatewayFailedTestmHubEmpty(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "FiiTREmpty", groups = { "FiiTRGF","AUAllGF","all"})
	public void GatewayFailedFiiTR(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}
	
	

	@Test(dataProvider = "InGameEmpty", groups = { "InGameGF","AUAllGF","all"})
	public void GatewayFailedInGame(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "mLoveEmpty", groups = { "mLoveGF","AUAllGF","all"})
	public void GatewayFailedmLove(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "mBrightEmpty", groups = { "mBrightGF","AUAllGF","all"})
	public void GatewayFailedmBright(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "mProovEmpty", groups = { "mProovGF","AUAllGF","all"})
	public void GatewayFailedmProov(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}
	
	@Test(dataProvider = "GamesHausEmpty", groups = { "mProovGF","AUAllGF","all"})
	public void GatewayFailedGamesHaus(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}

	@Test(dataProvider = "mBookClubEmpty", groups = { "mProovGF","AUAllGF","all"})
	public void GatewayFailedmBookClub(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}
	
	@Test(dataProvider = "FreemiumEmpty", groups = { "FreemiumGF","AUAllGF","all"})
	public void GatewayFailedFreemium(String url,String pid,String amount){
		String aURL = url + "/gateway-failed/?pid="+pid+"&territory=AU";
		commanTest(aURL);
		
	}
	
}
