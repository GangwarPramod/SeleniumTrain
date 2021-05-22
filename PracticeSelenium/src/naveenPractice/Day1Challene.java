package naveenPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Day1Challene {
	public static void main(String []args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		//List <WebElement> items= driver.findElements(By.xpath("//div[contains(@class,'swiper-slide')]"));
		//System.out.println(items.size());
		System.out.println(driver.findElement(By.id("productBox-N36487191A")).getText());
	}
	

}
