package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {

	static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By reg_header = By.tagName("h1");
		By forgotPw = By.linkText("Forgotten Password");
//		System.out.println(doElementGetText(reg_header));
//		System.out.println(doElementGetText(forgotPw));
	
//		boolean flag = driver.findElement(reg_header).isDisplayed();
//		System.out.println(flag);
	
		//System.out.println(checkElementDisplayed(reg_header));
		
		if(checkElementDisplayed(reg_header)) {
			System.out.println("registerHeader is displayed");
			String regHeader = doElementGetText(reg_header);
			if (regHeader.contains("Register")) {
				System.out.println("Text is correct");
			}
			else {
					System.out.println("Incorrect Text");
				}
			}
			
		}
	
	
	public static boolean checkElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	

	public static String doElementGetText(By locator) {
		String eleText =  getElement(locator).getText();
		System.out.println("Element text=== " + eleText);
		return eleText;
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
