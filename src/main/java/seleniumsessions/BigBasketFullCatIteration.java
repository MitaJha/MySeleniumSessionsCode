package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketFullCatIteration {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		Thread.sleep(2000);

		WebElement mainCategory = driver.findElement(By.xpath("//a[@qa= 'categoryDD']"));

		Actions act = new Actions(driver);
		act.moveToElement(mainCategory).build().perform();
		Thread.sleep(2000);

		List<WebElement> level1List = driver.findElements(By.xpath("//ul[@id= 'navBarMegaNav']//a"));
		Thread.sleep(2000);

		for (WebElement e1 : level1List) {
			act.moveToElement(e1).build().perform();
			System.out.println(e1.getText());

			List<WebElement> level2List = driver.findElements(By.xpath("//ul[contains(@class, 'nav-pills')]//a"));
			Thread.sleep(2000);

			for (WebElement e2 : level2List) {
				act.moveToElement(e2).build().perform();
				System.out.println(e2.getText());

				List<WebElement> level3List = driver.findElements(By.xpath("//ul[@class= 'list-unstyled']//a"));
				Thread.sleep(2000);

				for (WebElement e3 : level3List) {
					act.moveToElement(e3).build().perform();
					System.out.println(e3.getText());

				}
			}
		}

	}
}