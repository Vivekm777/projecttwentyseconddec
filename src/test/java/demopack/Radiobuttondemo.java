package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radiobuttondemo {
	
public WebDriver driver;
@Test
public void checkradiobutton() {

	driver=new ChromeDriver();
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	Dimension dimension=new Dimension(1000, 900);
	driver.manage().window().setSize(dimension);
	WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radiobutton.click();
	driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();
	}
@Test	
public void groupradioButton()	{
	
	driver=new ChromeDriver();
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	Dimension dimension=new Dimension(1000, 900);
	driver.manage().window().setSize(dimension);
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//input[@id='inlineRadio21']")).click();
	driver.findElement(By.xpath("//input[@id='inlineRadio23']")).click();
	WebElement getresult=driver.findElement(By.xpath("//button[text()='Get Results']"));
	getresult.click();
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	

}
