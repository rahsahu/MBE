package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.joocey.JooceyContactUsPage;
import Wrapper.joocey.JooceyPaymentPage;
import Wrapper.joocey.JooceyPrivacyPolicyPage;
import Wrapper.joocey.JooceyTermAndConditionPage;
import Wrapper.prosports.ProSportsContactUsPage;
import Wrapper.prosports.ProSportsPrivacyPolicyPage;
import Wrapper.prosports.ProSportsTermAndConditionPage;
import Wrapper.prosports.prosportsPaymentPage;

public class jooceyPIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "JooceyEmpty", groups = { "JooceyEmpty","paymentAll","JooceyMobile","all","AUPayment","JooceyPayment"})
	public void paymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		JooceyPaymentPage np=new JooceyPaymentPage();

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

	@Test(dataProvider = "JooceyEmpty", groups = { "JooceyEmpty","paymentAll","JooceyPaypal","all","AUPayment" ,"JooceyPayment"})
	public void paymentPaypalTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		JooceyPaymentPage np=new JooceyPaymentPage();

		util.findElement(np.secondTab).click();
		util.elementPresent(np.PaypalSubmitButton);

	
	}

	
	
	@Test(dataProvider = "JooceyEmpty", groups = { "JooceyEmpty","paymentAll","JooceyLinks","all","AUPayment" ,"JooceyPayment"})
	public void paymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=AU";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		JooceyPaymentPage np=new JooceyPaymentPage();
		
		Reporter.log("\n<b>Verification of Term and condition page</b>");		
		util.findElement(np.termLink).click();
		String winHandleBefore=driver.getWindowHandle();

		util.SwitchWindow();
		JooceyTermAndConditionPage tc=new JooceyTermAndConditionPage();
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);
		util.verifyContainText(tc.menu1,tc.menuValue1);
		util.verifyContainText(tc.menu2,tc.menuValue2);
		util.verifyContainText(tc.menu3,tc.menuValue3);
		util.verifyContainText(tc.menu4,tc.menuValue4);
		util.verifyContainText(tc.menu5,tc.menuValue5);



		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		Reporter.log("<b>\nVerification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		JooceyContactUsPage cus=new JooceyContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.menu1,cus.menuValue1);
		util.verifyContainText(cus.menu2,cus.menuValue2);
		util.verifyContainText(cus.menu3,cus.menuValue3);
		util.verifyContainText(cus.menu4,cus.menuValue4);
		util.verifyContainText(cus.menu5,cus.menuValue5);

		
		driver.close();
		driver.switchTo().window(winHandleBefore);

		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		JooceyPrivacyPolicyPage privacy=new JooceyPrivacyPolicyPage();
		util.verifyURLContains(privacy.privacyPageURL);
		util.verifyContainText(privacy.heading,privacy.headingValue);
		util.verifyContainText(privacy.menu1,privacy.menuValue1);
		util.verifyContainText(privacy.menu2,privacy.menuValue2);
		util.verifyContainText(privacy.menu3,privacy.menuValue3);
		util.verifyContainText(privacy.menu4,privacy.menuValue4);
		util.verifyContainText(privacy.menu5,privacy.menuValue5);
		util.verifyContainText(privacy.p1,privacy.p1Value);
		util.verifyContainText(privacy.p2,privacy.p2Value);
		util.verifyContainText(privacy.p3,privacy.p3Value);
		util.verifyContainText(privacy.p4,privacy.p4Value);
		util.verifyContainText(privacy.p5,privacy.p5Value);

		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
