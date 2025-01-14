package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardactionp2 {
	public WebDriver driver;
	@Test
	public void keyboardactdemo() {
	driver=new ChromeDriver();
	
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	Actions action=new Actions(driver);
	action.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("mobile").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
	
	
	
}

}
