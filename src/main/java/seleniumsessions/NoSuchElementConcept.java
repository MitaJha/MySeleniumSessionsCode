package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		

		By forgotPw = By.linkText("Forgotten Password12");
		try {
			driver.findElement(forgotPw).click();
		} catch (NoSuchElementException e) {
			System.out.println("getting element exception ... plz check your locator again");
			e.printStackTrace();
		}
		System.out.println(driver.getTitle());

	}
}