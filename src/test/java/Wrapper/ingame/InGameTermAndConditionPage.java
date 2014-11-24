package Wrapper.ingame;

import org.openqa.selenium.By;

public class InGameTermAndConditionPage {

	public By heading=By.xpath("//h1");
	public By p1=By.xpath("//p[2]/strong");
	public By p2=By.xpath("//p[9]/strong");

	
	public String termPageURL="terms";
	
	public String headingValue = "Terms & Conditions";
	public String p1Value = "The Agreement";
	public String p2Value = "Terms relative to the Subscription Service";

	
}
