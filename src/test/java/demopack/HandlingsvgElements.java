package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingsvgElements {

	public WebDriver driver;
	@Test
	public void svghandling() {
	 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    JavascriptExecutor executor=(JavascriptExecutor)driver;
	    executor.executeScript("window.scrollBy(0,1800)");
	    WebElement svgcircle=driver.findElement(By.xpath("//*[local-name()='svg']/*[local-name()='circle']"));
	    System.out.println(svgcircle.getDomAttribute("stroke"));
	    WebElement svgrect=driver.findElement(By.xpath("(//*[local-name()='svg']/*[local-name()='rect'])[1]"));
	    System.out.println(svgrect.getDomAttribute("stroke-width"));
}
}