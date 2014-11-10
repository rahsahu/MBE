package Wrapper;

import org.testng.Reporter;

public class MyReporter {

	public  static void Verifying(String by,String expected,String actual)
	{
		Reporter.log("<font color='blue'>Verifying Element : <b>"+by+"</b> Having value : <b>"+ expected +"</b>  should have <b>"+ actual +"</b> value.</font>");
	}
	
	public  static void VerifyingPresent(String by){
		Reporter.log("<font color='blue'>Verifying Element : "+by+"  Is Present or Not </font>");	
	}
	
}
