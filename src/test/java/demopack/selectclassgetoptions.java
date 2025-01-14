package demopack;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectclassgetoptions {
	
	
	
	public WebDriver driver;
	@Test
	public void selectdropdowngetoptionsdemo() throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		//driver.navigate().to("https://www.google.com/");
		Dimension dimension=new Dimension(800, 1000);
		driver.manage().window().maximize();
		JavascriptExecutor exceutor=(JavascriptExecutor)driver;
		exceutor.executeScript("window.scrollBy(0,900)");
		/*
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select obj=new Select(dropdown);
		List<WebElement>options=obj.getOptions();  
		for(WebElement optionss:options) {
			
			System.out.println(optionss.getText());
		}
		*/
		/*
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement>autosuggestedsearches=driver.findElements(By.xpath("//li[@class='sbct PZPZlf']"));
		System.out.println(autosuggestedsearches.size());
		for(WebElement asugsear:autosuggestedsearches) {
			
			System.out.println(asugsear.getText());
			*/
		
		int count=0;
		List<WebElement>price=driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[4]"));
		
		for(WebElement priceofBooks:price) {
			
			String sum=priceofBooks.getText();
			
			count+=Integer.parseInt(sum);
		}
		
		System.out.println(count);
		}
		
	}
	


