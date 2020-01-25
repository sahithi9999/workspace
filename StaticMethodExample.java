class StaticMethodExample
{
  static int num=10;
  int c; 

  void setStatic(int a)
  {
     num=a;
     System.out.println(num);
   }
void setNonstatic()
{
  System.out.println(num);
}

 public static void main(String args[])
{
 StaticMethodExample s=new StaticMethodExample();
 s.setNonstatic();
}

}
