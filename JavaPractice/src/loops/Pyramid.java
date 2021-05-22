package loops;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int i,j;
		for(i=0;i<4;i++)
		{
			//System.out.println(i);
			
			for(j=1;j<=4-i;j++)
			{
				//System.out.print(k);
				System.out.print("*");
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}

	}

}
