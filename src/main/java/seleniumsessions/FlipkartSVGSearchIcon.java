package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGSearchIcon {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("macbook pro m1");
		Actions act = new Actions(driver);

		act.moveToElement
		(driver.findElement(By.xpath("//*[local-name()= 'svg']//*[name()= 'path']"))).click().build().perform();
	
	
	
	
	}
}
