package impTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCookies {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteCookie(null);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionKey");
		//scenario = delete the session cookies and verify it redirect on loginpage/homepage
		//steps
		//first delete the sesstion cookies
		//click on any link 
		//verify that on reload it is landing on home/loging page
		
	}

}
