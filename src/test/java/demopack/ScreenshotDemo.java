package demopack;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	
	
	public WebDriver driver;
	@Test
	public void productAdditionToCart() {

		driver = new ChromeDriver();
		driver.navigate().to("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshot\\cricbuzz.png");
		sourceFile.renameTo(targetFile);
	   
	
	
	
	
	
	
	
	}
}
