package demopack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavascriptAlert {
public WebDriver driver;
@Test
public void Alert() throws InterruptedException {
driver=new ChromeDriver();
driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");	
driver.manage().window().maximize();
/* 
driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]")).click();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().dismiss();
*/
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("window.scrollBy(0,400)");
/*
driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
org.openqa.selenium.Alert alert=driver.switchTo().alert();
Thread.sleep(9000);
alert.sendKeys("Sruthi");
alert.accept();
*/
driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
org.openqa.selenium.Alert alert=driver.switchTo().alert();
String alertmessage=alert.getText();
System.out.println(alertmessage);
alert.accept();




	
}














}
