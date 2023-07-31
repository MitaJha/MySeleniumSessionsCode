package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.amazon.com");

		// inject JS script/code using selenium-Java with JavascriptExecutor
		// RWD--->WD
		// RWD--->JSE-----executeScript()

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		//js.executeScript("alert('this is my alert')");
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);

		// JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		// System.out.println(jsUtil.getTitleByJS());

		// jsUtil.generateJSAlert("Hello World");

//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Calls & Voice")) {
//			System.out.println("PASS - Calls & Voice");
//			
//			jsUtil.scrollPageDown();
//			Thread.sleep(2000);
//			jsUtil.scrollPageUp();
//			Thread.sleep(2000);
//			jsUtil.scrollPageDown("900");
//			
		// WebElement element = driver.findElement(By.xpath("//h2[text()= 'Deals on
		// Amazon Devices']"));
//			jsUtil.scrollIntoView(element);
		// scrollTo() is used or vertical scrolling and scrollBy() is used for
		// horizontal scrolling.
		// jsUtil.zoomChromeEdgeSafari("400.0%");

		// jsUtil.drawBorder(element);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		WebElement fn = driver.findElement(By.id("input-firstname"));
		WebElement ln = driver.findElement(By.id("input-lastname"));
		jsUtil.flash(fn);
		jsUtil.flash(ln);
	}
}
