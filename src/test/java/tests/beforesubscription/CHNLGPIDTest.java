package tests.beforesubscription;


import org.testng.Reporter;
import org.testng.annotations.Test;

import Wrapper.CHProductBasePage;
import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;
import Wrapper.nlg.NLGPaymentPage;
import Wrapper.nlg.RUNLGContactUsPage;
import Wrapper.nlg.RUNLGPrivacyPolicyPage;
import Wrapper.nlg.SGNLGContactUsPage;
import Wrapper.nlg.SGNLGPaymentPage;
import Wrapper.nlg.SGNLGPrivacyPolicyPage;
import Wrapper.nlg.SGTermAndConditionPage;

public class CHNLGPIDTest extends DriverCommonAction {

	

	@Test(dataProvider = "NLGEMPTY", groups = { "CHNLGEmpty","paymentAll","CHNLGMobile","all","CHPayment"})
	public void paymentMobileTabTest(String url,String pid,String amount) throws Exception {
	
		String aURL = url + "/?pid="+pid+"&territory=CH";
		
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();

		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		CHProductBasePage np=new CHProductBasePage();

		util.verifyContainText(np.t11, np.t11v);
		util.verifyContainText(np.t12, np.t12v);
		util.verifyContainText(np.t21, np.t21v);
		util.verifyContainText(np.t22, np.t22v);
		util.verifyContainText(np.t41, np.t41v);
		util.verifyContainText(np.t42, np.t42v);

		util.verifyContainText(np.mobileFormHeading, np.mobileFormHeadingValue);
		
		util.elementPresent(np.mobileNumberTextBox);
		util.elementPresent(np.mobileSubmitButton);
		util.elementPresent(np.mobileSubmitCancelButton);

		
		util.verifyContainText(np.li1, np.li1Value);
		util.verifyContainText(np.li2, np.li2Value);
		util.verifyContainText(np.li3, np.li3Value);

		
		Reporter.log("\nVerification of footer links"); 

		util.elementPresent(np.termLink);
		String winHandleBefore=driver.getWindowHandle();
		util.findElement(np.termLink).click();
		util.SwitchWindow();
		util.verifyURLContains(np.termurl);
		util.verifyContainText(np.termheading, np.termheadingvalue);
		driver.switchTo().window(winHandleBefore);

	}


}
