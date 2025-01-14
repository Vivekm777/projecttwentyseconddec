package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownwithoutSelect {
	public WebDriver driver;
	@Test
	public void dropdownwithoutselect() throws InterruptedException {
	driver=new ChromeDriver();
	driver.navigate().to("https://selenium.qabible.in/jquery-select.php");
    driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@class='select2-selection select2-selection--multiple']")).sendKeys("new");
	List<WebElement>  states= driver.findElements(By.xpath("//li[@class='select2-results__option select2-results__option--selectable']"));
	for(WebElement State:states)
	{
	 if(State.getText().equalsIgnoreCase("Nevada"))
	 {
		 
		State.click();
		break;
	 }
	}
	
}
	}