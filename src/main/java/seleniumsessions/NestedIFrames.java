package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(2000);
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("1st crush");
		Thread.sleep(2000);

		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("recent crush");
		Thread.sleep(2000);

		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("destiny crush");
		Thread.sleep(2000);

		driver.switchTo().parentFrame();//switching to current crush
			
		driver.findElement(By.id("jex")).sendKeys(" newcrush");// updating current cruch
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();// switching to first crush
		driver.findElement(By.id("inp_val")).sendKeys(" Update 1st crush");//update first crush
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();// now on main page
		
		driver.switchTo().defaultContent();//will jump directly to main page
		
		String h3Text = driver.findElement(By.tagName("h3")).getText();
		System.out.println(h3Text);
		
//		driver.findElement(By.id("glaf")).sendKeys(" change my destiny ");
//		Thread.sleep(2000); //this will not work because frame3 is not a parent frame 
		
		//first crush is parent of current crush and current crush is parent of destiny 
		//switchTo().parent frame() will move 1 step ahead only[(destiny - current crush) not like (destiny - first crush)]
		//it will work like f1-->f2-->f3 and f3-->f2-->f1 (frwd and bckwd)
		//parent frame is a feature of sel 4.x
		
	}

}
