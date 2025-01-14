package demopack;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpeninANewPageDemo {

	WebDriver driver;

	@Test
	public void openInANewWindow() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement grocerybutton = driver.findElement(By.xpath("//span[contains(text(),'Grocery')]"));
		Actions action = new Actions(driver);
		action.moveToElement(grocerybutton).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> i = windowhandles.iterator();
		String parent = i.next();
		String child = i.next();
		driver.switchTo().window(child);
		driver.navigate().refresh();
		driver.switchTo().window(parent);
		driver.navigate().refresh();

	}

}
