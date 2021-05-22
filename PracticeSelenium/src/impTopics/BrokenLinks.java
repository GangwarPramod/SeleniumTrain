package impTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
			
			SoftAssert a= new SoftAssert();
			
			for(WebElement link:links) 
			{
				String url=link.getAttribute("href");
				HttpURLConnection conn=  (HttpURLConnection) new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				int resCode=conn.getResponseCode();
				System.out.println(resCode);
				a.assertTrue(resCode<400, "The Link with Text"+link.getText()+ "is Broken with"+resCode+"response code.");
				//we can use soft assertion and also we can manage  following if loop if we use above step
				/*if(resCode>400) 
				{
					Assert.assertTrue(false);//if we use this assertion it will stop the test execution 
					//thats why these assertion called as hard assertion 
				}
				*/
			}
			a.assertAll();
		
		// TODO Auto-generated method stub

	}

}
