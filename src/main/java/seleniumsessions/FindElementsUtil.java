package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
//		List<WebElement> linkslist = driver.findElements(links);
//		List<WebElement> imageslist = driver.findElements(images);
		
//		System.out.println(getElementsCount(links));
//		System.out.println(getElementsCount(images));
		
		List<String> actlEleTextList =	getElementsTextList(links);
		System.out.println(actlEleTextList);
//		
//		if(actlEleTextList.contains("Privacy Policy")) {
//			System.out.println("Privacy Policy -- PASS");
//		}
//		if(actlEleTextList.contains("Terms & Conditions")) {
//			System.out.println("Terms & Conditions -- PASS");
//		}
//		if(actlEleTextList.contains("My Account")) {
//			System.out.println("My Account -- PASS");
//		}
		
		
}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e : eleList) {

			String text = e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);	
			}
		}
		return eleTextList;
	}
	
	
	public static int getElementsCount(By locator){
		return getElements(locator).size();
	}
	
	
	public static  List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
}

	//------------------


