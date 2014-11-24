package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import core.driver.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.prosports.ProSportsContactUsPage;
import Wrapper.prosports.ProSportsPrivacyPolicyPage;
import Wrapper.prosports.ProSportsTermAndConditionPage;
import Wrapper.prosports.prosportsPaymentPage;

public class ProSportsPIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "ProSportsEmpty", groups = { "ProSportsEmpty","paymentAll","prosportsMobile","all","AUPayment","prosportsPayment"})
	public void paymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		prosportsPaymentPage np=new prosportsPaymentPage();

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

	@Test(dataProvider = "ProSportsEmpty", groups = { "ProSportsEmpty","paymentAll","prosportsPaypal","all","AUPayment" ,"prosportsPayment"})
	public void paymentPaypalTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		prosportsPaymentPage np=new prosportsPaymentPage();

		util.findElement(np.secondTab).click();
		util.elementPresent(np.PaypalSubmitButton);

	
	}

	
	
	@Test(dataProvider = "ProSportsEmpty", groups = { "ProSportsEmpty","paymentAll","prosportsLinks","all","AUPayment" ,"prosportsPayment"})
	public void paymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		prosportsPaymentPage np=new prosportsPaymentPage();
		
		Reporter.log("\n<b>Verification of Term and condition page</b>");		
		util.findElement(np.termLink).click();
		String winHandleBefore=driver.getWindowHandle();

		util.SwitchWindow();
		ProSportsTermAndConditionPage tc=new ProSportsTermAndConditionPage();
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);
		util.verifyContainText(tc.footerLink1,tc.footerLinkValue1);
		util.verifyContainText(tc.footerLink2,tc.footerLinkValue2);
		util.verifyContainText(tc.footerLink3,tc.footerLinkValue3);
		util.verifyContainText(tc.footerLink4,tc.footerLinkValue4);
		util.verifyContainText(tc.footerLink5,tc.footerLinkValue5);
		util.verifyContainText(tc.footerLink6,tc.footerLinkValue6);
		util.verifyContainText(tc.footerLink7,tc.footerLinkValue7);
		util.verifyContainText(tc.footerLink8,tc.footerLinkValue8);
		util.verifyContainText(tc.footerLink9,tc.footerLinkValue9);
		util.verifyContainText(tc.footerLink10,tc.footerLinkValue10);
		util.verifyContainText(tc.footerLink11,tc.footerLinkValue11);


		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		Reporter.log("<b>\nVerification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		ProSportsContactUsPage cus=new ProSportsContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.heading,cus.headingValue);
		util.verifyContainText(cus.footerLink1,cus.footerLinkValue1);
		util.verifyContainText(cus.footerLink2,cus.footerLinkValue2);
		util.verifyContainText(cus.footerLink3,cus.footerLinkValue3);
		util.verifyContainText(cus.footerLink4,cus.footerLinkValue4);
		util.verifyContainText(cus.footerLink5,cus.footerLinkValue5);
		util.verifyContainText(cus.footerLink6,cus.footerLinkValue6);
		util.verifyContainText(cus.footerLink7,cus.footerLinkValue7);
		util.verifyContainText(cus.footerLink8,cus.footerLinkValue8);
		util.verifyContainText(cus.footerLink9,cus.footerLinkValue9);
		util.verifyContainText(cus.footerLink10,cus.footerLinkValue10);
		util.verifyContainText(cus.footerLink11,cus.footerLinkValue11);
		
		driver.close();
		driver.switchTo().window(winHandleBefore);

		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		ProSportsPrivacyPolicyPage privacy=new ProSportsPrivacyPolicyPage();
		util.verifyURLContains(privacy.privacyPageURL);
		util.verifyContainText(privacy.heading,privacy.headingValue);
		util.verifyContainText(privacy.footerLink1,privacy.footerLinkValue1);
		util.verifyContainText(privacy.footerLink2,privacy.footerLinkValue2);
		util.verifyContainText(privacy.footerLink3,privacy.footerLinkValue3);
		util.verifyContainText(privacy.footerLink4,privacy.footerLinkValue4);
		util.verifyContainText(privacy.footerLink5,privacy.footerLinkValue5);
		util.verifyContainText(privacy.footerLink6,privacy.footerLinkValue6);
		util.verifyContainText(privacy.footerLink7,privacy.footerLinkValue7);
		util.verifyContainText(privacy.footerLink8,privacy.footerLinkValue8);
		util.verifyContainText(privacy.footerLink9,privacy.footerLinkValue9);
		util.verifyContainText(privacy.footerLink10,privacy.footerLinkValue10);
		util.verifyContainText(privacy.footerLink11,privacy.footerLinkValue11);

		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
