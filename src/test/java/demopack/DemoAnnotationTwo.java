package demopack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoAnnotationTwo {
 @BeforeClass
	public void login()	{
		
		System.out.println("this is login");	
			
		}
		@Test	
		public void search() {
			
			
		System.out.println("this is search");	
		}
		@Test	
		public void advsearch()	{
			
		System.out.println("This is advsearch");	
		}
			
		@AfterClass
		public void logout() {
			
		System.out.println("This is logout");	
		}
			
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
