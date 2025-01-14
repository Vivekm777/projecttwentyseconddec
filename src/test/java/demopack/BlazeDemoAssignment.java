package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BlazeDemoAssignment {
WebDriver driver;
@Test
public void selectlowestfareflight() {
driver=new ChromeDriver();
driver.navigate().to("https://www.blazedemo.com/");
driver.manage().window().maximize();
WebElement departuredropdown=driver.findElement(By.xpath("//select[@name='fromPort']"));
Select obj1=new Select(departuredropdown);
obj1.selectByContainsVisibleText("Philadelphia");
WebElement destinationdropdown=driver.findElement(By.xpath("//select[@name='toPort']"));
Select obj2=new Select(destinationdropdown);
obj2.selectByVisibleText("London"); 
driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

	
	
	
}


















}
