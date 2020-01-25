class recursion 
{
 int factorial(int n)
{    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[])
{  
  int i,fact=1,a;  
  int n=4;  
  recursion f=new recursion();
   a=f.factorial(n);
   System.out.println(a);
 
}
      
}   