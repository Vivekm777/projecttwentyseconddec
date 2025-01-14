package demopack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDynamicTable {
	
	//DynamicTable-every time page is loaded data coming from server so we dont see same type of data
	//table dynamically changes even rows and columns keeps changing
	//here name column is constant rest memory ,cpu,disk,network keeps changing
	//first we need to find where chrome is present in name which row chrome is present
	//once chrome is found out we need to capture value of cpu %
	//once cpu% is captured we need to compare it with chrome cpu mentioned in yellow label
	
	public WebDriver driver;
	@Test
	public void handleDynTable() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,500)");
		//first requirement is to find which row chrome is present so we need capture names from every row
		//whenever chrome is matched we need to stop the loop so to repeat rows we need to find how many rows are there in this table
		//first we nned to locate table using table tag and move to tbody and go to tr which gives number of rows //*[@class='table table-striped']/tbody/tr
		//this return all rows from table
		 List<WebElement> rows=driver.findElements(By.xpath("//*[@class='table table-striped']/tbody/tr"));
		 System.out.println("number of rows is:"+rows.size());
		 for(int r=1;r<=rows.size();r++) {
			 //table[@class='table table-striped']/tbody/tr[4]/td[1]
			WebElement name= driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+ r +"]/td[1]"));
			if(name.getText().equalsIgnoreCase("chrome")) {//if text is equal to chrome we should get cpu percentage whever chrome is displayed we need to extract cpu percentage
			//we need dynamic xpath to get chrome
				
				driver.findElement(By.xpath("//td[normalize-space()='Chrome']"));//first we need to move to chrome element and capture cpu load
				//cpu percentage keeps changing
				//td are following-sibling of chrome  filter text by using contains text -% ,as % present only for cpu
			String cpuvalue= driver.findElement(By.xpath("//td[normalize-space()='Chrome']/following-sibling::*[contains(text(),'%')]")).getText();//xpath capture cpu load
				//comapre with yellow coloured perceentage cpu text
				String value=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
				if(value.contains(cpuvalue)
						){
					
					System.out.println("Cpu load of chrome is equal");
				}
				
				else {
					
					System.out.println("cpu load is not equal");
				}
				break;
			}
	        
			
			 
		 
		 
	}
}
	
}	
	
	
	


