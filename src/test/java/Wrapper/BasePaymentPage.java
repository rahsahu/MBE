package Wrapper;

import org.openqa.selenium.By;

public class BasePaymentPage {
	
	public By mainP=By.xpath("//p");
	
	public By firstTab=By.xpath("//img[@alt='MobilePay']");
	public By secondTab=By.xpath("//img[@alt='Paypal']");
	public By thirdTab=By.xpath("//img[@alt='Google Wallet']");
	

	public By CancelLink=By.xpath("//a[contains(text(),'Cancel')]");

	public By termLink=By.xpath("//a[contains(text(),'Terms')]");
	public By privacyLink=By.xpath("//a[contains(text(),'Privacy')]");
	public By contactUsLink=By.xpath("//a[contains(text(),'Contact Us')]");

	public By mobileSubmitButton=By.xpath("//input[@value='Submit']");
	public By mobileNumberTextBox=By.xpath("//form[@id='subscribe']/input");
	public By mobileBeforeMNumTextField=By.xpath("//div[@id='tab_psms']/h3");
	public By mobileFormP1=By.xpath("//form[@id='subscribe']/p[1]");
	public By mobileFormP2=By.xpath("//form[@id='subscribe']/p[2]");

	public By PaypalSubmitButton=By.xpath("//img[@id='Login-paypal-button']");
	public By PaypalFormHeading=By.xpath("//div[@id='tab_paypal']/h3");

	public By googleWalletSubmitButton=By.xpath("//div[@id='tab_google_wallet']");
	public By googleWalletHeading=By.xpath("//img[@alt='Log In with Google Wallet']/h3");
	
	
//	Terms and Conditions 


	
}
