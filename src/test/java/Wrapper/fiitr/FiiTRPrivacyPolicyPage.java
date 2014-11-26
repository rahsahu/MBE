package Wrapper.fiitr;

import org.openqa.selenium.By;


public class FiiTRPrivacyPolicyPage extends FiiTRBasePage{

	public By heading=By.xpath("//h1");
//	public By p1=By.xpath("//p[1]");
	public By p2=By.xpath("//p[2]");
	public By p3=By.xpath("//p[5]");
	public By p4=By.xpath("//p[9]");


	public String headingValue = "Privacy Policy";
	public String p2Value = "About Us";
	public String p3Value = "Purpose of this Privacy Policy";
	public String p4Value = "Consideration of personal information";

	public String privacyPageURL="privacy-policy";

}
