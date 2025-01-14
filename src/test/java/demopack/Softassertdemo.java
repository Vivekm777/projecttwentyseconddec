package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertdemo {
	
	


	@Test
	public void productAdditionToCart() {


	SoftAssert softassert=new SoftAssert();
	String actual="Welcome to the store";
	String expected="Welcome to the shop";
	/*
	softassert.assertEquals(actual, expected);
	
	System.out.println("firstassertioncompleted");
	*/
	softassert.assertTrue(false);
	
	System.out.println("second assertion completed");
	
	softassert.assertAll();
	
	}	

}
