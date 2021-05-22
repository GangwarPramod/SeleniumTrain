package additionalimptopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] cartItem = { "Cucumber", "Mushroom", "Potato", "Almonds", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		int j = 0;

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
		Thread.sleep(4000);
		// driver.findElement(By.xpath("////input[@class='promoCode']")).click();
		// driver.findElement(By.xpath("//input[@placeholder='Enter promocode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}

}
