package MethodOverloading;
class Engine
{
	int engineno,age;
	String fueltype;
	public int getEngineno() {
		return engineno;
	}

	public void setEngineno(int engineno) {
		this.engineno = engineno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public Engine(int engineno, int age, String fueltype) {
		super();
		this.engineno = engineno;
		this.age = age;
		this.fueltype = fueltype;
	}
	
	@Override
	public String toString() {
		return "Engine [engineno=" + engineno + ", age=" + age + ", fueltype=" + fueltype + "]";
	}
	
	
}
class car
{
	Engine e;
	@Override
	public String toString() {
		return "car [e=" + e + ", carno=" + carno + ", carname=" + carname + "]";
	}


	int carno;
	String carname;
	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public int getCarno() {
		return carno;
	}

	public void setCarno(int carno) {
		this.carno = carno;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	
	public car(Engine e, int carno, String carname) {
		super();
		this.e = e;
		this.carno = carno;
		this.carname = carname;
	}
	
	
	
}
public class HasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car(new Engine(101,20,"abc") ,1234, "ford");
		System.out.println(c);

	}

}
