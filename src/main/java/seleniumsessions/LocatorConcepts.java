package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {
	static WebDriver driver ;

	public static void main(String[] args) {

		//create a webelement + perform actions(sendkeys, .click, gettext, isDisplays)
		 driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("mita.jha@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("mita123");
		
		//2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("mita@gmail.com");
//		password.sendKeys("mita123");
		
		//3. By Locator
//		By email_id = By.id("input-email");
//		By pw_id = By.id("input-password");
//		
//		WebElement emailId = driver.findElement(email_id);
//		WebElement password = driver.findElement(pw_id);
//
//		emailId.sendKeys("mita@gmail.com");
//		password.sendKeys("mita123");
//		
		//4. By locator with web element generic method:
//		By email_id = By.id("input-email");
//		By pw_id = By.id("input-password");	
//		
//		getElement( email_id).sendKeys("mita@gmail.com");
//		getElement( pw_id ).sendKeys("mita123");
		
		//5.By locator with web element and action generic method:
//		By email_id = By.id("input-email");
//		By pw_id = By.id("input-password");
//		
//		doSendKeys(email_id, "mita@gmail.com");
//		doSendKeys(pw_id, "mita123");
		
		//6.By locator with web element and action generic method in utility class:
		//login page
		By email_id = By.id("input-email");
		By pw_id = By.id("input-password");
		
		//Register page
		By first_name = By.id("input-firstname");
		By last_name = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");

		By pw = By.id("input-password");
		By confirm_pw = By.id("input-confirm");

		
		ElementUtil elemUtil = new ElementUtil(driver);
		elemUtil.doSendKeys(email_id, "mita@gmail.com");
		elemUtil.doSendKeys(pw_id, "mita123");
	
	
	
	
	
	
	
	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

}
	
		
	}
	
	


