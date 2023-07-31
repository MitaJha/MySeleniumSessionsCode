package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1. valid but not recommended as it has only 2 methods FindElement() and
		// FindElements()
		// SearchContext sc = new ChromeDriver();

		// 2. valid and recommended
		// WebDriver driver = new ChromeDriver();

		// 3. valid and recommended
		 RemoteWebDriver driver = new ChromeDriver();
		 
		// 4. valid but not recommended
		// ChromiumDriver driver = new ChromeDriver();

		// 5. valid and recommended -- used for remote execution/sel grid/cloud/docker -
		// aws/browser stack/LT
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);

		// 6. valid but not recommended
		// SearchContext sc = new RemoteWebDriver(remoteAddress, capabilities);

		// FOR EDGE:

		// SearchContext sc = new EdgeDriver();
		// WebDriver driver = new EdgeDriver();
		// RemoteWebDriver driver = new EdgeDriver();
		// ChromiumDriver driver = new EdgeDriver();

		// FOR FIREFOX:

		// SearchContext sc = new FirefoxDriver();
		// WebDriver driver = new FirefoxDriver();
		// RemoteWebDriver driver = new FirefoxDriver();

	}

}
