package Wrapper.prosports;

import org.openqa.selenium.By;

public class ProSportsPrivacyPolicyPage extends ProSportsFooterBasePage{

	public By heading=By.xpath("//h1");
	public By p1=By.xpath("//b");
	public By p2=By.xpath("//p[2]");
	public By p3=By.xpath("//p[3]");
	public By p4=By.xpath("//p[4]");
	public By p5=By.xpath("//p[5]");
	public By p6=By.xpath("//p[6]");
	public By p7=By.xpath("//p[7]");
	public By p8=By.xpath("//p[8]");
	public By p9=By.xpath("//p[9]");

	public String headingValue = "Privacy Policy";
	public String p1Value = "About Us";
	public String p2Value = "Purpose of this Privacy Policy";
	public String p3Value = "Consideration of personal information";
	public String p4Value = "Collection of personal information";
	public String p5Value = "Use/Disclosure of personal information";
	
	public String privacyPageURL="prosports.mobi/privacy";

}
