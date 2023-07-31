package seleniumsessions;

public class Test {

	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.launchBrowser(browserName);
		brUtil.enterUrl("https://www.amazon.com");
		
		String actTitle = brUtil.getPageTiltle();
		
		System.out.println(actTitle);
		if (actTitle.contains("Amazon")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		 String actUrl = brUtil.getPageUrl();
		
		 System.out.println(actUrl);
			if (actUrl.contains("amazon")) {
				System.out.println("correct url");
			}
			else {
				System.out.println("incorrect url");
			}
		brUtil.closeBrowser();
	
	
	}

}
