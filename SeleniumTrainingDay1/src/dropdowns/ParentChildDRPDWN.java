package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildDRPDWN {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BHO']")).click();
	
		
		//driver.findElement(By.xpath("(//a[@value='IXJ'])[2]")).click();
		//indexing is not encouraged in coding
		/*we can use parent child method for this type of issues*/
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BHO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR' ] //a[@value='MAA']")).click();

}
	}

