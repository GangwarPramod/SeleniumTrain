package stringClass;

public class StringClass {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("Pramod");
		String s2= new String("Pramod");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1=new StringBuffer("Kumar");
		StringBuffer sb2=new StringBuffer("Kumar");

		StringBuilder sb3=new StringBuilder("Kumar1");
		StringBuilder sb4=new StringBuilder("Kumar1");

		System.out.println(sb3==sb4);
		System.out.println(sb3.equals(sb4));
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}

}
