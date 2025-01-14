package demopack;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChecksameOptionsinthelistbox {

	public WebDriver driver;
	@Test
	public void handlelistbox() {
	 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    JavascriptExecutor executor=(JavascriptExecutor)driver;
	    executor.executeScript("window.scrollBy(0,900)");
	    WebElement listbox=driver.findElement(By.xpath("//select[@id='colors']"));
	    Select obj=new Select(listbox);
	    Set<String>uniqueoptions=new HashSet<String>();
	    
	    boolean flag=false;

       for(WebElement option  :  obj.getOptions()) {
    	   
    	String optiontext=option.getText();
    	if(!uniqueoptions.add(optiontext)) {
    		
    		System.out.println("Duplicate option found :"+optiontext);
    		flag=true;//as soon asi found duplicate value flag value becomes true
    	}
       }

if(!flag) {
	
	System.out.println(" no duplicate option  found");
}


	}
}
