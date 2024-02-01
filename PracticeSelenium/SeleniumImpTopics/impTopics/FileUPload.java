package SeleniumImpTopics.impTopics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUPload {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://www.naukri.com");
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it= handles.iterator();
		String parentWindow=it.next();
		/*String child1=it.next();
		driver.switchTo().window(child1).close();
		String child2=it.next();
		driver.switchTo().window(child2).close();
		String child3=it.next();
		driver.switchTo().window(child3).close();
		
		driver.switchTo().window(parentWindow);*/
		
		while(it.hasNext())
		{
			
		driver.switchTo().window(it.next());
		driver.close();
		driver.switchTo().window(parentWindow);
		
		}
	  driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("kumarpra369@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("krishna@123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(3000);
  // we can do file upload by three method 1. By SendKeys method//only if type =file in tag
		//2. AutoIT 
		//3. Remote Class
  //WebElement op= driver.findElement(By.xpath("//div[@class='topIcon user']/following-sibling::div"));
    Actions a= new Actions(driver);
    a.moveToElement(driver.findElement(By.xpath("//div[@class='topIcon user']/following-sibling::div"))).build().perform();
   
    driver.findElement(By.xpath("//a[normalize-space()='Edit Profile']")).click();
    driver.findElement(By.xpath("//div[@class='uploadBtn']")).click();
}}
