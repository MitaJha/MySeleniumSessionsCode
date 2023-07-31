package seleniumsessions;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarauselHandling {
	
	static WebDriver driver;

	public static void main(String[] args) { 
		
		
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		
		
		
		String xpath = "//h2[text()='Trending deals in electronics']/../../following-sibling::div//div[@data-qa= 'product-name']";
		String next_xpath = "//h2[text()='Trending deals in electronics']/../../following-sibling::div//div[contains(@class, 'swiper-button-next')]";
		List<WebElement> prodList = driver.findElements(By.xpath(xpath));
	
		//Set<String> prodSet = new HashSet<String>();
		Set<String> prodSet = new TreeSet<String>();//getting list in order
		//Set<String> prodSet = new LinkedHashSet<String>();
		while(!driver.findElement(By.xpath(next_xpath)).getAttribute("class").contains("swiper-button-disabled")) {
			
			for(WebElement e : prodList) {
			String title = e.getAttribute("title");
			System.out.println(title);
			prodSet.add(title);;
			
			}
			
		//click on next
		driver.findElement(By.xpath(next_xpath)).click();
			
		}
		
		//iterate the prod set:
		for(String e : prodSet) {
		System.out.println(e);
		}
		
	}
	
}