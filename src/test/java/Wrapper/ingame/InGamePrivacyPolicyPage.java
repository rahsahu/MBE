package Wrapper.ingame;

import org.openqa.selenium.By;

public class InGamePrivacyPolicyPage {

	public By heading=By.xpath("//h1");
	public By p1=By.xpath("//p/span");
	public By p2=By.xpath("//p[4]");
	public By p3=By.xpath("//p[8]");
	public By p4=By.xpath("//p[10]");

	public String headingValue = "Privacy Policy";
	public String p1Value = "About Us";
	public String p2Value = "Purpose of this Privacy Policy";
	public String p3Value = "Consideration of personal information";
	public String p4Value = "Collection of personal information";
	public String p5Value = "Use/Disclosure of personal information";
	
	public String privacyPageURL="privacy";

}
