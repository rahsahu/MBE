package Wrapper;

import org.testng.Reporter;

public class MyReporter {

	public  static void Verifying(String by,String expected,String actual)
	{
		Reporter.log("<font color='blue'> Verifying Element : <b>"+by+"</b> Having value : <b>"+ expected +"</b>  should have <b>"+ actual +"</b> value. </Font>");
	}
	
	public  static void VerifyingPresent(String by){
		Reporter.log("<font color='blue'> Verifying Element : <b>"+by+"</b>  Is present or not </Font>");
	}
	
	public  static void log(String by)
	{
		Reporter.log("<font color='blue'>"+by+" </Font>");
	}
	
}
