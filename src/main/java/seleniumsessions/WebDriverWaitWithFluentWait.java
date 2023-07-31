package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentWait {
	static WebDriver driver;

	public static void main(String[] args) {

		//WebDriverWait---->FluentWait---->Wait (until)
							//until(){}
							//own methods
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
//		
//		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait
//				.pollingEvery(Duration.ofSeconds(2))
//				  .ignoring(NoSuchElementException.class)
//				    .withMessage("---timeOut is done....Element is not found..." +email)
//				      .until(ExpectedConditions.presenceOfElementLocated(email))
//				        .sendKeys("Testing");
			
		waitForElementAndEnterValue(email, 10, 2, "Naveen");
	
	}
	
	public static void waitForElementAndEnterValue(By locator, int timeOut, int pollingTime, String value) {
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait
		.pollingEvery(Duration.ofSeconds(pollingTime))
		  .ignoring(NoSuchElementException.class)
		    .withMessage("---timeOut is done....Element is not found..." +locator)
		      .until(ExpectedConditions.presenceOfElementLocated(locator))
		        .sendKeys(value);
	}
	
	public static void waitForElementAndClick(By locator, int timeOut, int pollingTime ) {
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait
		.pollingEvery(Duration.ofSeconds(pollingTime))
		  .ignoring(NoSuchElementException.class)
		    .withMessage("---timeOut is done....Element is not found..." +locator)
		      .until(ExpectedConditions.presenceOfElementLocated(locator))
		        .click();
	}
	
}
