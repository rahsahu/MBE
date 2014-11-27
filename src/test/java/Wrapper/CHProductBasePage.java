package Wrapper;

import org.openqa.selenium.By;

public class CHProductBasePage {
	


	public By mobileSubmitButton=By.xpath("//div[2]/input");
	public By mobileSubmitCancelButton=By.xpath("//form[2]/div/input");
	public By mobileNumberTextBox=By.xpath("//input");
	public By mobileFormHeading=By.xpath("//label");
	public String mobileFormHeadingValue="Ihre Handy-Nr.";

	public By t11=By.xpath("//tr[1]/td[1]");
	public By t12=By.xpath("//tr[1]/td[2]");
	public By t21=By.xpath("//tr[2]/td[1]");
	public By t22=By.xpath("//tr[2]/td[2]");
	public By t31=By.xpath("//tr[3]/td[1]");
	public By t32=By.xpath("//tr[3]/td[2]");
	public By t41=By.xpath("//tr[4]/td[1]");
	public By t42=By.xpath("//tr[4]/td[2]");


	public String t11v="Anbieter";
	public String t12v="8z";
	public String t21v="Inhalt";
	public String t22v="NoLimitsGames";
	public String t41v="Preis";
	public String t42v="5.90 CHF pro Woche (Abo)";
	
	public By li1=By.xpath("//li[1]");
	public By li2=By.xpath("//li[2]");
	public By li3=By.xpath("//li[3]");
	public String li1Value="Geben Sie Ihre Handy-Nr. ein und klicken Sie auf";
	public String li2Value="Sie erhalten einen PIN per SMS auf Ihr Handy";
	public String li3Value="Geben Sie den PIN ein und klicken Sie auf";

	public By termLink=By.xpath("//a/span/span");
	public By termheading=By.xpath("//b");
	public String termurl="terms";
	public String termheadingvalue="Nutzungsbedingungen Easypay";
	
	public By cancelcontent=By.xpath("//p");
	public String cancelcontentValue="Your request to cancel was a success.";
	

	

	
}
