package Wrapper.hmb;

import org.openqa.selenium.By;

public class HMBBasePage {

	public By heading=By.cssSelector("div.tab-top");	
	
	public String link1Text="Videos";
	public String link2Text="Wallpapers";
	public String link3Text="Games";
	
	public By link1=By.linkText(link1Text);
	public By link2=By.linkText(link2Text);
	public By link3=By.linkText(link3Text);


	public String footerLinkValue1="Home";
	public String footerLinkValue2="Terms and Conditions";
	public String footerLinkValue3="Privacy Policy";
	public String footerLinkValue4="Contact";
	

	public By footerLink1=By.linkText(footerLinkValue1);
	public By footerLink2=By.linkText(footerLinkValue2);
	public By footerLink3=By.linkText(footerLinkValue3);
	public By footerLink4=By.linkText(footerLinkValue4);
	public String title="Hot Mobile Babes";


	//Videos | Wallpapers | Games 


//	 Home | Terms and Conditions | Privacy Policy | Contact
	

	

	
}
