package Wrapper.nlg;

import org.openqa.selenium.By;

public class RUTermAndConditionPage {

	public By heading=By.xpath("//h1");
	public By p1=By.xpath("//p");
	public By p2=By.xpath("//p[6]/b");
	public By p3=By.xpath("//p[10]/b");
	public By p4=By.xpath("//p[15]/b");

	
	public String termPageURL="6-RU-terms";
	
	public String headingValue = "Условия и Ограничения";
	public String p1Value = "Дата утверждения:";
	public String p2Value = "Описание Сервиса";
	public String p3Value = "Тариф";
	public String p4Value = "Форма оплаты";

	
}
