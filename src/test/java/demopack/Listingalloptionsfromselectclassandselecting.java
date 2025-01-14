package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Listingalloptionsfromselectclassandselecting {

	public WebDriver driver;
	@Test
	public void dropdown() {
	driver=new ChromeDriver();
	
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("window.scrollBy(0,1200)");
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
    Select obj=new Select(dropdown);
    List<WebElement>countrylist=obj.getOptions();
    for(WebElement listofcountries:countrylist) {
    
    System.out.println(listofcountries.getText());	
    listofcountries.click();
    	
    }









	}

}
