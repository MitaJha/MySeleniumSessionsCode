package seleniumsessions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class LaunchBrowser {

	public static void main(String[] args) {

		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		
		//enter the url:
		driver.get("https://www.Google.com");// never use url without protocol
		
		//get the title:
		String title =   driver.getTitle();
		System.out.println("actual title: "+ title);
		
		// verify the title/actual vs expected result /chcekpoint /verification point
		if (title.equals("Google")){
			System.out.println("correct title");
		}
			else {
				System.out.println("in-correct title");

			}
		//automation testing ----> automation steps + checkpoint(act vs exp)(verification)
		driver.quit();
	
	}
	}


