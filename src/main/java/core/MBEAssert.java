package core;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class MBEAssert extends SoftAssert {
	SoftAssert Sassert=new SoftAssert();
	public MBEAssert() {
	
	}
	public void verifyEqual(String actual, String expected){
		
		Reporter.log("<b>Actual : " +actual+", Expected : "+ expected);
		Sassert.assertEquals(actual, expected);
		
	}
	
	
}
