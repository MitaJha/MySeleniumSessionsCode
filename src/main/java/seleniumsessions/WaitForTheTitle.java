package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTheTitle {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		// wait for right title:

//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	if(wait.until(ExpectedConditions.titleContains("Free CRM"))) {
//		System.out.println(driver.getTitle());
//	}

		waitForTheTiltleContains("Free CRM", 3);

	}

//	public static boolean waitForTheTiltleContains(String titleFraction, int timeOut) {
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//		return wait.until(ExpectedConditions.titleContains(titleFraction));

	// or

	public static String waitForTheTiltleContains(String titleFraction, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			} else {
				System.out.println(titleFraction + " title value is not present...");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(titleFraction + " title value is not present...");
			return null;
		}
	}

	
	public static String waitForTiltleIs(String titleValue, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleIs(titleValue))) {
				return driver.getTitle();
			} else {
				System.out.println(titleValue + " title value is not present...");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(titleValue + " title value is not present...");
			return null;
		}
	}
	
	public static String waitForUrlContains(String urlFraction, int timeOut) {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	try {
		if (wait.until(ExpectedConditions.titleContains(urlFraction))) {
			return driver.getCurrentUrl();
		} else {
			System.out.println(urlFraction + " url value is not present...");
			return null;
		}
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(urlFraction + " url value is not present...");
		return null;
	}
}

	public static String waitForUrlToBe(String urlValue, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(urlValue))) {
				return driver.getCurrentUrl();
			} else {
				System.out.println(urlValue + " url value is not present...");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(urlValue + " url value is not present...");
			return null;
		}
	}
	
	
}
