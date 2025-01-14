package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KeyboardActions {
	public WebDriver driver;
	@Test
	public void learnkeyboardaction() {
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	Actions action=new Actions(driver);
	/*
	WebElement accountsandlist=driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]"));
	action.moveToElement(accountsandlist).build().perform();//hover over element;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement todaysdeal=driver.findElement(By.xpath("(//a[contains(text(),'Best Sellers')])[1]"));
	action.moveToElement(todaysdeal).doubleClick().build().perform();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Hot New Releases']")));
	driver.findElement(By.xpath("//a[text()='Hot New Releases']")).click();
	driver.navigate().back();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']/..")));
	WebElement languageselector= driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']/.."));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
	*/
	WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	action.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("laptop").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();

	
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
