package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(4000);
		
		//document.querySelector("#userName").shadowRoot.querySelector("#app2").shadowRoot.querySelector("#pizza");
		String script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		//String script1 = "return document.querySelector(\"#glaf\")";
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//getting html element by converting it into WebElement
		
		WebElement pizza_ele = (WebElement) js.executeScript(script);
		pizza_ele.sendKeys("VegPizza");
		
//		WebElement destiny = (WebElement) js.executeScript(script1);
//		destiny.sendKeys("lucky");
		
	}

}
