package dropdowns;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {
	
	public static void main (String []arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yatra.com/");
		
	driver.findElement(By.id("BE_flight_origin_city")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='required_field cityPadRight ac_input origin_ac']")).sendKeys("New");
	//driver.findElement(By.xpath("(//p[@class='ac_airportname'])[5]")).click();
	//Thread.sleep(2000);
	/*driver.findElement(By.id("BE_flight_origin_city")).sendKeys("New");*/
	Thread.sleep(3000);
	List <WebElement> options=driver.findElements(By.xpath("(//p[@class='ac_airportname'])"));
	
	for(WebElement option:options) {
		
		if(option.getText().equalsIgnoreCase("New Orleans"))
		{
			option.click();
			break;
		}
	}
	}

}
