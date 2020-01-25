package MethodOverloading;
class Addition
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		System.out.println(a.add(1,2));
		System.out.println(a.add(1.2,1));
		System.out.println(a.add(1, 1.2));

	}

}
