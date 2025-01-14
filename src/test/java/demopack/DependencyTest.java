package demopack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	
@Test(priority =  1)
public void openapp() {
	
Assert.assertTrue(false);	
	
}
@Test(priority =  2 ,dependsOnMethods = "openapp")	//dependsonMethods(paramater) will skip the dependent methods
public void login() {//if login is dependent on open app
	
	
	Assert.assertTrue(true);
}

@Test(priority = 3,dependsOnMethods = "login")	
public void search() {
	
	Assert.assertTrue(true);
	
}

@Test(priority = 4,dependsOnMethods = "login")
public void advsearch() {
	
	
	Assert.assertTrue(true);
}

@Test(priority = 5,dependsOnMethods = "login")
public void logout() {
	
	Assert.assertTrue(true);
	
}
	
		
	
	
	
	
	
	
	
	
}
