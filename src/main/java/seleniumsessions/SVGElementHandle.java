package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(4000);
		
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		List<WebElement> stateslist = 
				driver.findElements
				(By.xpath("//*[local-name()= 'svg' and @id= 'map-svg' ]//*[name()= 'g' and @id= 'regions']//*[name()= 'path']"));
		
		System.out.println(stateslist.size());
		Actions act = new Actions(driver);
		for(WebElement e : stateslist) {
			act.moveToElement(e).build().perform();
			Thread.sleep(400);
			String text = e.getAttribute("name");
			System.out.println(text);
			if(text.equals("Maine")) {
				e.click();break;
			}
		}
	}

}
