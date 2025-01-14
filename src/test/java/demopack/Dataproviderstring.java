package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderstring {


	public WebDriver driver;

	@Test(dataProvider = "testdata")
	public void dataproviderconcept(String value1,String value2) {

		driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/ajax-form-submit.php");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='subject']")).sendKeys(value1);
        driver.findElement(By.xpath("//*[@id='description']")).sendKeys(value2);
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
        
	     }
        @DataProvider(name="testdata")
        public Object[][] datafeed(){
        	Object[][] dataset=new Object[2][2];
        	dataset[0][0]="Disease";
        	dataset[0][1]="cholostrol";
        	dataset[1][0]="Commerce";
        	dataset[1][1]="Ca";
        	return dataset;
        
        


             

	}
}
