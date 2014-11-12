package Wrapper.mhub;

import org.openqa.selenium.By;

public class MHubBasePage {

	public By menu=By.xpath("//img[@alt='Menu']");
	public By SubMenu1=By.xpath("//li[1]/a");
	public By SubMenu2=By.xpath("//li[2]/a");
	public By SubMenu3=By.xpath("//li[3]/a");
	public By SubMenu4=By.xpath("//li[4]/a");
	public By SubMenu5=By.xpath("//li[5]/a");
	public By SubMenu6=By.xpath("//li[6]/a");
	public By SubMenu7=By.xpath("//li[7]/a");

	
	

	public By footerLink1=By.xpath("//div[@id='footer']/ul/li[1]/a");
	public By footerLink2=By.xpath("//div[@id='footer']/ul/li[2]/a");
	public By footerLink3=By.xpath("//div[@id='footer']/ul/li[3]/a");
	public By footerLink4=By.xpath("//div[@id='footer']/ul/li[4]/a");
	public By footerLink5=By.xpath("//div[@id='footer']/ul/li[5]/a");
	
	public String subMenu1Text="Home";
	public String subMenu2Text="Games";
	public String subMenu3Text="Wallpapers";
	public String subMenu4Text="Apps";
	public String subMenu5Text="Funtext";
	public String subMenu6Text="Lifestyle";
	public String subMenu7Text="Comedy";


	public String footerLinkValue1="My Account";
	public String footerLinkValue1withoutlogin="Login";
	public String footerLinkValue2="Terms";
	public String footerLinkValue3="Privacy";
	public String footerLinkValue4="Help";
	public String footerLinkValue5="Contact";
	
	

	

	
}
