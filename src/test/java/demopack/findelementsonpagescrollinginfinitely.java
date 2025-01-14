package demopack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findelementsonpagescrollinginfinitely {
	
	public WebDriver driver;
	@Test
	public void handlelistbox() throws InterruptedException {
	 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://booksbykilo.in/new-books");
	    driver.manage().window().maximize();
	    int currentcount=0;
	    int previouscount=0;
	    while(true) {
	List<WebElement> books=driver.findElements(By.xpath("//div[@class='cart_img_div']"));
	currentcount=books.size();
	if(currentcount==previouscount) {
		
		break;
	}
	previouscount=currentcount;
	    
	  JavascriptExecutor executor =(JavascriptExecutor) driver; 	
	  executor.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	    Thread.sleep(3000);
	    	
	    }
	
	System.out.println("current count of books is:"+currentcount);
	 
	
	driver.quit();
	
	
	
	
	
	
	
	}
}
