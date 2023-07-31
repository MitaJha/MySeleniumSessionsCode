package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {
	static WebDriver driver;
	static Actions act;	
		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			act = new Actions(driver);
			driver.get("https://signature-generator.com/draw-signature/");
			WebElement canvas =driver.findElement(By.id("signature-pad"));
			Thread.sleep(5000);
			Action signature =  act.click(canvas)
					.moveToElement(canvas, 2, -8)
					.clickAndHold(canvas)
					.moveToElement(canvas, -100, -50)
					.moveByOffset(20, 50)
					.moveByOffset(5, 3)
					.release(canvas)
					.build();
			signature.perform();

}
}