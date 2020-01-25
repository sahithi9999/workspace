package MethodOverloading;
 abstract class auto1
 {
	 String modelno;
	abstract String show ( String modelno);
 }
 
 class air_auto extends auto1 implements run
 {
	 String show(String modelno)
	 {
		 return modelno;
	 }
 }
 interface run
 {
	 int maxrun=100;
 }
 
 class aeroplane extends auto1 implements fly
 {
	 String show(String modelno)
	 {
		 return modelno;
	 }
 }
 interface fly
 {
	 int maxrun=90;
 }

 class ship extends auto1 implements swim
 {
	 String show(String modelno)
	 {
		 return modelno;
	 }
 }
 interface swim
 {
	 int maxrun=50;
 }
 
public  class Auto
{
	public static void main(String args[]) {
		air_auto a=new air_auto();
		aeroplane a1=new aeroplane();
		ship s=new ship();
		System.out.println(a.show("a123"));
		System.out.println(run.maxrun);
		System.out.println(a1.show("t123"));
		System.out.println(fly.maxrun);
		System.out.println(s.show("s123"));
		System.out.println(swim.maxrun);
	}
}

