class A
{ 
    static int count=0;
    A()
    {
    count++;
    }
}
class B
{
    int b=5;
    public static void main(String args[])
    {
     int a=10;
     A a1=new A();
     A a2=new A();
     B b1=new B();
     System.out.println(A.count);
     System.out.println(a);
     System.out.println(b1.b);
     }
}
 
