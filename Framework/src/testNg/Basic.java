package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic {
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
    @Test(groups= {"smoke"})
    public void newdemo() {
	  System.out.println("Pramod");
  }
    @BeforeMethod
    public void Beforemethodevery() {
	  System.out.println("Jai Shri Ram");
  }
    
    @AfterMethod
    public void Aftermethodevery() {
	  System.out.println("Har Har Mahadev");
  }
}
