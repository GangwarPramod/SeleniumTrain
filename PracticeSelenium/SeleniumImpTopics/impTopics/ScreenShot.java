package SeleniumImpTopics.impTopics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement ele= driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("nav-search-submit-button")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("user.dir"));
		//if you put path in C folder it will give ecepetion i.e AcessDeniedException so take another drictory
		//FileUtils.copyFile(src, new File("D://ScreenShot.png"));

	}
	
}
