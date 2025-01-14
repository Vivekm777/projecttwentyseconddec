package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SvgLocating {

	public WebDriver driver;
	@Test
	public void dropdown() throws InterruptedException {
	driver=new ChromeDriver();
	
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	
	WebElement polygonsvg= driver.findElement(By.xpath("//*[name()='svg']/*[name()='polygon']"));
	System.out.println(polygonsvg.getText());
	
	
	}	
	
	
	
	
}
