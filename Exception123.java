public class Exception123{
public static void main(String args[])
{
try 
{ 
    int x = 0; 
    int y = 5 / x; 
} 
catch (ArithmeticException e) 
{
    System.out.println("ArithmeticException"); 
} 
catch (Exception ae) 
{
    System.out.println("  Exception"); 
} 
System.out.println("finished");
}
}
