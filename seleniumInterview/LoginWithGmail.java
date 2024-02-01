package seleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginWithGmail {


public static void main(String[]args){
    ChromeOptions options=new ChromeOptions();
            options.setAcceptInsecureCerts(true);
    WebDriver driver=new ChromeDriver(options);

    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
    driver.get("https://dashboard.100ms.live/login");

driver.findElement(By.xpath("//div[contains(@class,'google-button w-full rounded-md items-center relative')]//button[contains(@class,'flex-row flex items-center w-full')]")).click();
driver.findElement(By.xpath("//input[@id='identifierId']"))
        .sendKeys("1234");


driver.findElement(By.xpath("(//div[@class='VfPpkd-Jh9lGc'])[2]")).click();



}



}
