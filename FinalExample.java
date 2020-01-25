package MethodOverloading;
 class A
 {
 static final double pi=3.14;
	void display()
	{
		System.out.println("Class A");
	}
}
   class B extends A
   {
	   @Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}
   }

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.pi);

	}

}
