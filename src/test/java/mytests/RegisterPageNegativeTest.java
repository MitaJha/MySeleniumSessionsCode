package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageNegativeTest  extends BaseTest{
	
//WebDriver driver;
//	
//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	}
	
	@DataProvider //DataProvider will return 2D ObjectArrayy [][]
	public Object[][] registerTestData() {
		return new  Object[][] {
			{"Ani", "Kr", "taaaaaaa@gmail.com", "1233345555", "123334@123444", "123334@123444"},
			{"tom", "ss", "toma@gmail.com", "1233340000", "4@123abc", "4@123abc"},
			{"perry", "lome", "pr@gmail.com", "11111000555", "titw@123444", "titw@123444"},
			{"kate", "will", "katewill@gmail.com", "8884947636", "abc@123", "abc@123"},
		};
	}	
	
	@Test(dataProvider = "registerTestData")   //mapping by providing method name
	public void loginWithWrongDataTest(String firstName, String lastName, String email, String telephone, String password,String confirm) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(confirm);		
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		String errorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();

		System.out.println(errorMsg);
		Assert.assertTrue(errorMsg.contains("Warning: You must agree to the Privacy Policy!"));
	
	
	}
	
	
}

	
	
	
	
	
	
	
	
	


