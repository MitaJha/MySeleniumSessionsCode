package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoScoreTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-world-test-championship-2021-2023-1268315/australia-vs-india-final-1358412/full-scorecard");
		Thread.sleep(4000);
		//span[text()='Shubhan Gill']/ancestor::td/following-sibling::td/span
	
//	String wkTakerName = driver.findElement(By.xpath("//span[text()='Shubman Gill']/ancestor::td/following-sibling::td/span")).getText();
//	System.out.println(wkTakerName);
	
	System.out.println(getWkTakerName("David Warner"));
	System.out.println(getWkTakerName("Steven Smith"));
	System.out.println(getPlayerScore("David Warner"));

	}
	
	public static String getWkTakerName(String batsmanName) {
		return  driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td/span")).getText();
	}
	
	
	public static String getPlayerScore(String batsmanName) {
		return  driver.findElement(By.xpath("//span[contains(text(),'"+batsmanName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]")).getText();
	
	
	}	}

