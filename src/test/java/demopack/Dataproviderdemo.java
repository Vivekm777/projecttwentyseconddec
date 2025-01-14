package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	

	public WebDriver driver;

	@Test(dataProvider = "testdata")
	public void dataprovidersumdemo(String value1,String value2) {

		driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys(value1);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(value2);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		
	}	
	@DataProvider(name = "testdata")
	public Object[][] testdatafeed(){
		
	Object[][] dataset=new Object[2][2];
	dataset[0][0]="1";
	dataset[0][1]="3";
	dataset[1][0]="5";
	dataset[1][1]="8";
	return dataset;
	
		
	}
		
		
		
		
		
		
		
		
		
	
	


	}
	
	
	
	
	
	
	


