package stringClass;

public class FannyStringOcuurence {
	
	public static void removeCharacter(String s, char c)
	{
		int j,count=0, n=s.length();
		char []t=s.toCharArray();
		for(int i=j=0;i<n;i++)
		{
			if(t[i]!=c) {
				t[j++]=t[i];
			}
				else 
					count++;
			}
		while(count>0) 
		{
			t[j++]='\0';
			count--;
		}
		System.out.println(t);
		}
		
	public static void main(String[] args) 
	{
		
		String s="KumarPramodGangwar";
		removeCharacter(s,'G');
		removeCharacter(s,'m');
		
		
		
		// TODO Auto-generated method stub

	}

}
