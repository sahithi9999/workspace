
public class local {
	void local1()
	{
		int value=50;
		class local2
		{
			void msg()
			{
		System.out.println(value);
			}
		}
		local2 l2=new local2();
		l2.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		local l =new local();
		l.local1();

	}

}
