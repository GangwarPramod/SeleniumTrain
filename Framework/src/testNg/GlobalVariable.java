package testNg;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariable {
	
	public static void main (String []args) throws IOException {
		
		Properties prop =new Properties();
		FileInputStream fis=new FileInputStream("D:\\WorkspaceSelenium\\Framework\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("Url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos= new FileOutputStream("D:\\\\WorkspaceSelenium\\\\Framework\\\\src\\\\data.properties");
		prop.store(fos, null);
		
		
		
	}

}
