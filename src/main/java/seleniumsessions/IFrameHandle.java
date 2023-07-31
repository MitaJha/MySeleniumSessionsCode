package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	//page
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
	Thread.sleep(2000);
	//page element
	driver.findElement(By.xpath("//img[@title= 'Vehicle-Registration-Forms-and-Examples']")).click();
	Thread.sleep(2000);	
	
	//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));

		//frame elements
		
//		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Register");
//		driver.findElement(By.xpath("//div[@id= 'q2']")).sendKeys("01-01-2023");
//		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("USA");
//		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("2023-11-12");
//		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("Planning to register");

		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Stuti");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Tarun");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("3233");
		driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Dr");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Atl");
		driver.findElement(By.id("RESULT_RadioButton-13")).click();
		WebElement state = driver.findElement(By.xpath("//select[@id= 'RESULT_RadioButton-13']//option[text()= 'Georgia']"));
		state.click();
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("30044");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("7867867878");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("mita@gmail.com");
		Thread.sleep(2000);	

		driver.findElement(By.id("FSsubmit")).click();
		
		//coming back to main page
		driver.switchTo().defaultContent();

		//page element
		String info = driver.findElement(By.id("tooltip")).getText();
		System.out.println(info);
		
		
		
	}

}
