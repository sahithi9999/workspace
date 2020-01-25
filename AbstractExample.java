package MethodOverloading;
 abstract class AbstractClass
{
	 abstract int add(int a,int b);
	 void show()
	 {
		 System.out.println("this is abstract class");
	 }
	
}
 class Abstract1 extends AbstractClass
 {

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	 
 }

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass a=new Abstract1();
		System.out.println(a.add(1,2));
	}
}
