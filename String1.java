
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		int a=s1.length();
		int b=s2.length();
		int c=0;
		for( int i=0;i<a;i++)
			{
			  if(s1.charAt(i)!=s2.charAt(i)) {
				  c++;
			}
		}
		if(c==0)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		
		

	}

}