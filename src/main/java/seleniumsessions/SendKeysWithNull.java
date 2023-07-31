package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {

	static WebDriver driver; 

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By first_name = By.id("input-firstname");
		//driver.findElement(first_name).sendKeys(null);  //IllegalArgumentException
		//driver.findElement(first_name).sendKeys("");
		driver.findElement(first_name).sendKeys(" ");
		//numeric values are not allowed in sendKeys, it can be used in string for "123".
		
		
		//chararcter sequence:
		String str = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Labs");
		
//		driver.findElement(first_name).sendKeys(str,sb,sf);
//		driver.findElement(first_name).sendKeys(str);
//		driver.findElement(first_name).sendKeys(sb);
//		driver.findElement(first_name).sendKeys(sf);
//		driver.findElement(first_name).sendKeys(str+sb+sf);
		driver.findElement(first_name).sendKeys(str+" "+sb+" "+sf);
	}

}
