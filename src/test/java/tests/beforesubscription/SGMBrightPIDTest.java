package tests.beforesubscription;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.SGBasePage;
import Wrapper.nlg.NLGPaymentPage;
import Wrapper.nlg.RUNLGContactUsPage;
import Wrapper.nlg.RUNLGPrivacyPolicyPage;
import Wrapper.nlg.SGNLGContactUsPage;
import Wrapper.nlg.SGNLGPaymentPage;
import Wrapper.nlg.SGNLGPrivacyPolicyPage;
import Wrapper.nlg.SGTermAndConditionPage;

public class SGMBrightPIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "mBrightEmpty", groups = { "mBrightEmpty","paymentAll","MloveMobile","all","SGPayment"})
	public void paymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=SG";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		SGBasePage np=new SGBasePage();

		util.elementPresent(np.mobileNumberTextBox);
		util.verifyContainText(np.mobileBeforeMNumTextField, np.mobileBeforeMNumTextFieldValue);
//		util.verifyContainText(np.mobileFormP1, np.mobileFormP1Value);
		util.elementPresent(np.mobileSubmitButton);
	
		Reporter.log("\nVerification of footer links"); 
		util.elementPresent(np.termLink);
		util.elementPresent(np.privacyLink);
		util.elementPresent(np.contactUsLink);
	
	}



	

	
	@Test(dataProvider = "mBrightEmpty", groups = { "mBrightEmpty","paymentAll","MloveLinks","all","SGPayment" })
	public void paymentLinksTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=SG";
		Reporter.log("verification of Term and condition,  Contact US and  Privacy Policy page");	
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
//		util.verifyt
		SGBasePage np=new SGBasePage();
		
		Reporter.log("\nverification of Term and condition page");		
		util.findElement(np.termLink).click();
		String winHandleBefore=driver.getWindowHandle();

		util.SwitchWindow();
		util.waitForPageLoad();
		util.verifyURLContains("term");
		util.verifyContainText(By.xpath("//h1"),"Terms & Conditions");


		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		Reporter.log("<b>\nverification of Contact US page</b>");
		util.findElement(np.contactUsLink).click();
		util.SwitchWindow();
		SGNLGContactUsPage cus=new SGNLGContactUsPage();
		util.waitForPageLoad();
		util.verifyURLContains("contact");
		util.verifyContainText(By.xpath("//strong"),cus.headingValue);

		driver.close();
		driver.switchTo().window(winHandleBefore);

		
		util.findElement(np.privacyLink).click();
		util.SwitchWindow();
		Reporter.log("\nverification of Privacy Policy page");
		SGNLGPrivacyPolicyPage pp=new SGNLGPrivacyPolicyPage();
		util.waitForPageLoad();
		util.verifyURLContains("privacy");
		util.verifyContainText(By.xpath("//strong"),pp.headingValue);


		
		driver.close();
		driver.switchTo().window(winHandleBefore);
	
		

	
	}
}
