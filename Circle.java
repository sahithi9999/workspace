package shape1;

public class Circle extends Shape{
double radius;

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

public Circle(int shapeid, String shapename, double radius) {
	super(shapeid, shapename);
	this.radius = radius;
}

public Circle() {
	super();
	// TODO Auto-generated constructor stub
}
public double calculateradius()
{
	return 3.14*radius*radius;
}



@Override
public String toString() {
	return "Circle [radius=" + radius + ", shapeid=" + shapeid + ", shapename=" + shapename + "]";
}
	

	

}
