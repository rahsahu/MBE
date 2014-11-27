package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.ingame.InGameContactUsPage;
import Wrapper.ingame.InGamePrivacyPolicyPage;
import Wrapper.ingame.InGameTermAndConditionPage;
import Wrapper.ingame.InGamePaymentPage;

public class InGamePIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "InGameEmpty", groups = { "InGameEmpty","paymentAll","InGameMobile","all","AUPayment","InGamePayment"})
	public void InGamepaymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		InGamePaymentPage np=new InGamePaymentPage();

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

	@Test(dataProvider = "InGameEmpty", groups = { "InGameEmpty","paymentAll","InGamePaypal","all","AUPayment" ,"InGamePayment"})
	public void InGamepaymentPaypalTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		InGamePaymentPage np=new InGamePaymentPage();

		util.findElement(np.secondTab).click();
		util.elementPresent(np.PaypalSubmitButton);

	
	}

	
	
	@Test(dataProvider = "InGameEmpty", groups = { "InGameEmpty","paymentAll","InGameLinks","all","AUPayment" ,"InGamePayment"})
	public void InGamepaymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		InGamePaymentPage np=new InGamePaymentPage();
		
		Reporter.log("\n<b>Verification of Term and condition page</b>");		
		util.findElement(np.termLink).click();
		String winHandleBefore=driver.getWindowHandle();

		util.SwitchWindow();
		InGameTermAndConditionPage tc=new InGameTermAndConditionPage();
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);
		util.verifyContainText(tc.p1,tc.p1Value);
		util.verifyContainText(tc.p2,tc.p2Value);



		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		Reporter.log("<b>\nVerification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		InGameContactUsPage cus=new InGameContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.heading,cus.headingValue);
		
		driver.close();
		driver.switchTo().window(winHandleBefore);

		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		InGamePrivacyPolicyPage privacy=new InGamePrivacyPolicyPage();
		util.verifyURLContains(privacy.privacyPageURL);
		util.verifyContainText(privacy.heading,privacy.headingValue);
		util.verifyContainText(privacy.p1,privacy.p1Value);
		util.verifyContainText(privacy.p2,privacy.p2Value);
		util.verifyContainText(privacy.p3,privacy.p3Value);
		util.verifyContainText(privacy.p4,privacy.p4Value);


		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
