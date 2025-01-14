package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlecalender {

	public WebDriver driver;
	@Test
	public void Alert() throws InterruptedException {
	driver=new ChromeDriver();
	driver.navigate().to("https://selenium.qabible.in/date-picker.php");	
	driver.manage().window().maximize();
    driver.findElement(By.xpath("(//i[@class='fa fa-calendar'])[1]")).click();
    WebElement month =driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]"));
    while(!month.getText().contains("June")) {
    	
    	driver.findElement(By.xpath("(//*[@class='next'])[1]")).click();
    }

List<WebElement> days  = driver.findElements(By.xpath("(//*[@class='day'])"));

for(WebElement day:days) {
	
	if(day.getText().equals("2")) {
		
		day.click();
		break;
	}
	
}












	}

}
