package demopack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleTables {
public WebDriver driver;
@Test
public void handleDynTable() {
		/*
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	    driver.manage().window().maximize();
		
		List< WebElement> tabledetails=driver.findElements(By.xpath("//table[@id='dtBasicExample']/descendant::tr[4]/td"));
		for (WebElement tabledetailss:tabledetails) {
	System.out.println(tabledetailss.getText());
	*/
		
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    JavascriptExecutor executor=(JavascriptExecutor)driver;
	    executor.executeScript("window.scrollBy(0,1800)");
	   List<WebElement> tabledetails =   driver.findElements(By.xpath("(//tbody)[1]/tr[5]/td"));
		
	    for(WebElement tbdetails:tabledetails) {
	    	System.out.println(tbdetails.getText());
	    }
	    
	    
	    
	    
		}
}
	

