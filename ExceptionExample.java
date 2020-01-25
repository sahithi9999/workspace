package Exception1;

import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0;
		try {
			System.out.println("a/b");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}
		
		
		System.out.println("executed");

	}

}
