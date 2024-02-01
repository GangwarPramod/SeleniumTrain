package testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic2 {
	@Test(groups= {"smoke"})
	public void demo3()
	{
		System.out.println("Kumar");
	}
   @BeforeTest
   public void prerequiesit()
   {
	   System.out.println("Hey, I will execute first");
   }
   
   @AfterTest
   public void postrequiesit()
   {
	   System.out.println("Hey, I will execute last");
   }
   
   @AfterSuite
   public void postsuite()
   {
	   System.out.println("Hey, I will execute at the end");
   }
}
