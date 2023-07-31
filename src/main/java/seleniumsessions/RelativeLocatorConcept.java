package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocatorConcept {

	public static void main(String[] args) {

		// selenium 4.x feature:
		// above
		// left<----ele---->right
		// below

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele = driver.findElement(By.linkText("Sudbury, Canada"));
		
		//right of element:
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		//left of element:
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
			//above of element:
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

		//below of element:
				String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
				System.out.println(belowCity);
				
				//near of ele:
				
			String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
				System.out.println(nearCity);
				
				List<WebElement> belowElements = driver.findElements(with(By.xpath("//div[@id= 'most_pollutedCitiesRank']/p")).below(ele));
				 System.out.println(belowElements.size());
				
				for(WebElement e : belowElements) {
					System.out.println(e.getText());
				}
				
					

//		driver.get("https://selectorshub.com/xpath-practice-page/");
//		
//		WebElement emp = driver.findElement(By.linkText("Joe.Root"));
//		
//		String rightIndex = driver.findElement(with(By.tagName("td")).toRightOf(emp)).getText();
//		System.out.println(rightIndex);
//		
//		//leftOf 
//		driver.findElement(with(By.tagName("td")).toLeftOf(emp)).click();
//
//		String aboveEmp = driver.findElement(with(By.tagName("td")).above(emp)).getText();
//		System.out.println(aboveEmp);
//
//		String belowEmp = driver.findElement(with(By.tagName("td")).below(emp)).getText();
//		System.out.println(belowEmp);
		
		
		
		
				
	}

}
