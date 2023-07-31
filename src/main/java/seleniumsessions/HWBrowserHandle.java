package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWBrowserHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);				
		
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
		twEle.click();
		fbEle.click();
		ytEle.click();
		liEle.click();


		Set<String> handles = driver.getWindowHandles();		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		String twWindowId = it.next();
		String fbWindowId = it.next();
		String ytWindowId = it.next();
		String liWindowId = it.next();		
		
		driver.switchTo().window(twWindowId);
		System.out.println("window url: " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);

		
		driver.switchTo().window(fbWindowId);
		System.out.println("window url: " + driver.getCurrentUrl());
	    driver.close();
		driver.switchTo().window(parentWindowId);
		
		driver.switchTo().window(ytWindowId);
		System.out.println("window url: " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		driver.switchTo().window(liWindowId);
		System.out.println("window url: " + driver.getCurrentUrl());
		driver.close();		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent window url: " + driver.getCurrentUrl());
		//driver.close();


		
		
		
	}

}
