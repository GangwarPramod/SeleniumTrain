package testNg;

import org.testng.annotations.Test;

public class Basic3 {
	
	//helper attributes enabled,dependsOnMethods,timeout
	@Test(enabled=false)
	public void carloan()
	{
		System.out.println("MyCarLoan");
	}
	@Test
	public void Mobileloan()
	{
		System.out.println("MyMObileLoan");
	}
	@Test(dependsOnMethods={"Mobileloan"})
	public void HouseLoan()
	{
		System.out.println("MyHouseLoan");
	}
}
