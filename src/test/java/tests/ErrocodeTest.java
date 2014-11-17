package tests;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverWrapper;
import Wrapper.GlobalSetup;
import Wrapper.MyReporter;
import Wrapper.UtilWrapper;
import Wrapper.nlg.NLGGatewayFailedPage;

public class ErrocodeTest extends DriverCommonAction  {

	private void commanTest(String aURL,String eCode){
	
		if(driver.manage().getCookies()!=null)
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		NLGGatewayFailedPage gp=new NLGGatewayFailedPage();
		MyReporter.log("Verification for Error Code "+driver.getCurrentUrl());
		util.elementPresent(gp.p);
		util.verifyContainText(new By.ByXPath(GlobalSetup.errorCodeXPATH.get(eCode)), GlobalSetup.errorMsg.get(eCode));
		if(!eCode.contains("15") || eCode.contains("16")){
			MyReporter.log("for error code "+eCode+" it wont check term contact us and privacy link in footer","red");
		util.findElement(gp.termLink);
		util.findElement(gp.contactUsLink);
		util.findElement(gp.privacyLink);
		}
		util.findElement(gp.homeLink);
		
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
	private void callCommonTest(String url,String pid)
	{
		String error[][]=UtilWrapper.getTableArray(GlobalSetup.xfilePath, "common", "errorcode");
		for (String[] errorid : error) {
			String aURL = url + "/gateway-failed/?pid="+pid+"&error_code="+errorid[0]+"&territory=AU";
			commanTest(aURL,errorid[0]);
		}
	}
	
	@Test(dataProvider = "NLGEMPTY", groups = { "NLGETest","AUAllETest","all"})
	public void GatewayFailedTestNLG(String url,String pid,String amount){
		callCommonTest(url,pid);
	}

	@Test(dataProvider = "ProSportsEmpty", groups = { "prosportsETest","AUAllETest","all"})
	public void GatewayFailedTestprosports(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "JooceyEmpty", groups = { "JooceyETest","AUAllETest","all"})
	public void GatewayFailedTestJoocey(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "TelstraOnDeskEmpty", groups = { "TelstraOnDeskETest","AUAllETest","all"})
	public void GatewayFailedTestTelstraOnDesk(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "mHubEmpty", groups = { "mHubETest","AUAllETest","all"})
	public void GatewayFailedTestmHubEmpty(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "FiiTREmpty", groups = { "FiiTRETest","AUAllETest","all"})
	public void GatewayFailedFiiTR(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}
	
	

	@Test(dataProvider = "InGameEmpty", groups = { "InGameETest","AUAllETest","all"})
	public void GatewayFailedInGame(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "mLoveEmpty", groups = { "mLoveETest","AUAllETest","all"})
	public void GatewayFailedmLove(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "mBrightEmpty", groups = { "mBrightETest","AUAllETest","all"})
	public void GatewayFailedmBright(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "mProovEmpty", groups = { "mProovETest","AUAllETest","all"})
	public void GatewayFailedmProov(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}
	
	@Test(dataProvider = "GamesHausEmpty", groups = { "mProovETest","AUAllETest","all"})
	public void GatewayFailedGamesHaus(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}

	@Test(dataProvider = "mBookClubEmpty", groups = { "mProovETest","AUAllETest","all"})
	public void GatewayFailedmBookClub(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}
	
	@Test(dataProvider = "FreemiumEmpty", groups = { "FreemiumETest","AUAllETest","all"})
	public void GatewayFailedFreemium(String url,String pid,String amount){
		
		callCommonTest(url,pid);
		
	}
	
}
