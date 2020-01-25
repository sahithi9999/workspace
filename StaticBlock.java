class StaticBlock
{
  static int a;
  static
  {
   a=10;
   System.out.println("static block is called"+a);
  }
 static void setA(int a)
  {
   a=56;
   System.out.println("static method is called"+a);
   }
   public static void main(String args[])
   {
    System.out.println("main method is called");
    setA(10);
    }
}

