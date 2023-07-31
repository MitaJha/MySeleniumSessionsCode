package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement userName = driver.findElement(By.id("input-email"));//DOM version1

		userName.sendKeys("mita@gmail.com");
		driver.navigate().refresh(); //v2
		userName = driver.findElement(By.id("input-email"));//v2
		userName.sendKeys("mita@gmail.com");

		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException
// 		We have to reintialize the Webelement each time when we get StaleElementReferenceException.		
//	stale element means WebElement Id get expired when we use back, forward or refresh the page.
	
	}

}
