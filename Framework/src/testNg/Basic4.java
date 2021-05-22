package testNg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic4 {
	   @Test(groups= {"smoke"})
		public void carloanAPI()
		{
			System.out.println("MyCarLoanAPI");
		}
	   
		@Test(dataProvider="getData")
		public void MobileloanAPI(String username,String pass)
		{
			System.out.println("MyMObileLoanAPI");
			System.out.println(username);
			System.out.println(pass);
			
		}
		@Test(groups= {"smoke"})
		 @Parameters({"URL"})
		public void HouseLoanAPI(String URL)
		{
			System.out.println("MyHouseLoanAPI");
			System.out.println(URL);
		}
		@DataProvider
	   public Object[][] getData()
	{
		//1 user/pass with godd credit history
		   //2 user/pass with negative credit history
		   //3 user/pass with fradulent history
			Object [][] data=new Object [3][2];
			//Set 1
			data[0][0]= "FirstUser";
			data[0][1]= "FirstUserPass";
			//Set 2
			data[1][0]= "SecondUser";
			data[1][1]= "SecondUserPass";
			//Set 3
			data[2][0]= "ThirdUser";
			data[2][1]= "ThirdUserPass";
			
			return data;
	}
	}


