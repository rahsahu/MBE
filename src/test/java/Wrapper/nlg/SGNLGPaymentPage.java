package Wrapper.nlg;

import org.openqa.selenium.By;

import Wrapper.BasePaymentPage;

public class SGNLGPaymentPage {
	public String windowHandel=null;


	
	public String mobileNumberTextBoxValue="";
	public String mobileBeforeMNumTextFieldValue="Enter your mobile number to join NoLimitsGames NOW for a chance to win a S$100 Gift Voucher!";
	public String mobileFormP1Value="Subscribe to NoLimitsGames for just $5.00/week";
	public String mobileFormP2Value="Subscribe to NoLimitsGames and get unlimited access each week to the best browser Arcade, Adventure and Puzzle games. Play all the games, any time from your internet browser.";		
	public String PaypalFormHeadingValue = "";
	public String PaypalFormBottomtext = "For a limited time only, NoLimitsGames is offering a promotion open to registered SingTel customers or PayPal users that sign up to NoLimitsGames Service";

	
	public By mobileBeforeMNumTextField=By.xpath("//label");
	public By mobileFormP2=By.xpath("//div[@id='tab_otp']/div/p");
	public By termLink=By.xpath("//a[contains(text(),'Terms')]");
	public By privacyLink=By.xpath("//a[contains(text(),'Privacy')]");
	public By contactUsLink=By.xpath("//a[contains(text(),'Contact Us')]");		
	
	public By mobileSubmitButton=By.xpath("//input[@name='submit']");
	public By mobileNumberTextBox=By.xpath("//input[5]");

	public By firstTab=By.xpath("//li[1]/a/img");
	public By secondTab=By.xpath("//li[2]/a/img");
	public By PaypalSubmitButton=By.xpath("//p/a/img");
	public By PaypalFormHeading=By.xpath("//div[@id='tab_paypal']/h3");
	public By PaypalFormBottom=By.xpath("//div[@id='tab_paypal']/p[2]");


	
}
