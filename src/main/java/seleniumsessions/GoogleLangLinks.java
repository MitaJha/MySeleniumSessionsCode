package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

    static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(4000);
//	List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//	// this xpath is for google india with language links
//	System.out.println("total lang links="+ langLinks.size());
//	for(WebElement e : langLinks) {
//		String text = e.getText();
//	System.out.println(text);
//	}		
		
//		List<WebElement> footerLinks =  driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']//a"));
//		System.out.println("total footer links = " + footerLinks.size());
//		for(WebElement e : footerLinks) {
//			String text = e.getText();
//		System.out.println(text);
//		if(text.equals("Amazon Science")) {
//			e.click();
//			break;
		By footerLinks = By.xpath("//div[@class='navFooterLinkCol navAccessibility']//a");
		
		clickOnElement(footerLinks,"Careers");
}
			
		

	public static void clickOnElement(By locator, String linkText ){
	
	List<WebElement> footerLinks =  driver.findElements(locator );
	System.out.println("total footer links = " + footerLinks.size());
	for(WebElement e : footerLinks) {
		String text = e.getText();
	System.out.println(text);
	if(text.equals(linkText)) {
		e.click();
		break;
	}
	}
	}
}
