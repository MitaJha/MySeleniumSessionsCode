package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest {
	//CRUD - ADD/GET/Update/Delete
	
	public int addUser() {
		System.out.println("adding a user");
		int userId = 123;
		return userId;
	}
		
	@Test(priority = 1)
	public void addUserTest() {		
		int userId = addUser();   //calling addUser method
		Assert.assertEquals(userId, 123);
	}
	
	@Test(priority = 2)
	public void getUserTest() {
		int userId = addUser();
		System.out.println("get the user for user Id: " + userId);
	}
	
	@Test(priority = 3)
	public void updateUserTest() {
		int userId = addUser();
		System.out.println("update the user for user Id: " + userId);
	}

	@Test(priority = 4)
	public void deleteUserTest() {
		int userId = addUser();
		System.out.println("delete the user for user Id: " + userId);
	}


}

