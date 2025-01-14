package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddropDemo {

	public WebDriver driver;

	@Test
	public void productAdditionToCart() {

		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,500)");
		WebElement source = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']/p"));
		action.dragAndDrop(source, target).build().perform();

	}

	@Test
	    public void herokudragandDrop() {
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='column-b']"));
		actions.dragAndDrop(source, target).build().perform();

	}
}
