package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationTableDemo {

WebDriver driver;

@Test
public void extractTableData() {
	
	
driver=new ChromeDriver();
driver.navigate().to("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("window.scrollBy(0,2500)");


List<WebElement> NoofPages=driver.findElements(By.xpath("//li/a[@href='#']"));
int totalnumberofpages=NoofPages.size();
for(int i=1;i<=totalnumberofpages;i++) {
	if(i>1) {
		
	WebElement pagelink=driver.findElement(By.xpath("//a[text()='"+i+"' "));
	pagelink.click();
	
	}
	
}

	
	
}











}
