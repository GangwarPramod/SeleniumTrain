package src.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\DriverCh\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement staticdropdown= driver.findElement(By.xpath("//select[@id= 'ctl00_mainContent_DropDownListCurrency']"));
		
	    Select dropdawn= new Select(staticdropdown);
		boolean flag =dropdawn.isMultiple();
		System.out.println(flag);
	    dropdawn.selectByIndex(2);
        System.out.println(dropdawn.getFirstSelectedOption().getText());
        dropdawn.selectByVisibleText("AED");
	}

}
