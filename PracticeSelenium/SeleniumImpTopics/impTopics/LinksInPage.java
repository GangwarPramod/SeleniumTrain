package SeleniumImpTopics.impTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer= driver.findElement(By.id("navFooter"));//limiting the webddriver scope
		System.out.println(footer.findElements(By.tagName("a")).size());
		//click on each link of a column
		WebElement columndr=driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[1]//ul[1]"));
		System.out.println(columndr.findElements(By.tagName("a")).size());
		int linkCount=columndr.findElements(By.tagName("a")).size();
		for(int i=1;i<linkCount;i++)
		{
			String clickOnLink= Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndr.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
		}
//Get title from all the opened window
		Set <String> window=driver.getWindowHandles();
	    Iterator<String> it=window.iterator();
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
	}

}
