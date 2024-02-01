package seleniumInterview;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LamdaTest {


        public static String username = "pramodkumar";
        public static String accesskey = "YOUR ACCESSKEY";
        public static RemoteWebDriver driver = null;
        public static String gridURL = "@hub.lambdatest.com/wd/hub";

        public static void setUp() throws Exception {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("version", "95.0");
            capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get the any available one
            capabilities.setCapability("build", "CaptchaInSelenium");
            capabilities.setCapability("name", "TCaptchaInSeleniumSample");
            try {
                driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
            } catch (MalformedURLException e) {
                System.out.println("Invalid grid URL");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            driver.get("https://old.reddit.com/login");


        }



        public static void clickOnRecaptchaCheckBoxInSelenium() {
            try {
                System.out.println("Let's start with fresh registration");
                WebElement username=driver.findElement(By.xpath("//input[@name='user']"));
                username.sendKeys("some_username_200");

                WebElement password=driver.findElement(By.xpath("//input[@name='passwd']"));
                password.sendKeys("SuperStrongP@ssw0rd");

                WebElement verifyPassword=driver.findElement(By.xpath("//input[@name='passwd2']"));
                verifyPassword.sendKeys("SuperStrongP@ssw0rd");

                WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
                email.sendKeys("xyz@gmail.com");

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
                wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

                wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();

                System.out.println("Clicked the checkbox");

            } catch (Exception e) {

            }

        }

        public static void closeBrowser() {
            driver.close();
            Reporter.log("Closing the browser", true);

        }
        public static void main(String[]args) throws Exception {
            setUp();
            clickOnRecaptchaCheckBoxInSelenium();
            closeBrowser();


        }

    }

