package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.MyReporter;
import Wrapper.fiitr.FiiTRContactUsPage;
import Wrapper.fiitr.FiiTRPaymentPage;
import Wrapper.fiitr.FiiTRPrivacyPolicyPage;
import Wrapper.fiitr.FiiTRTermAndConditionPage;

public class FiiTRSubscribeTest extends DriverCommonAction {

	

	@Test(dataProvider = "FiiTREmpty", groups = { "FiiTREmpty","paymentAll","FiiTRMobile","all","AUPayment","FiiTRPayment"})
	public void FiiTRSubscribeMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		FiiTRPaymentPage np=new FiiTRPaymentPage();

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

	@Test(dataProvider = "FiiTREmpty", groups = { "FiiTREmpty","paymentAll","FiiTRPaypal","all","AUPayment" ,"FiiTRPayment"})
	public void paymentPaypalTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		FiiTRPaymentPage np=new FiiTRPaymentPage();

		util.findElement(np.secondTab).click();
		util.elementPresent(np.PaypalSubmitButton);

	
	}

	
	
	@Test(dataProvider = "FiiTREmpty", groups = { "FiiTREmpty","paymentAll","FiiTRLinks","all","AUPayment" ,"FiiTRPayment"})
	public void paymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		String winHandleBefore=driver.getWindowHandle();
		FiiTRPaymentPage np=new FiiTRPaymentPage();
		
		Reporter.log("\n<b>Verification of Term and condition page</b>");		
		util.findElement(np.termLink).click();
		

		util.SwitchWindow();
		FiiTRTermAndConditionPage tc=new FiiTRTermAndConditionPage();
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);
		util.verifyContainText(tc.footerLink1,tc.footerLinkValue1);
		util.verifyContainText(tc.footerLink2,tc.footerLinkValue2);
		util.verifyContainText(tc.footerLink3,tc.footerLinkValue3);
		util.verifyContainText(tc.footerLink4,tc.footerLinkValue4);
		util.verifyContainText(tc.footerLink5,tc.footerLinkValue5);



		driver.close();
		driver.switchTo().window(winHandleBefore);
//		driver.navigate().back();
		MyReporter.log(driver.getCurrentUrl());
		Thread.sleep(2000);
		MyReporter.log(driver.getCurrentUrl());
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		Reporter.log("<b>\nVerification of Contact US page</b>");
		FiiTRContactUsPage cus=new FiiTRContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.footerLink1,cus.footerLinkValue1);
		util.verifyContainText(cus.footerLink2,cus.footerLinkValue2);
		util.verifyContainText(cus.footerLink3,cus.footerLinkValue3);
		util.verifyContainText(cus.footerLink4,cus.footerLinkValue4);
		util.verifyContainText(cus.footerLink5,cus.footerLinkValue5);

		
		driver.close();
		driver.switchTo().window(winHandleBefore);
//		driver.navigate().back();
		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		FiiTRPrivacyPolicyPage privacy=new FiiTRPrivacyPolicyPage();
		util.verifyURLContains(privacy.privacyPageURL);
		util.verifyContainText(privacy.heading,privacy.headingValue);
		util.verifyContainText(privacy.footerLink1,privacy.footerLinkValue1);
		util.verifyContainText(privacy.footerLink2,privacy.footerLinkValue2);
		util.verifyContainText(privacy.footerLink3,privacy.footerLinkValue3);
		util.verifyContainText(privacy.footerLink4,privacy.footerLinkValue4);
		util.verifyContainText(privacy.footerLink5,privacy.footerLinkValue5);
		util.verifyContainText(privacy.p2,privacy.p2Value);
		util.verifyContainText(privacy.p3,privacy.p3Value);
		util.verifyContainText(privacy.p4,privacy.p4Value);

		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
