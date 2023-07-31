package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();//w2
		
		Set<String> handles = driver.getWindowHandles();		
		//Set doesn't maintain order and doesn't contains duplicate value
		
		Iterator<String> it = handles.iterator();//it will pointing just above the parent windowId
		
		
		String parentWindowId = it.next();//moving iterator to next window(parent windowId)
		System.out.println("parent window Id: " + parentWindowId);
		
		String childWindowId = it.next(); //moving iterator to next window(child windowId)
		System.out.println("Child window Id: " + childWindowId);

		//switch work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " + driver.getCurrentUrl());
		
		//close the child window:
		driver.close();// driver is lost at this stage		
		
		//come back to parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " + driver.getCurrentUrl());

		driver.quit();
		
		
		
		
	}

}
