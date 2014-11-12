package Wrapper.joocey;

import org.openqa.selenium.By;

public class JooceyPrivacyPolicyPage extends JooceyFooterBasePage{

	public By heading=By.xpath("//div[3]/div/ul/li[2]");
	public By p1=By.xpath("//b[1]/u");
	public By p2=By.xpath("//b[2]/u");
	public By p3=By.xpath("//b[3]/u");
	public By p4=By.xpath("//b[4]/u");
	public By p5=By.xpath("//b[5]/u");
	public By p6=By.xpath("//b[6]/u");
	public By p7=By.xpath("//b[7]/u");
	public By p8=By.xpath("//b[8]/u");
	public By p9=By.xpath("//b[9]/u");

	public String headingValue = "Privacy Policy";
	public String p1Value = "About Us";
	public String p2Value = "Purpose of this Privacy Policy";
	public String p3Value = "Consideration of personal information";
	public String p4Value = "Collection of personal information";
	public String p5Value = "Use/Disclosure of personal information";
	
	public String privacyPageURL="privacy";
	
}
