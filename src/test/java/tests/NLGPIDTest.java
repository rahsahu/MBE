package tests;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverWrapper;
import Wrapper.nlg.NLGPaymentPage;

public class NLGPIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "NLGEMPTY", groups = { "NLGEmpty","paymentAll","NLGMobile","all","AUPayment"})
	public void paymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		NLGPaymentPage np=new NLGPaymentPage();

		Reporter.log("\nVerification of footer links"); 
		util.elementPresent(np.CancelLink);
		util.elementPresent(np.termLink);
		util.elementPresent(np.privacyLink);
		util.elementPresent(np.contactUsLink);
		util.verifyContainText(np.mobileNumberTextBox, np.mobileNumberTextBoxValue);
		util.verifyContainText(np.mobileBeforeMNumTextField, np.mobileBeforeMNumTextFieldValue);
		util.verifyContainText(np.mobileFormP1, np.mobileFormP1Value);
		util.elementPresent(np.mobileSubmitButton);
		util.verifyContainText(np.mobileFormP2, np.mobileFormP2Value);
		util.elementPresent(np.firstTab);

	
	}

	@Test(dataProvider = "NLGEMPTY", groups = { "NLGEmpty","paymentAll","NLGPaypal","all","AUPayment" })
	public void paymentPaypalTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		NLGPaymentPage np=new NLGPaymentPage();

		util.findElement(np.secondTab).click();
		util.verifyContainText(np.PaypalFormHeading, np.PaypalFormHeadingValue);
		util.elementPresent(np.PaypalSubmitButton);

	
	}

	
	@Test(dataProvider = "NLGEMPTY", groups = { "NLGEmpty","paymentAll","NLGGoogleWallet","all","AUPayment" })
	public void paymentGoogleWalletTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		System.out.println("Opening URL : "+aURL);
		System.out.println("URL :"+driver.getCurrentUrl());
		NLGPaymentPage np=new NLGPaymentPage();

		util.findElement(np.thirdTab).click();
		
		util.verifyContainText(np.googleWalletHeading, np.googleWalletHeadingValue);	
		util.elementPresent(np.googleWalletSubmitButton);

	
	}
	
	@Test(dataProvider = "NLGEMPTY", groups = { "NLGEmpty","paymentAll","NLGLinks","all","AUPayment" })
	public void paymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		NLGPaymentPage np=new NLGPaymentPage();
		
		Reporter.log("\nverification of Term and condition page");		
		util.findElement(np.termLink).click();
		String winHandleBefore=driver.getWindowHandle();

		util.SwitchWindow();
		util.verifyTermAndConditionPage();

		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		Reporter.log("<b>\nverification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		util.verifyContactUsPage();
		driver.close();
		driver.switchTo().window(winHandleBefore);

		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		util.verifyPrivacyPolicyPage();

		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
