package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkboxdemo {
public WebDriver driver;
@Test
public void singlecheckbox() {
	driver=new ChromeDriver();
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	Dimension dimension=new Dimension(1000, 900);
	driver.manage().window().setSize(dimension);
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	System.out.println("is check box selected:"+checkbox.isSelected());
	checkbox.click();
	System.out.println("is checkbox displayed:"+checkbox.isDisplayed());
	System.out.println("is check box selected:"+checkbox.isSelected());
	
	


}   @Test
    public void checkingAllcheckboxes() {
	driver=new ChromeDriver();
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	Dimension dimension=new Dimension(1000, 900);
	driver.manage().window().setSize(dimension);
    List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='check-box-list']"));
    for(WebElement checkbxes:checkboxes)
    {
    	checkbxes.click();
    	System.out.println("checkbox are seleceted:"+checkbxes.isSelected());
    }
    

}
}
