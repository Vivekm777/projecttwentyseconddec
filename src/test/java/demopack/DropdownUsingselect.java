package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownUsingselect {
	public WebDriver driver;
	@Test
	public void dropdown() throws InterruptedException {
	driver=new ChromeDriver();
	
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	driver.manage().window().maximize();
	WebElement selectdropdown=driver.findElement(By.xpath("//Select[@id='single-input-field']"));
	Select obj=new Select(selectdropdown);
	obj.selectByVisibleText("Green");
	Thread.sleep(3000);
	obj.selectByIndex(1);
	Thread.sleep(3000);
    obj.selectByValue("Yellow");
   System.out.println(obj.getFirstSelectedOption());
   List<WebElement>selectedoption=obj.getAllSelectedOptions();
   System.out.println(selectedoption);
   List<WebElement>dropdownoptions=driver.findElements(By.xpath("//Select[@id='single-input-field']/option"));
   System.out.println(dropdownoptions);
  





	}
}
