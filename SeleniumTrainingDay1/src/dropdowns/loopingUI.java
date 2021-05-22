package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loopingUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DriverCh\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://yatra.com");
		WebElement dd=driver.findElement(By.xpath("//span[@class='txt-ellipses flight_passengerBox travellerPaxBox']"));
		dd.click();
		//driver.findElement(By.xpath("//span[@class='txt-ellipses flight_passengerBox travellerPaxBox']")).click();
		Thread.sleep(2000);
		int i=0;
		while(i<5)
		{
		driver.findElement(By.xpath("//div[@data-flightagegroup='child']//span[@class='ddSpinnerPlus']")).click();
		i++;
	   }
System.out.println(dd.getText());
}
}
