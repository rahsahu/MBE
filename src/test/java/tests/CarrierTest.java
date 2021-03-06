package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Wrapper.DriverCommonAction;
import Wrapper.DriverWrapper;

public class CarrierTest extends DriverCommonAction {

	



	@Test(dataProvider = "DPTWO", groups = { "two","allcarrier" } )
	public void carrierIDTWO(String url,String pid) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=2";
		

		String aURL = url + "/?pid="+pid + restURL;

		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		//Verify paynow button is present or not
		util.findElement(DriverWrapper.ByPayNowButton);
		//Verify cancellink is present or not
		util.findElement(DriverWrapper.ByCancelLink);

	
	}

	@Test(dataProvider = "DPAMOUNT", groups = { "one","allcarrier" })
	public void carrierIDONE(String url,String pid,String amount) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=1";
		

		String aURL = url + "/?pid="+pid + restURL;
		System.out.println(aURL);
		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		//Verify paynow button is present or not
		util.findElement(DriverWrapper.ByPayNowButton);
		util.findElement(DriverWrapper.ByCancelXPATH);
		
		WebElement heading=util.findElement(DriverWrapper.ByHeading);
		System.out.println(heading.getText());
		
		util.verifyHelplineMessage();
		
		if(!driver.getPageSource().contains("Only $"+amount+"/wk subscription service"))
			DriverWrapper.softAssert.assertEquals(true, false);
		
	
	}

	
	@Test(dataProvider = "DPTWO", groups = { "three","allcarrier" })
	public void carrierIDTHREE(String url,String pid) throws Exception {
		String restURL="&territory=AU&mobile_carrier_id=3";
		

		String aURL = url + "/?pid="+pid + restURL;

		driver.manage().deleteAllCookies();
		driver.get(aURL);
		driver.manage().window().maximize();
		//Thread.sleep(9000);
		DriverWrapper util=new DriverWrapper(driver);
		util.waitForPageLoad();
		
		//Verify paynow button is present or not
		util.findElement(DriverWrapper.ByPayNowButton);
		//Verify cancellink is present or not
	//	util.findElement(DriverWrapper.ByCancelLink);

	
	}
}
