package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//imp wait is also called global wait
		//it applicable for all the Web Elements
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username123")).sendKeys("admin");
		//login page(wait is 10 sec)
		//e1 --10sec
		//e2 --10sec
		//e3 --10sec
		//e4 --10sec
		 
		//home page (changing wait from 10 sec to 20)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// now new global wait is 20 sec 
		//he1
		//he2
		//he3
		//logout 
		// again login (wait will still 20 sec)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//now the wait is 10 sec untill we change it or we use driver.quit();
		
		// implicitly wait wont work for non web elements: title, url, alert
		
	}

}
