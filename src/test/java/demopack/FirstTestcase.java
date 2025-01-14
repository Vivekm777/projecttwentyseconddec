package demopack;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FirstTestcase {
	
@Test(priority = 25)
public void login()	{
	
System.out.println("login to application ");	
	
}
	
@Test(priority = 10)	
public void openapp() {
	
System.out.println("open the application");	
}
@Test
public void closeapp() {
	System.out.println("close the application");
}

}
