package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SliderDemo {
	
WebDriver driver;
@Test
public void performSlidingAction() {
driver=new ChromeDriver();
//driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
driver.navigate().to("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("window.scrollBy(0,1500)");
 //WebElement min_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 0%;']"));
//System.out.println("location of min_slider:"+min_slider.getLocation());
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 15%;']")));
WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 15%;']"));
System.out.println(slider.getLocation());

Actions action=new Actions(driver);//889,1968
//action.dragAndDropBy(min_slider,300,258).perform();
action.dragAndDropBy(slider, 9, 1968).perform();
	
}
	
	
	

}
