package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		By images = By.tagName("img");

		List<WebElement> imageslist = driver.findElements(images);
		int imageCount = imageslist.size();

		// System.out.println("total images= " +imageslist.size());

		System.out.println("total images= " + imageCount);

		for (WebElement e : imageslist) {
			String srcVal = e.getAttribute("src");
			String altVal = e.getAttribute("alt");
			System.out.println(srcVal + ":" + altVal);
		}

	}
}