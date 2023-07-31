package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selfPractice {

	public static void main(String[] args) throws InterruptedException {
    BrowserUtil  brUtil = new BrowserUtil();
    
	WebDriver driver = brUtil.launchBrowser("chrome");
   
	ElementUtil elUtil = new ElementUtil(driver);

    brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    Thread.sleep(4000);
   elUtil.clickOnElement(By.xpath("//div[@class='list-group']/a"), "Forgotten Password");
	
  
	
	
	
	
	
	
	}

}
