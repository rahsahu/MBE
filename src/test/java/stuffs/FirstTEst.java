package stuffs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTEst {
	@Test
	public void loginTest() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
//		driver.findElement(By.xpath(""))
		Thread.sleep(20000);
	}

}
