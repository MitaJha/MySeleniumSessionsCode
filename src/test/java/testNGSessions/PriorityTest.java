package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

//if some test cases with priority and some cases without priority 
//then with priority cases will run first

public class PriorityTest {
	
	@Test(priority = 2)
	public void searctTest() {
		System.out.println("searctTest");
		Assert.assertEquals("Google", "Google");
	}
	@Test(priority = 3)
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook", "macbook");
	}
	@Test(priority = 1)
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals(1000, 1000);
	}

	@Test(priority = 4)
	public void emailTest() {
		System.out.println("emailTest");
		Assert.assertEquals("email is sent", "email is sent");
	}
	@Test(priority = 0)
	public void paymentTest() {
		System.out.println("paymentTest");
		Assert.assertEquals(300, 300);
	}
}
