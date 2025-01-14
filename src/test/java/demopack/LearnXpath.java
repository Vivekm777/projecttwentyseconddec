package demopack;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnXpath {

	public WebDriver driver;
	@Test
	public void xpathlearningtool()
	{
	driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='ico-login']"))));
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	WebElement loginfield =driver.findElement(By.xpath("(//div[@class='inputs'])[1]/input"));
	loginfield.sendKeys("obsqura24@gmail.com");
	WebElement passwordField=driver.findElement(By.xpath("//input[@name='Password']"));
	passwordField.sendKeys("mypassword");
	driver.findElement(By.xpath("//input[contains(@class,'button-1 login-button')]")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
