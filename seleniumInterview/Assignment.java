package seleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Assignment {
    public static void main(String []args) throws InterruptedException {
//
//ChromeOptions options=new ChromeOptions();
//options.addArguments("--user-Agent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
//
////
        ChromeOptions options =new ChromeOptions();
        options.setAcceptInsecureCerts(true);
//          WebDriver driver= new FirefoxDriver();
            WebDriver driver=new ChromeDriver(options);


            driver.get("https://github.com/login");
           WebElement github= driver.findElement(By.xpath("//input[@id='login_field']"));
          github.sendKeys("kumarpra369@gmail.com");
          WebElement pwd =driver.findElement(By.xpath("//input[@id='password']"));

          pwd.sendKeys("Advika@321123");

         driver.findElement(By.xpath("//input[@name='commit']")).click();



//          WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
            driver.get("https://dashboard.100ms.live/login");

          driver.manage().window().maximize();
          driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//button[1]")).click();







//

//         WebElement ele =driver.findElement(By.cssSelector("[name='email']"));
//         wait.until(ExpectedConditions.elementToBeClickable(ele));
//         ele.click();
//         ele.sendKeys("kumarpra369@gmail.com");
//         Thread.sleep(2000);
//         WebElement password = driver.findElement(By.xpath("//div[@class='form-group']//input[@id='password']"));
//        password.click();
//        password.sendKeys("Mahakal@321");
//
//        Thread.sleep(50000);
//
////        Thread.sleep(5000);
////        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
////
////        WebElement ele2=  driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
////        wait.until((ExpectedConditions.elementToBeClickable(ele2)));
////        Thread.sleep(10000);
////        ele2.click();
////        driver.switchTo().defaultContent();
//
//        WebElement ele3 =driver.findElement(By.xpath("//form/div[5]/button"));
//        Wait<WebDriver> waitFluent =
//                new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
//                        .pollingEvery(Duration.ofMillis(300))
//                        .ignoring(ElementNotInteractableException.class);
//
//        waitFluent.until(
//                d -> {
//                    ele3.click();
//                    return true;
//                });
//
//
//     Thread.sleep(5000);
//
//        WebElement createTemplate=driver.findElement(By.xpath("//div[@class='hms-ui-c-dhzjXW hms-ui-c-dhzjXW-knmidH-justify-between hms-ui-c-dhzjXW-jroWjL-align-center']//button[@class='hms-ui-c-XwnTY hms-ui-c-XwnTY-kUuGdv-variant-primary hms-ui-c-XwnTY-iuKECt-css']"));
//       wait.until(ExpectedConditions.elementToBeClickable(createTemplate));
//        createTemplate.click();
//
//          WebElement videoConfrencing=driver.findElement(By.xpath("//div[@class='hms-ui-c-PJLV hms-ui-c-PJLV-ihZBADG-css']/div[3]"));
//         videoConfrencing.click();
//         Thread.sleep(1000);
//         WebElement configure =driver.findElement(By.xpath("//button[@class='hms-ui-c-XwnTY hms-ui-c-XwnTY-kUuGdv-variant-primary hms-ui-c-XwnTY-iidqxxJ-css']"));
//        configure.click();
//
//
//        WebElement experience =driver.findElement(By.xpath("//button[@class='hms-ui-c-XwnTY hms-ui-c-XwnTY-kUuGdv-variant-primary hms-ui-c-XwnTY-iidqxxJ-css']"));
//        wait.until(ExpectedConditions.elementToBeClickable(experience));
//        experience.click();
//
//        String meetingUrl=driver.findElement(By.tagName("a")).getText();
//        System.out.println(meetingUrl);
//


    }}