package Exception1;
 class A extends Exception{
	 A(String b){
	 super(b);
	 }
	
}
class Age{  
	  
	   static void validate(int age)throws A{  
	     if(age<18)  
	      throw new A("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(10);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	   
	  }  
	}
