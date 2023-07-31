package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		//Headless means no user interface, no browser, behind the scene,black screen
		//faster than normal, used when we are using Linux OS, Jenkins, Docker
		//might not work for complex HTML, navigation or responsive testing
		//Responsive testing means testing on different screen size
		
		
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);//deprecated means not in use
		co.addArguments("--headless");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");

//		Deprecated. Use addArguments(String). 
//		Recommended to use '--headless=chrome' as argument for browsers v94-108. 
//		Recommended to use '--headless=new' as argument for browsers v109+.
//		Example: `addArguments("--headless=new")`.

		
		//WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver(fo);
		//WebDriver driver = new EdgeDriver(eo);

		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		//edge -- headless
		//safari -- no support for headless
		
		
		
		
		
		
		
		
		
		
		
	}

}
