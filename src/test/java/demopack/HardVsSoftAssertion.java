package demopack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
@Test
void hardAssertion() {
	
System.out.println("i am testing1");
System.out.println("i am testing 2");
Assert.assertEquals(1, 2);
System.out.println("i am testing3");
System.out.println("i am testing 4");	
}
	
@Test
void softAssertion() {
	
System.out.println("i am testing1");
System.out.println("i am testing 2");
SoftAssert softassert=new SoftAssert();
softassert.assertEquals(1, 2);

System.out.println("i am testing3");
System.out.println("i am testing 4");	
softassert.assertAll();
}
	
	
		
	
	
	
	
	
	
	
}
