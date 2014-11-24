package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.nlg.NLGPaymentPage;

public class RUNLGSubscribeTest extends DriverCommonAction {

	

	@Test(dataProvider = "NLGEMPTY", groups = { "RUNLGEmpty","RUpaymentAll","RUNLGMobile","all","RUPayment"})
	public void paymentMobileTabTest(String url,String pid,String amount) throws Exception {
		
	//	new PIDTest().paymentMobileTabTest(url, pid, amount);
		String aURL = url + "/?pid="+pid+"&territory=RU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		NLGPaymentPage np=new NLGPaymentPage();

		Reporter.log("\nVerification of footer links"); 
//		util.elementPresent(np.RUCancelLink);
		util.elementPresent(np.RUtermLink);
		util.elementPresent(np.RUprivacyLink);
		util.elementPresent(np.RUcontactUsLink);
		util.verifyContainText(np.RUmobileNumberTextBox, np.mobileNumberTextBoxValue);
		util.verifyContainText(np.RUmobileBeforeMNumTextField, np.mobileBeforeMNumTextFieldValue);
		util.verifyContainText(np.RUmobileFormP1, np.mobileFormP1Value);
		util.elementPresent(np.RUmobileSubmitButton);
		util.verifyContainText(np.RUmobileFormP2, np.mobileFormP2Value);
//		util.elementPresent(np.RUfirstTab);

	
	}
	
	@Test(dataProvider = "NLGEMPTY", groups = { "RUNLGEmpty","paymentAll","NLGLinks","all","RUPayment" })
	public void paymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=RU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		NLGPaymentPage np=new NLGPaymentPage();
		
		Reporter.log("\nverification of Term and condition page");		
		util.findElement(np.termLink).click();
//		String winHandleBefore=driver.getWindowHandle();

//		util.SwitchWindow();
		util.verifyTermAndConditionPage();

//		driver.close();
//		driver.switchTo().window(winHandleBefore);
		driver.navigate().back();
		Reporter.log("<b>\nverification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		util.verifyContactUsPage();
//		driver.close();
//		driver.switchTo().window(winHandleBefore);

		driver.navigate().back();
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		util.verifyPrivacyPolicyPage();

		driver.navigate().back();
//		driver.close();
//		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
