package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();//w2
		
		Set<String> handles = driver.getWindowHandles();	
		
		List<String> handleList = new ArrayList<String>(handles);
		
		String parentWindowId = handleList.get(0);
		String childWindowId = handleList.get(1);

		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " + driver.getCurrentUrl());
		//driver.quit();
	}

}
