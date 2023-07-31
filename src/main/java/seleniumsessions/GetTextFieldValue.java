package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
	static WebDriver driver; 

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By first_name = By.id("input-firstname");
		driver.findElement(first_name).sendKeys("NaveenAutomationLabs");
		
		String fn_value = driver.findElement(first_name).getAttribute("value");
		System.out.println(fn_value);
		
		
		
	}

}
