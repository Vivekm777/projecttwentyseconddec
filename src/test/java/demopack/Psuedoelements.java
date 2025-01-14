package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Psuedoelements {
	
	public WebDriver driver;
	@Test
	public void locatepsuedoelement() {
	driver=new ChromeDriver();
	driver.navigate().to("https://www.opencart.com/index.php?route=account/register");
	driver.manage().window().maximize();
		
		
		
	}
	
	
	
	

}
