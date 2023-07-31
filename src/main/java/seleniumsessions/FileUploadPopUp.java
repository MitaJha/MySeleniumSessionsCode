package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
	//type = file
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\mitaj\\OneDrive\\Desktop\\urls.txt");
	//adding file from your system
		
		//what Id type-file is not available?
		//1. ask your dev team to add this attribute
		//2. Robot class ---- not recommended ----only for windows.   wont work for linux, mac, docker, cloud, jenskin, headless, grid
		//3. autoIt -----not recommended ----only for windows.   wont work for linux, mac, docker, cloud, jenskin, headless, grid
		//4. sikul----not recommended ---coz its based image
	
	

}
}