package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		//WebDriverWait---->FluentWait---->Wait (until)
							//until(){}
							//own methods
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		
//		Wait<WebDriver>  wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(NoSuchElementException.class)
//				.withMessage("---timeOut is done....Element is not found..." +email);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("Testing");		
	
		waitForElementVisibleWithFluentWait(email, 10, 2).sendKeys("testing");
	
	}
	
	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver>  wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(Exception.class)
				.withMessage("---timeOut is done....Element is not found..." +locator);
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static WebElement waitForElementPresenceWithFluentWait(By locator, int timeOut, int pollingTime) {
		Wait<WebDriver>  wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.withMessage("---timeOut is done....Element is not found..." +locator);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static Alert waitForJSAlertWithFluentWait(int timeOut, int pollingTime) {
		Wait<WebDriver>  wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoAlertPresentException.class)
				.withMessage("---timeOut is done....alert is not found..." );
		
		return wait.until(ExpectedConditions.alertIsPresent());
	}
}
