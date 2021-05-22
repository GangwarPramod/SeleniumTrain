package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		// driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		// driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Pramod Gangwar");

		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

		// driver.switchTo().alert().dismiss();
		// driver.switchTo().alert().accept();

	}
}
