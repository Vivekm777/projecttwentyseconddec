package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser="chrome";
		WebDriver driver=null;
		
		if (browser.equalsIgnoreCase("chrome"))
			
		{
			driver=new ChromeDriver();
			
		}
	     else if(browser.equalsIgnoreCase("edge")) {
			
			driver=new EdgeDriver();
		}
	    
	     else if(browser.equalsIgnoreCase("firefox")) {
	    	
	    	driver=new FirefoxDriver();
	    }
		
	     else {
	    	 
	    	 System.out.println("Invalid browser");
	     }
       driver.manage().window().maximize();
       driver.navigate().to("https://www.google.com/");
       
	}

}
