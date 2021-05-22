import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\DriverCh\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		

	}

}
