package demopack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Takescreenshotbyscrolling {
	
	WebDriver driver;

	@Test
	public void takescreenshotofWebsite(){
	driver=new ChromeDriver();
	driver.navigate().to("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	/*
    JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("window.scrollBy(0,1000)");
    */
	/*
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	File targetFile=new File(System.getProperty("user.dir")+"\\Screenshot\\testautomationpractice.png");
	sourceFile.renameTo(targetFile);
	
	*/
	/*
	
	WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
    File sourceFile=featuredproducts.getScreenshotAs(OutputType.FILE);
	File targetFile=new File(System.getProperty("user.dir")+"\\Screenshot\\featuedproducts.png");
	sourceFile.renameTo(targetFile);
	*/
	
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File sourceFile=logo.getScreenshotAs(OutputType.FILE);
	File targetFile=new File(System.getProperty("user.dir")+"\\Screenshot\\logo.png");
	sourceFile.renameTo(targetFile);
	
	}	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


