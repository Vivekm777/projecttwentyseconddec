package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo2 {
WebDriver driver;
@Test(dataProvider = "dp")
void entervaluesininputfield(String value1,String value2){
driver=new ChromeDriver();
driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
driver.manage().window().maximize();
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("window.scrollBy(0,500)");
WebElement valuea= driver.findElement(By.xpath("//input[@id='value-a']"));
valuea.sendKeys(value1);
WebElement valueb=driver.findElement(By.xpath("//input[@id='value-b']"));
valueb.sendKeys(value2);
WebElement gettotalbutton=driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
executor.executeScript("arguments[0].click()", gettotalbutton);
	
	
	
	
}


@DataProvider(name = "dp")
Object providevalue() {
	
Object data[][]= {
		
		{"5","10"},
		{"8","15"},
		{"10","17"},
		{"4","12"},
		
		
		
		

};	
	
	
return data;	
}












}
