package impTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities ch= new DesiredCapabilities();
		ch.acceptInsecureCerts(); 
		//or we can do also like that
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions op=new ChromeOptions();
		op.merge(ch);
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(op);
		

	}

}
