package demopack;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandling {
	
	
	public WebDriver driver;
	@Test
	public void addProductToCart() {
	
	driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement searchfield=driver.findElement(By.xpath("//input[contains(@title,'Search for Products, Brands and More')]"));
    searchfield.sendKeys("Iphone");
    WebElement searchbutton=driver.findElement(By.xpath("//button[contains(@title,'Search for Products, Brands and More')]"));
    JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click()", searchbutton);
    WebElement iphone=driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 15 Plus (Green, 128 GB)')]"));
    executor.executeScript("arguments[0].click()", iphone);
    String parent=driver.getWindowHandle();
    Set<String>s=driver.getWindowHandles();
    Iterator<String>i1=s.iterator();
    while(i1.hasNext()) {
    String child=i1.next();
    if(!parent.equals(child)) {
    driver.switchTo().window(child);
    executor.executeScript("window.scrollBy(0,300)");
    WebElement adtocart=driver.findElement(By.xpath("//li[@class='col col-6-12 ']/button"));
    adtocart.click();
    
    	
    }
    	
    }
    
		
	driver.switchTo().window(parent);
	driver.navigate().refresh();
		
		
		
	}

}
