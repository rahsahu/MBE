package tests.beforesubscription;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.MyReporter;
import Wrapper.hmb.*;
public class hmbSubscribeTest extends DriverCommonAction {

	

	@Test(dataProvider = "HotMobileBabesEmpty", groups = { "HotMobileBabesMobileTest","paymentAll","HotMobileBabesMobile","all","AUPayment","HotMobileBabesPayment","mobiletab"})
	public void HotMobileBabesSubscribeMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		HMBPaymentPage np=new HMBPaymentPage();

		Reporter.log("\nVerification of footer links"); 
		util.elementPresent(np.CancelLink);
		util.elementPresent(np.termLink);
		util.elementPresent(np.privacyLink);
		util.elementPresent(np.contactUsLink);
		util.verifyContainText(np.mobileNumberTextBox, np.mobileNumberTextBoxValue);
		util.verifyContainText(By.xpath("//div[@id='tab_psms']/b"), np.mobileBeforeMNumTextFieldValue);
		util.verifyContainText(np.mobileFormP1, np.mobileFormP1Value);
		util.elementPresent(np.mobileSubmitButton);
		util.verifyContainText(np.mobileFormP2, np.mobileFormP2Value);


	
	}


	
	@Test(dataProvider = "HotMobileBabesEmpty", groups = { "HotMobileBabesLinksTest","paymentAll","HotMobileBabesLinks","all","AUPayment" ,"HotMobileBabesPayment","linksTest"})
	public void HotMobileBabespaymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		String winHandleBefore=driver.getWindowHandle();
		HMBPaymentPage np=new HMBPaymentPage();
		
		Reporter.log("\n<b>Verification of Term and condition page</b>");		
		util.findElement(np.termLink).click();
		

		util.SwitchWindow();
		HMBTermAndConditionPage tc=new HMBTermAndConditionPage();
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);
		util.verifyContainText(tc.footerLink1,tc.footerLinkValue1);
		util.verifyContainText(tc.footerLink2,tc.footerLinkValue2);
		util.verifyContainText(tc.footerLink3,tc.footerLinkValue3);
		util.verifyContainText(tc.footerLink4,tc.footerLinkValue4);




		driver.close();
		driver.switchTo().window(winHandleBefore);
//		driver.navigate().back();
		MyReporter.log(driver.getCurrentUrl());
		Thread.sleep(2000);
		MyReporter.log(driver.getCurrentUrl());
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		Reporter.log("<b>\nVerification of Contact US page</b>");
		HMBContactUsPage cus=new HMBContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.footerLink1,cus.footerLinkValue1);
		util.verifyContainText(cus.footerLink2,cus.footerLinkValue2);
		util.verifyContainText(cus.footerLink3,cus.footerLinkValue3);
		util.verifyContainText(cus.footerLink4,cus.footerLinkValue4);


		
		driver.close();
		driver.switchTo().window(winHandleBefore);
//		driver.navigate().back();
		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\n<b>verification of Privacy Policy page</b>");
		HMBPrivacyPolicyPage privacy=new HMBPrivacyPolicyPage();
		util.verifyURLContains(privacy.privacyPageURL);
		util.verifyContainText(privacy.heading,privacy.headingValue);
		util.verifyContainText(privacy.footerLink1,privacy.footerLinkValue1);
		util.verifyContainText(privacy.footerLink2,privacy.footerLinkValue2);
		util.verifyContainText(privacy.footerLink3,privacy.footerLinkValue3);
		util.verifyContainText(privacy.footerLink4,privacy.footerLinkValue4);
		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
