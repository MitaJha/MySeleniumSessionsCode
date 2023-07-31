package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSessionConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// enter the url:
		driver.get("https://www.google.com");

		// get the title:
		String title = driver.getTitle();
		System.out.println("actual title: " + title);

		// driver.quit();
		// session ID will same for all the driver
		// session ID will be NULL after quit

		driver.close();
		// after close SID will be same but it is invalid and will not run the program
		// after that
		// now we need to call the driver again and this time SID is new

		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle()); // NoSuchSessionException
	}

}
