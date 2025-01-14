 package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locatingAnelementfromTable {
	public WebDriver driver;
	@Test
	public void productAdditionToCart() {

		driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		WebElement textfromtable=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr/following::tbody/tr[8]/td[2]"));//tr[8]-row and column no td- 2
	   System.out.println(textfromtable.getText());//integrationspeciliast
	
	
	
	
	
	}

}
