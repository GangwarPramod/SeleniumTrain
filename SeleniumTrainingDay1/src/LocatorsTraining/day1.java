package LocatorsTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DriverCh\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://yatra.com");
		driver.findElement(By.xpath("//div[@class='trip-type mor-option']/ul/li[2]")).click();
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
		driver.findElement(By.xpath("//div[@class='ac_results origin_ac']/ul/div/div/div/li[4]")).click();
		

		
	}

}
