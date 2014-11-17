package Wrapper.mhub;

import org.openqa.selenium.By;

public class MHubPrivacyPolicyPage extends MHubBasePage{

	public By heading=By.xpath("//strong");
	public By p1=By.xpath("//p[1]");
	public By p2=By.xpath("//p[2]");
	public By p3=By.xpath("//p[3]");
	public By p4=By.xpath("//p[4]");
	public By p5=By.xpath("//p[5]");
	public By p6=By.xpath("//p[6]");
	public By p7=By.xpath("//p[7]");
	public By p8=By.xpath("//p[8]");
	public By p9=By.xpath("//p[9]");

	public String headingValue = "About Us";
	public String p1Value = "About Us";
	public String p2Value = "This Policy governs your use of the MHUB mobile site and any content, products and services made available from or through this website.";
	public String p3Value = "The mobile site and web site are made available by MHUB which is owned and operated";
	public String p4Value = "Purpose of this Privacy Policy";
	public String p5Value = "We are committed to protecting and maintaining the privacy of your personal information by adhering to all applicable and required privacy guidelines";
	
	public String privacyPageURL="privacy";

}
