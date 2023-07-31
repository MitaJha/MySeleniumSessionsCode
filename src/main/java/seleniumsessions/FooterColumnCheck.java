package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterColumnCheck {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		Thread.sleep(5000);

//		String footerHeaderName = driver
//			.findElement
//				(By.xpath("//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
//					.getText();
//		System.out.println(footerHeaderName);

//		String footerHeaderName = driver
//				.findElement
//					(By.xpath("//a[text()='Careers']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
//						.getText();
//			System.out.println(footerHeaderName);

		System.out.println(getFooterHeaderTest("Press Center"));
		System.out.println(getFooterHeaderTest("Help"));
		System.out.println(getFooterHeaderTest("Amazon Visa"));
		System.out.println(getFooterHeaderTest("Host an Amazon Hub"));

		// a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol
		// navAccessibility']/div
		// a[text()='Amazon Science']/ancestor::ul/parent::div/div
		// a[text()='Amazon Science']/parent::li/parent::ul/parent::div/div

	}

	public static String getFooterHeaderTest(String footerText) {
		String footerHeaderName = driver.findElement(By.xpath(
				"//a[text()='" + footerText + "']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
				.getText();
		return footerHeaderName;
	}

}