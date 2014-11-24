package Wrapper.gameshaus;

import org.openqa.selenium.By;

public class GamesHausPrivacyPolicyPage extends GamesHausFooterBasePage{

	public By heading=By.xpath("//b");
	public By p1=By.xpath("//p[3]/b");
	public By p2=By.xpath("//p[6]/b");
	public By p3=By.xpath("//p[10]/u");
	public By p4=By.xpath("//p[17]/u");

	public String headingValue = "Privacy Policy";
	public String p1Value = "About Us";
	public String p2Value = "Purpose of this Privacy Policy";
	public String p3Value = "Consideration of personal information";
	public String p4Value = "Collection of personal information";
	public String p5Value = "Use/Disclosure of personal information";
	
	public String privacyPageURL="privacy";
	
}
