package demopack;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GeneralMethods {
	
	public WebDriver driver;

	@Test
	public void grabText(){
		
	driver =new ChromeDriver();
	driver.navigate().to("https://www.yatra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[text()='One Way']"))));
	WebElement oneway=driver.findElement(By.xpath("//h4[text()='One Way']"));
	System.out.println(oneway.getDomAttribute("class"));
	System.out.println(oneway.getCssValue("class"));
	
	WebElement fortravelagent=driver.findElement(By.xpath("//a[contains(@title,'For Travel Agents')]"));
	
System.out.println(fortravelagent.getDomAttribute("title"));
driver.close();
		
		
	}

}
