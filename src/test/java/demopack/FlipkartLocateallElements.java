package demopack;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartLocateallElements {
	
	public WebDriver driver;
	@Test
	public void locateAllProductsInPage()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Dimension dimension=new Dimension(1000, 800);
		driver.manage().window().setSize(dimension);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products, Brands and More')]")).sendKeys("iphone");
		WebElement searchbutton=driver.findElement(By.xpath("//button[contains(@title,'Search for Products, Brands and More')]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", searchbutton);
		List<WebElement>iphon=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for(WebElement iphone:iphon)
		{
			System.out.println(iphone.getText());
			
		}
		
		
		
		
	}

}
