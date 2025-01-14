package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Handleajaxcalls {
	

	public WebDriver driver;
	@Test
	public void handleajaxdemo() {
	driver=new ChromeDriver();
	driver.navigate().to("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='loadContent']")).click();
	//WebElement loadedtext=driver.findElement(By.xpath("////div[@id='ajaxContent']/h2"));
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	//WebElement loadedtext=driver.findElement(By.xpath("//div[@id='ajaxContent']/h2"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajaxContent']/h2")));
	WebElement loadedtext=driver.findElement(By.xpath("//div[@id='ajaxContent']/h2"));
	loadedtext.getText();
		
		
		
	}
	
	

}
