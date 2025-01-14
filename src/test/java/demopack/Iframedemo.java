package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Iframedemo {
	
public WebDriver driver;
@Test
public void framehandling() {
	
driver=new ChromeDriver();
driver.navigate().to("https://demo.automationtesting.in/Frames.html");
driver.manage().window().maximize();
//method 1-switch to frame
WebElement  frame=driver.findElement(By.id("singleframe"));
//driver.switchTo().frame(frame);
 /*
WebElement textbox=driver.findElement(By.xpath("(//div[@class='col-xs-6 col-xs-offset-5']/input)[1]"));
textbox.sendKeys("Just love it");
driver.switchTo().defaultContent();
*/
	
//method 2	-using explicit wait
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("window.scrollBy(0,500)");
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
driver.findElement(By.xpath("(//div[@class='col-xs-6 col-xs-offset-5']/input)[1]")).sendKeys("just do it");




}

}
