package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefWithFindElements {

			static WebDriver driver;

		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			List<WebElement> footerLinks = driver.findElements(By.cssSelector("footer a"));//v1
			System.out.println(footerLinks.size());
			
			for(int i=0; i<footerLinks.size(); i++) {
				footerLinks.get(i).click();//v1
				driver.navigate().back();//v2
				footerLinks = driver.findElements(By.cssSelector("footer a"));//reinitializing the footerLink
			
			}
			
	}

}
