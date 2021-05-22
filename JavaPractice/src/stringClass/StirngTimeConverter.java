package stringClass;

public class StirngTimeConverter {
	
	
	public static String timeConvertor(int num)
	{
		int hours=num/60;
		int minutes=num%60;
		//System.out.println(hours+":"+minutes);
		return hours+":"+minutes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 timeConvertor(126);
	}

}
