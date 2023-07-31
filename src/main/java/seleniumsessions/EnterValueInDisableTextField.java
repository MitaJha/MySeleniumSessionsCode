package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValueInDisableTextField {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		By password = By.id("pass");

		boolean flag = driver.findElement(password).isEnabled();
		System.out.println(flag);
		
		boolean flag1 = driver.findElement(password).isDisplayed();
		System.out.println(flag1);
		
		String disable_val = driver.findElement(password).getAttribute("disabled");
		System.out.println(disable_val);
		
		
		//driver.findElement(password).sendKeys("test@123");
		//ElementNotIntractableException
	}
	
	public static boolean checkElementDisabled(By locator) {
		String disabledValue = getElement(locator).getAttribute("disabled");
		if(disabledValue.equals("true")) {
			return true;
		}
		return false;
	}
		
	
	
	public static WebElement getElement(By locator) {
	return driver.findElement(locator);

}
}