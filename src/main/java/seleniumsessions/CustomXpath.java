package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("www.amazon.com");
	//xpath: address of the element in the HTML DOM.
		//1. absolute xpath9index based xpath) -/html/body/div/div/div[2]/ul/li[4]/a
		
		//2. relative xpath or custom xpath: using attributes, using functions
		
		//formula for custom xpath:(using this page ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
		
		//starts with //htmltag[@attr='value']
		
		//1. //input[@name='username']
		//2. //input[@placeholder='Username']
		//3. //button[@type='submit']
		//4. //input[@name='username' and @placeholder='Username']
		//5. //input[@name='username' and @placeholder='Username' and @class='oxd-input oxd-input--active']
		//6. //input[ @class='oxd-input oxd-input--active']
		
		By e1 = By.xpath("//input[ @class='oxd-input oxd-input--active']");//valid
		By e2 = By.className("oxd-input");//valid
		By e3 = By.className("//input[ @class='oxd-input oxd-input--active']");//invalid(cannot use more than one class name here) 
		//input[@class and @name and @placeholder] 
		
		// xpaths for https://naveenautomationlabs.com/opencart/index.php?route=account/register
		
		//1.//input[@id='input-firstname']
		//2.//input[contains(@placeholder, 'Confirm')]
		//3. //input[contains(@placeholder, 'Confirm') and @name='confirm']
		//4. //input[contains(@placeholder, 'Confirm') and @name='confirm' and @type='password']
		//5. //input[contains(@placeholder, 'Password') and @name='password' and @type='password']
		//contains() function is used for long value and also for dynamic attributes
		
		//text() in xpath: using page (https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)
		
		//htmltag[text()='value']
		//    //h5[text()='Login']
		
		//text() with @attr:
		//htmltag[text()='value' and @attr='value']
		//a[text()='Login' and @class='list-group-item']
		
		//text() with contains() and @attrib
		//a[contains(text(),'Forgotten') and @class='list-group-item']
		
		//index/position in xpath: using capture group concept
		// (//input[@class='form-control'])[1]
		// (//input[@class='form-control'])[last()]---will show the last index of capture group
		
		//www.amazon.com xpath of footer last element "help"
		//  ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
		
		//parent to child:
		// parent/direct child
		// parent//indirect child
		
		//select[@id='Form_getForm_Country']/option (using / for direct child)
		
		//div[@class='footer-main']//a (using // for grand child)
		//form//input[@id='username']
		
		//from child to immediate parent (backward traversing in xpath):
		
		//input[@id='username']/../../../..(using /..)
		//input[@id='username']/parent::div/parent::div/parent::div/parent::form (using keyword /parent::tagName)
		
		//from child to ancestor(grandparent)
		//option[contains(text(),'Country')]/ancestor::div
		//text() doesn't take space in the corners so we can use contains.
		
		//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div		
		//a[text()='Amazon Science']/ancestor::ul/parent::div/div
		//a[text()='Amazon Science']/parent::li/parent::ul/parent::div/div
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
	
	}

}
