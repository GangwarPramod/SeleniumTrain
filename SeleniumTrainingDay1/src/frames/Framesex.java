package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://jqueryui.com/draggable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement driver2=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(driver2);
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
		
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();

	}

}
