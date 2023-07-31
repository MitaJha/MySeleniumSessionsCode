package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(brUtil.getPageTiltle());

		By first_name = By.id("input-firstname");
		By last_name = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");

		By pw = By.id("input-password");
		By confirm_pw = By.id("input-confirm");

		ElementUtil elemUtil = new ElementUtil(driver);
		
		elemUtil.doSendKeys(first_name, "Mita");
		elemUtil.doSendKeys(last_name, "Jha");
		elemUtil.doSendKeys(email, "mita@gamail.com");
		elemUtil.doSendKeys(telephone, "9936458900");
		elemUtil.doSendKeys(pw, "mita123");
		elemUtil.doSendKeys(confirm_pw, "mita123");

	}

}
