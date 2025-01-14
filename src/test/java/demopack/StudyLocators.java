package demopack;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StudyLocators {

	public WebDriver driver;
	@Test
	public void variouslocators() throws InterruptedException{
	driver=new ChromeDriver();
    driver.navigate().to("https://www.saucedemo.com/");
   // Dimension dimension=new Dimension(1500,900);
  //  driver.manage().window().setSize(dimension);
    driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	WebElement loginbutton=driver.findElement(By.xpath("//div[@class='error-message-container']/following-sibling::input"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()", loginbutton);
	executor.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	executor.executeScript("window.scrollBy(0,-1000)");
	WebElement hamburgericon=driver.findElement(By.xpath("//div[@class='bm-burger-button']/button"));
	executor.executeScript("arguments[0].click()",hamburgericon);
/*	
List<WebElement>addtoCart=driver.findElements(By.xpath("//button[contains(@class,'btn btn_primary btn_small btn_inventory')]"));
for(WebElement addcartbutton: addtoCart)
{
	
	addcartbutton.click();
}
*/
List<WebElement> products=driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
for(WebElement productname:products)
{
	
System.out.println(productname.getText());	
}
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
