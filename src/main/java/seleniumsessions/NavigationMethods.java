package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

		// navigate.to(String url)
//		driver.navigate().to("https://www.amazon.com");
//		System.out.println(driver.getTitle());

		// get() and navigate().to() both does the same thing but navigate().to() is
		// calling get() internally.
		// only difference is we can use .back() and .forward() wit get() but we can use
		// them wit navigate()

		driver.navigate().to(new URL("https://www.amazon.com"));
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
	}

}
