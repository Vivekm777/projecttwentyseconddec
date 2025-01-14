package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	public WebDriver driver;

	@Test
	public void productAdditionToCart() {

		driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
	  boolean loginisdisplayed =driver.findElement(By.xpath("//a[@class='ico-login']")).isDisplayed();
	  System.out.println(loginisdisplayed);
	 Assert.assertTrue(loginisdisplayed, "login is not displayed");
	 String expectedheading="Welcome to our store";
	 String actualheading=driver.findElement(By.xpath("//*[contains(text(),'Welcome to our store')]")).getText();
	 Assert.assertEquals(actualheading, expectedheading);
	 
	
	
	
	
	
	}	
	
	
	
	
	

}
