package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.nlg.RUNLGContactUsPage;
import Wrapper.nlg.RUNLGPaymentPage;
import Wrapper.nlg.RUNLGPrivacyPolicyPage;
import Wrapper.nlg.RUTermAndConditionPage;

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
		RUNLGPaymentPage np=new RUNLGPaymentPage();

		Reporter.log("\nVerification of footer links"); 
//		util.elementPresent(np.CancelLink);
		util.elementPresent(np.termLink);
		util.elementPresent(np.privacyLink);
		util.elementPresent(np.contactUsLink);
		util.verifyContainText(np.mobileNumberTextBox, np.mobileNumberTextBoxValue);
		util.verifyContainText(np.mobileBeforeMNumTextField, np.mobileBeforeMNumTextFieldValue);
		util.verifyContainText(np.mobileFormP1, np.mobileFormP1Value);
		util.elementPresent(np.mobileSubmitButton);
		util.verifyContainText(np.mobileFormP2, np.mobileFormP2Value);
		util.verifyContainText(np.termLink, np.termLinkValue);
		util.verifyContainText(np.contactUsLink, np.contactUsLinkValue);
		util.verifyContainText(np.privacyLink, np.privacyLinkValue);
//		util.elementPresent(np.firstTab);

	
	}
	
	@Test(dataProvider = "NLGEMPTY", groups = { "RUNLGEmpty","RUpaymentAll","RUNLGLinks","all","RUPayment" })
	public void paymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=RU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		RUNLGPaymentPage np=new RUNLGPaymentPage();
		
		Reporter.log("\nverification of Term and condition page");		
		util.findElement(np.termLink).click();
		String winHandleBefore=driver.getWindowHandle();

		util.SwitchWindow();
		RUTermAndConditionPage tc=new RUTermAndConditionPage();
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);
		util.verifyContainText(tc.p1,tc.p1Value);
		util.verifyContainText(tc.p2,tc.p2Value);
		util.verifyContainText(tc.p3,tc.p3Value);
		util.verifyContainText(tc.p4,tc.p4Value);


		driver.close();
		driver.switchTo().window(winHandleBefore);
		driver.navigate().back();
		Reporter.log("<b>\nverification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		
		RUNLGContactUsPage cus=new RUNLGContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.heading,cus.headingValue);
		
		driver.close();
		driver.switchTo().window(winHandleBefore);

//		driver.navigate().back();
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		RUNLGPrivacyPolicyPage pp=new RUNLGPrivacyPolicyPage();
		util.verifyURLContains(pp.privacyPageURL);
		util.verifyContainText(pp.heading,pp.headingValue);
		util.verifyContainText(pp.p1,pp.p1Value);
		util.verifyContainText(pp.p2,pp.p2Value);
		util.verifyContainText(pp.p3,pp.p3Value);

//		driver.navigate().back();
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
