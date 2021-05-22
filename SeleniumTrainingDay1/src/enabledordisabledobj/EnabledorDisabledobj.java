package enabledordisabledobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledorDisabledobj {
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//Here is enable resulted in true which is not correct so we can handle this situation in following ways
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}else 
		{
			Assert.assertFalse(false);
		}
			
		
		

}
	}
