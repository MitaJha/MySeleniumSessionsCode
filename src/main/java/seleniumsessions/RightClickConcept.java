package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		//right click options are called context menu
		
//		WebElement rtClick = driver.findElement(By.xpath("//span[text() ='right click me']"));
//		Thread.sleep(1000);
//		Actions act = new Actions(driver);
//		act.contextClick(rtClick).perform();
//	
//		driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-cut')]")).click();
//		driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-copy')]")).click();
//		driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-edit')]")).click();
//		driver.findElement(By.xpath("//li[contains(@class,'context-menu-icon-quit')]")).click();
//		Thread.sleep(1000);

//		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
//		System.out.println(optionsList.size());
//		for(WebElement e : optionsList ) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
		
		By contextMenuLocator = By.xpath("//span[text() ='right click me']");
		selectRightClickOption(contextMenuLocator,"Copy");
	}	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void selectRightClickOption(By contextMenuLocator, String optionValue) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(contextMenuLocator)).perform();
		By optionLocator = By.xpath("//*[text()='"+optionValue+"']");  //* will ignore the tagname
		getElement(optionLocator).click();
		
	}
	
	
}
