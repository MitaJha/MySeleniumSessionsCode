package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		//Alert---JS popUp/Modal Dialog:
		//1.alert  2.prompt alert  3.confirm
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1alert:
//		driver.findElement(By.xpath("//button[text()= 'Click for JS Alert']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
		//alert.dismiss();//NoAlertPresentException: no such alert
		  
		//confirm:
//		driver.findElement(By.xpath("//button[text()= 'Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
		
		//prompt:
		driver.findElement(By.xpath("//button[text()= 'Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.sendKeys("Automation");
		alert.accept();
		Thread.sleep(2000);
		String mesg = driver.findElement(By.id("result")).getText();
		System.out.println(mesg);//return(You entered: Automation)
		
		String actlText = mesg.split(":")[1].trim();
		System.out.println(actlText);
	}

}
