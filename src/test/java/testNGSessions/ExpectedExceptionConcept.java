package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class} )
	public void searctTest() {
		System.out.println("searctTest");
		//int i=9/0;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null; 
		obj.name = "naveen";
		
	}
	
	
	
	
	

}
