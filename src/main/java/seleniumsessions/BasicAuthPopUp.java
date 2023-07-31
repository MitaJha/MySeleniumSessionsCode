package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {
	public static void main(String[] args) throws InterruptedException {

		String username = "admin";
		String password = "admin";
				
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//we can handle non-Js alert by using username and password separated by :and ended with @ in our url.
		//cant use @ in username or password. 
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");

		//basic auth??
		//username:passsword---encoded String
		//BtoA("username:password")------.ECBNHGHHHJH%&*
		
		
		
}
}