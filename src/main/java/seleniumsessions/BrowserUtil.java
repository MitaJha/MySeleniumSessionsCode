package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import customException.MyException1;

/**
 * 
 * @author mitaj
 *
 */
public class BrowserUtil {

	private WebDriver driver;
/**
 * valid users are chrome/firefox/edge.
 * @param browserName
 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser name is " + browserName);
		if(browserName == null) {
			System.out.println("browser can not be null");
			throw new MyException1("NOTNULLBROWSER");
		}

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the correct browser name: " + browserName);
			throw new MyException1("NotValidBrowser"); 
		}
		return driver;
	}
	public void enterUrl(String url) {
		if(url.contains("http")) {
			driver.get(url);
		}
		else {
			throw new MyException1("url should have http"); 

		}
		
	}
	//method overloading
	public void enterUrl(URL url) {
		if(String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		}
		else {
			throw new MyException1("url should have http"); 

		}
		
	}
	public String getPageTiltle(){
		return driver.getTitle();
		}
	public String getPageUrl() {
		 return driver.getCurrentUrl();
	}
	public void closeBrowser() {
		driver.quit();
	}
	
}// advantage of this browser util is that it is reusable, we can use it for different application
//another advantage is handling the exceptions by throwing custom exceptions
//documentation is easy.