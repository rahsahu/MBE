package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.gameshaus.GamesHausContactUsPage;
import Wrapper.gameshaus.GamesHausPaymentPage;
import Wrapper.gameshaus.GamesHausPrivacyPolicyPage;
import Wrapper.gameshaus.GamesHausTermAndConditionPage;

public class GamesHausPIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "GamesHausEmpty", groups = { "GamesHausEmpty","paymentAll","GamesHausMobile","all","AUPayment","GamesHausPayment"})
	public void GamesHauspaymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		GamesHausPaymentPage np=new GamesHausPaymentPage();

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
			
	}

		
	@Test(dataProvider = "GamesHausEmpty", groups = { "GamesHausEmpty","paymentAll","GamesHausLinks","all","AUPayment" ,"GamesHausPayment"})
	public void GamesHauspaymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		GamesHausPaymentPage np=new GamesHausPaymentPage();
		
		Reporter.log("\n<b>Verification of Term and condition page</b>");		
		util.findElement(np.termLink).click();
		String winHandleBefore=driver.getWindowHandle();

		util.SwitchWindow();
		GamesHausTermAndConditionPage tc=new GamesHausTermAndConditionPage();
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);

		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		Reporter.log("<b>\nVerification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		GamesHausContactUsPage cus=new GamesHausContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.heading,cus.headingValue);
		
		driver.close();
		driver.switchTo().window(winHandleBefore);

		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		GamesHausPrivacyPolicyPage privacy=new GamesHausPrivacyPolicyPage();
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
