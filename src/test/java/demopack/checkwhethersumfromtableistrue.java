package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkwhethersumfromtableistrue {
	
	public WebDriver driver;
	@Test
	public void dropdown() throws InterruptedException {
	driver=new ChromeDriver();
	
	driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	JavascriptExecutor executor=(JavascriptExecutor)driver;
    executor.executeScript("window.scrollBy(0,800)");
    
    List<WebElement>webtable=driver.findElements(By.xpath("(//table[@id='product'])[2]/thead/following::tbody[1]/tr/td[4]"));
    int sumofnumbers=0;
    for(WebElement    webtableaddition:webtable) {
    	
    	System.out.println(webtableaddition.getText());
    	String listofnumbers=webtableaddition.getText();
    	sumofnumbers +=Integer.parseInt(listofnumbers);
    	
    //	System.out.println("total sum is:"+sumofnumbers);
    	
    }
    

	
	System.out.println("total sum is:"+sumofnumbers);
	
	int actualsum=sumofnumbers;
	int expectedsum=296;
	Assert.assertEquals(actualsum, expectedsum, "sum of the numbers are not equal");
	
	
	

	
	}
}
