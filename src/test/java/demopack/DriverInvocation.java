package demopack;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverInvocation {

public WebDriver driver;
@Test
public void chromedriverinvoaction()
{

	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.manage().window().maximize();
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
