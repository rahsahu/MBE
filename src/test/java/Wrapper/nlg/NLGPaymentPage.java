package Wrapper.nlg;

import org.openqa.selenium.By;

import Wrapper.BasePaymentPage;

public class NLGPaymentPage extends BasePaymentPage{
	public String windowHandel=null;


	
	public String mobileNumberTextBoxValue="";
	public String mobileBeforeMNumTextFieldValue="Subscribe with your Mobile for only $5.00/week";
	public String mobileFormP1Value="Subscribe to NoLimitsGames for just $5.00/week";
	public String mobileFormP2Value="Submit your phone number on this page and we'll send you a text message to confirm you wish to subscribe.";		
	public String PaypalFormHeadingValue = "Subscribe for only $5.00/7 days";
	public String googleWalletHeadingValue="Subscribe for only $19.99/30 days";
			
	
	
	public String RUmobileFormP1Value="SВведите Ваш мобильный номер для подписки и начинайте играть в ЛУЧШИЕ браузерные игры прямо сейчас!";
	public String RUmobileFormP2Value="Подпишитесь на Игры Без Границ и Вы получите неограниченный доступ к нашим ОТЛИЧНЫМ браузерным играм всего за 12 руб.";		
	public String RUmobileBeforeMNumTextFieldValue="Введите Ваш мобильный номер";

	
	public By googleWalletSubmitButton=By.xpath("//div[@id='tab_google_wallet']");
	public By googleWalletHeading=By.xpath("//div[@id='tab_google_wallet']/h3");
	//form[@id='subscribe']/p[2]
	//Contact Us
	//h2
	

	
	
}
