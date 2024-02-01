package seleniumWaits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ImplicitWait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		String[] cartItem = { "Cucumber", "Mushroom", "Potato", "Almonds", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		
		addItem(driver,cartItem);
		//or we can create obj of the class and access the method 
		//then we have to Remove the Static from addItem method below
		//SeleniumWaits SW= new SeleniumWaits();
		//SW.addItem(driver, cartItem);
	}
	
	public static void addItem(WebDriver driver,String[] cartItem) throws InterruptedException
	{
		int j = 0;
		WebDriverWait w=new WebDriverWait(driver, Duration.ofDays(5));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i <= products.size(); i++) {
			String[] productName = products.get(i).getText().split("-");

			String formatedName = productName[0].trim();

			List itemListNeeded = Arrays.asList(cartItem);

			if (itemListNeeded.contains(formatedName)) {

				j++;
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				// it is not working as text getting changed and index is moving thats why wrong
				// product are getting
				// selected in cart, so avoid using dynamic text xpath
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == cartItem.length) {
					break;
				}
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("////input[@class='promoCode']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        //ExplicitWait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		//driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		//System.out.println(driver.findElement(By.xpath("//b[contains(text(),'No. of Items')]")).getText());
		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		WebElement drpdwn= driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select newdrpdwn= new Select(drpdwn);
		newdrpdwn.selectByIndex(5);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[contains(.,'Proceed')]")).click();
	}



}

