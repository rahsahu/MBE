package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.nlg.NLGPaymentPage;
import Wrapper.nlg.RUNLGContactUsPage;
import Wrapper.nlg.RUNLGPrivacyPolicyPage;
import Wrapper.nlg.SGNLGContactUsPage;
import Wrapper.nlg.SGNLGPaymentPage;
import Wrapper.nlg.SGNLGPrivacyPolicyPage;
import Wrapper.nlg.SGTermAndConditionPage;

public class SGNLGPIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "NLGEMPTY", groups = { "SGNLGEmpty","paymentAll","SGNLGMobile","all","AUPayment"})
	public void SGNLGpaymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=SG";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		SGNLGPaymentPage np=new SGNLGPaymentPage();

		util.verifyContainText(np.mobileNumberTextBox, np.mobileNumberTextBoxValue);
		util.verifyContainText(np.mobileBeforeMNumTextField, np.mobileBeforeMNumTextFieldValue);
//		util.verifyContainText(np.mobileFormP1, np.mobileFormP1Value);
		util.elementPresent(np.mobileSubmitButton);
		util.verifyContainText(np.mobileFormP2, np.mobileFormP2Value);
		util.elementPresent(np.firstTab);
		util.elementPresent(np.secondTab);
		Reporter.log("\nVerification of footer links"); 

		util.elementPresent(np.termLink);
		util.elementPresent(np.privacyLink);
		util.elementPresent(np.contactUsLink);
	
	}

	@Test(dataProvider = "NLGEMPTY", groups = { "SGNLGEmpty","paymentAll","SGNLGPaypal","all","SGPayment" })
	public void SGNLGpaymentPaypalTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=SG";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();

		SGNLGPaymentPage np=new SGNLGPaymentPage();

		util.findElement(np.secondTab).click();
		util.verifyContainText(np.PaypalFormHeading, np.PaypalFormHeadingValue);
		util.verifyContainText(np.PaypalFormBottom, np.PaypalFormBottomtext);
		util.elementPresent(np.PaypalSubmitButton);

	
	}

	

	
	@Test(dataProvider = "NLGEMPTY", groups = { "SGNLGEmpty","paymentAll","SGNLGLinks","all","SGPayment" })
	public void SGNLGpaymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=SG";
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
		SGTermAndConditionPage tc=new SGTermAndConditionPage();
		
		util.verifyURLContains(tc.termPageURL);
		util.verifyContainText(tc.heading,tc.headingValue);
		util.verifyContainText(tc.p1,tc.p1Value);


		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		Reporter.log("<b>\nverification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		SGNLGContactUsPage cus=new SGNLGContactUsPage();
		util.verifyURLContains(cus.contactPageURL);
		util.verifyContainText(cus.heading,cus.headingValue);

		driver.close();
		driver.switchTo().window(winHandleBefore);

		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		SGNLGPrivacyPolicyPage pp=new SGNLGPrivacyPolicyPage();
		util.verifyURLContains(pp.privacyPageURL);
		util.verifyContainText(pp.heading,pp.headingValue);


		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
