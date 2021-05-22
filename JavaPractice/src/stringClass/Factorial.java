package stringClass;

public class Factorial {
	
	public static void factorial(int n) {
		
	int fact=1;
	
	for(int i=1; i<=n; i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
} 
	public static void main(String[] args) {
		
		factorial(6);
		// TODO Auto-generated method stub

	}

}
