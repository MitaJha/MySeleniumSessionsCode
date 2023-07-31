package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeCocept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By forgotPw = By.linkText("Forgotten Password");
		By first_name = By.id("input-firstname");
		By logoImage = By.className("img-responsive");

//		String forgotPwhref = driver.findElement(forgotPw).getAttribute("href");
//		System.out.println(forgotPwhref);
//		
//		String forgotPwclass = driver.findElement(forgotPw).getAttribute("class");
//		System.out.println(forgotPwclass);
//		
//		
//		String fn_placeholder_val = driver.findElement(first_name).getAttribute("placeholder");
//		System.out.println(fn_placeholder_val);
//	
//		
//		String fn_type = driver.findElement(first_name).getAttribute("type");
//		System.out.println(fn_type);
//		
//		
//		String fn_class = driver.findElement(first_name).getAttribute("class");
//		System.out.println(fn_class);
//		
//		WebElement logo_ele = driver.findElement(logoImage);
//		String srcVal = logo_ele.getAttribute("src");
//		String titleVal = logo_ele.getAttribute("title");
//		String altVal = logo_ele.getAttribute("alt");
//		
//		System.out.println(srcVal);
//		System.out.println(titleVal);
//		System.out.println(altVal);

		String fn_placeholder_val = getElementAttribute(first_name, "placeholder");	
		String fn_type = getElementAttribute(first_name, "type");	
		String fn_class = getElementAttribute(first_name, "class");	
		
		System.out.println(fn_placeholder_val);
		System.out.println(fn_type);		
		System.out.println(fn_class);

		
		System.out.println("------");

		String forgotPwhref = getElementAttribute(forgotPw, "href");	
		String forgotPwclass = getElementAttribute(forgotPw, "class");	
		
		System.out.println(forgotPwhref);
		System.out.println(forgotPwclass);


		System.out.println("------");
		String srcVal = getElementAttribute(logoImage, "src");	
		String titleVal = getElementAttribute(logoImage, "title");	
		String altVal = getElementAttribute(logoImage, "alt");	

		System.out.println(srcVal);
		System.out.println(titleVal);
		System.out.println(altVal);

		
			}
	public static String getElementAttribute(By loactor, String atrName) {
		return getElement(loactor).getAttribute(atrName);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}

}
