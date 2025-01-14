package demopack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Jquerycalender {

	public WebDriver driver;

	@Test
	public void handlingcalender() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/jquery-date-picker.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='form-control hasDatepicker'])[1]")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select obj = new Select(dropdown);
		obj.selectByValue("8");

		List<WebElement> days = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for (WebElement date : days) {

			if (date.getText().equals("5")) {
				date.click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
	}

}
