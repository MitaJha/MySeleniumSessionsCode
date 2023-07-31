package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocator {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// There are 8 locators in selenium.
		// 1. ID: Unique locator (attribute)
		// driver.findElement(By.id("selenium")).sendKeys("naveen@gmail.com");

		// 2. Name: can be duplicate (attribute)
		// driver.findElement(By.name("naveen")).sendKeys("naveen@gmail.com");

		// 3. Class name: can be duplicate and most of the time it is
		// duplicate.(attribute)
		// driver.findElement(By.className("form-control")).sendKeys("naveen");
		// its a bad practice to use class name because most of the time it is common
		// for all the elements.

		// 4. Xpath: not an attribute (it is the address of the element)

//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Mita");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Jha");
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("mita@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("9898456734");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("mita123");
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();

//		By fn_xpath = By.xpath("//*[@id=\"input-firstname\"]");
//		By ln_xpath = By.xpath("//*[@id=\"input-lastname\"]");
//		By email_xpath = By.xpath("//*[@id=\"input-email\"]");
//		By phone_xpath = By.xpath("//*[@id=\"input-telephone\"]");
//		By password_xpath = By.xpath("//*[@id=\"input-password\"]");
//		By privacyPolicy_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continue_xpath = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//
//		doSendKeys(fn_xpath, "mita");
//		doSendKeys(ln_xpath, "jha");
//		doSendKeys(email_xpath, "mita@gmail.com");
//		doSendKeys(phone_xpath, "9845453366");
//		doSendKeys(password_xpath, "mita123");
//		doClick(privacyPolicy_xpath);
//		doClick(continue_xpath);		

		
		//5. CSS Selector:
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("mita");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("jha");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9898353566");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		By fn_cssSelector = By.cssSelector("#input-firstname");
		By ln_cssSelector = By.cssSelector("#input-lastname");
		By email_cssSelector = By.cssSelector("#input-email");
		By phone_cssSelector = By.cssSelector("#input-telephone");
		By password_cssSelector = By.cssSelector("#input-password");
		By privacyPolicy_cssSelector = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By continue_cssSelector = By.cssSelector("#content > form > div > div > input.btn.btn-primary");

		doSendKeys(fn_cssSelector, "naveen");
		doSendKeys(ln_cssSelector, "automation");
		doSendKeys(email_cssSelector, "naveen@gmail.com");
		doSendKeys(phone_cssSelector, "7700557733");
		doSendKeys(password_cssSelector, "naveen@123");
		doClick(privacyPolicy_cssSelector);
		doClick(continue_cssSelector);
		

		
		
		
		
		
		//6. LinkText: only for links and the text of the link. Can be duplicate
		// html tag <a>, attribute(href), linktext
		//inpecting footer element (delivery information)

		//driver.findElement(By.linkText("Delivery Information")).click();

//		By deliveryInfo = By.linkText("Delivery Information");
//		doClick(deliveryInfo);
		
		//7. Partial LinkText: only for the partial part of lengthy text
		//it will click on the first text if there is duplicate text
		
		//8. TAG NAME: html tag (not an attribute)
		//driver.findElement(By.tagName("input")).sendKeys("naveen");
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
