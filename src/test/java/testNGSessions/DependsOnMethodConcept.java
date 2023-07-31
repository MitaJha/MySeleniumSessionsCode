package testNGSessions;

import org.testng.annotations.Test;

//using dependencies in writing test cases are called anti pattern
//this is not the right approach of writing test cases
//always try to write independent test cases

public class DependsOnMethodConcept {

	@Test
	public void loginTest() {
		System.out.println("login to app");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void appSearchTest() {
		//login
		System.out.println("searchTest");
	}
	
	@Test(dependsOnMethods = "appSearchTest")
	public void selectProductTest() {
		//login
		//search
		System.out.println("selectProductTest");
	}
	
	//CRUD - ADD/GET/Update/Delete
	
	//login-->Homepage-->search-->cart-->payment-->test
	//login-->Homepage-->search2-->cart-->payment-->test
}
