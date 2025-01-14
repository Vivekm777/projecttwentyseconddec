package demopack;

import java.sql.Array;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDemo { 
public WebDriver driver; 
	@Test
	public void productAdditionToCart() {

	
	String expectedHeading="Welcome to our store";
	String actualHeading="Welcome to our store";
	Assert.assertEquals(actualHeading, expectedHeading);
	
	
	
	int actualcount=10;
	int expectedcount=10;
	Assert.assertEquals(actualcount, expectedcount);
		
		
	String actual[]= {"vivek","raju","Anoop"};
	String expected[]= {"raju","Anoop","vivek"};
	
	Arrays.sort(actual);
	Arrays.sort(expected);
	
	Assert.assertEquals(actual, expected);
		
		
		
		
		
		
		
}
}