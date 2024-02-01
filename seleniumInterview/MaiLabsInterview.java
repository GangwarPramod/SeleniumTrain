package seleniumInterview;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/*Interview Question Related to
1. Write TakeScreentshot for failed case
2. write code to check if dropdown can be multiselect.
3. Write Waits how to use them
4. write code if one dropdown has no from 1 to 100 and we have to select only odd in multiselect
5. How to use reporting i.e Extent Report.



 */
public class MaiLabsInterview {
    public static void main(String[]args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("user.dir"));

    }


}
