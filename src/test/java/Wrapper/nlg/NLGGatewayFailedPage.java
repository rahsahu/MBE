package Wrapper.nlg;

import org.openqa.selenium.By;

import Wrapper.BasePaymentPage;

public class NLGGatewayFailedPage extends BasePaymentPage {

	public By p=By.xpath("//p");
	public String pValue1="The subscription request has failed.";
	public String pValue2="A network error has occurred.";
	public String pValue3="You have not been charged for this service.";
	public String homeLinkvalue="Home";
	public By homeLink=By.xpath("//u");
	
}
