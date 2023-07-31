package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChaining {
	static WebDriver driver;
	static Actions act;	
		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			act = new Actions(driver);
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

			WebElement fn = driver.findElement(By.id("input-firstname"));
			
			act.sendKeys(fn, "Mita")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("automation")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("automation@gmail.com")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("7898989898")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("automation@123")
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys("automation@123")
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys(Keys.TAB)
			.pause(1000)
			.sendKeys(Keys.SPACE)
			.build().perform();
			
}
	
}