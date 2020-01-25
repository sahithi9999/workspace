package shape1;

public class Shapemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle(1,"rectangle",2,3);
		square s=new square(1,"rectangle",2);
		Circle c=new Circle(1,"rectangle",2);
		System.out.println(r.calculatearea());
		System.out.println(s.calculateArea());
		System.out.println(c.calculateradius());
		System.out.println(r);
		System.out.println(s);
		System.out.println(c);

	}

}
