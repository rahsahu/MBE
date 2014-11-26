package Wrapper.nlg;

import org.openqa.selenium.By;

public class RUNLGPrivacyPolicyPage {

	public By heading=By.xpath("//h1");
	public By p1=By.xpath("//p[9]/b");
	public By p2=By.xpath("//p[14]/b");
	public By p3=By.xpath("//p[17]/b");


	public String headingValue = "Политика Конфиденциальности.";
	public String p1Value = "Назначение Политики Конфиденциальности";
	public String p2Value = "Определение личных данных";
	public String p3Value = "Сбор персональной информации";
	
	public String privacyPageURL="6-RU-privacy/";

}
