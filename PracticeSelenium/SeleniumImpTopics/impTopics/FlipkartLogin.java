package SeleniumImpTopics.impTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FlipkartLogin {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    driver.get("https://www.flipkart.com/");
	   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9673876393");
			
		// TODO Auto-generated method stub

	}

}
