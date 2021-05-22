package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChBox1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		List<WebElement> chboxtotal=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(chboxtotal.size());
		

}
}
