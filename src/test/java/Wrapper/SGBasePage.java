package Wrapper;

import org.openqa.selenium.By;

public class SGBasePage {
	

	public By termLink=By.xpath("//li[1]/a");
	public By privacyLink=By.xpath("//li[2]/a");
	public By contactUsLink=By.xpath("//li[3]/a");
	
	public By mobileSubmitButton=By.xpath("//input[5]");
	public By mobileNumberTextBox=By.xpath("//input[6]");
	public By mobileBeforeMNumTextField=By.xpath("//b");
	public String mobileBeforeMNumTextFieldValue="Get your personal SMS Code to play the best tips NOW!"; 
	
}
