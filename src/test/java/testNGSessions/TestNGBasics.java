package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	// global pre condition
	// pre condition
	// test steps + exp vs act --> assertion ---> P/F
	// post steps

	// 1.
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connectWithDB");
	}

	// 2.
	@BeforeTest
	public void createUser() {
		System.out.println("BT-- createUser");
	}

	// 3.
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-- launchBrowser");
	}

	// 4 7 10
	@BeforeMethod // running before each test() on the basis of alphabetic order
	public void loginToApp() {
		System.out.println("BM-- loginToApp");
	}

	// 11
	@Test
	public void searctTest() {
		System.out.println("searctTest");
		Assert.assertEquals("Google", "Google");
	}

	// 5
	@Test
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook", "macbook1");
	}

	// 8
	@Test
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals(1000, 1000);
	}

	// 6 9 12
	@AfterMethod
	public void logout() {
		System.out.println("AM ---logout");
	}

	// 13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC ---closeBrowser");
	}

	// 14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT ---deleteUser");
	}

	// 15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS ---disconnectWithDB");
	}

}
