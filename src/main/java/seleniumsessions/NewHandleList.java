package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewHandleList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String parentWindowId = driver.getWindowHandle();
		
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));

		twEle.click();
		Thread.sleep(1000);
		fbEle.click();
		Thread.sleep(1000);
		ytEle.click();
		Thread.sleep(1000);
		liEle.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handleList = new ArrayList<String>(handles);
		
		String parentWindowId1 = handleList.get(0);
		String child1 = handleList.get(1);
		String child2 = handleList.get(2);
		String child3 = handleList.get(3);
		String child4 = handleList.get(4);

		Iterator<String> it = handles.iterator();
//		
//		while(it.hasNext()) {
//			String windowId = it.next();
//			driver.switchTo().window(windowId);
//			System.out.println(driver.getCurrentUrl());
//			Thread.sleep(2000);
//			if(!windowId.equals(parentWindowId)) {
//			driver.close();
//			}		
//	}
		
//		for(String e : handles) {
//			String child1 = it.next();	
//		}
//		
//		driver.switchTo().window(parentWindowId);
//		System.out.println("parent window url: " + driver.getCurrentUrl());

}
		
		
		
	}


