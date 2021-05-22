package impTopics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Motivational Books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C://ScreenShot.png"));
		//if you put path in C folder it will give ecepetion i.e AcessDeniedException so take another drictory
		FileUtils.copyFile(src, new File("D://ScreenShot.png"));
	}
	

}
