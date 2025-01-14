package demopack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandlenew {
	 
public WebDriver driver;
@Test
public void flipkartaddtocart()
{
	driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
    WebElement searchfield = driver.findElement(By.xpath("//input[contains(@title,'Search for Products, Brands and More')]"));
    searchfield.sendKeys("Iphone");
    WebElement searchbutton = driver.findElement(By.xpath("//button[contains(@title,'Search for Products, Brands and More')]"));
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click()", searchbutton);

    // Select iPhone 15 Plus (Green, 128 GB) - First Product
    WebElement iphone = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 15 Plus (Green, 128 GB)')]"));
    executor.executeScript("arguments[0].click()", iphone);
     Set<String>windowhandle=driver.getWindowHandles();
          Iterator<String> i1=windowhandle.iterator();
          String parent=i1.next();
          String child=i1.next();
          driver.switchTo().window(child);
          WebElement addtocart=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']"));
          
	
}
	
	

}
