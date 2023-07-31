package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10, priority = 2)//we can write exceptions also
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google","Google");
	}
	
	@Test(invocationCount = 10, priority = 1)
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("iPhone","iPhone");
	}
	

}
