package src.naveenPractice;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlandIPadd {
	
	public static void main(String []args) {
		
		try {
			System.out.println(new URL("https://www.bewakoof.com/").equals(new URL ("http://184.50.166.125")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
