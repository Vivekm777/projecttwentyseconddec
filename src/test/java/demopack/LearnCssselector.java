package demopack;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnCssselector {
	
	public WebDriver driver;
	@Test
	public void learncss()
	{
	driver=new EdgeDriver();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".ico-login"))));
	driver.findElement(By.cssSelector(".ico-login")).click();
	driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
	driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("mypassword");
	driver.findElement(By.cssSelector(".button-1.login-button")).click();
	
	
	
		
	}

}
