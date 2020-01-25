package shape1;
class Car
{
	int carNumber;
	int run()
	{
		return 60;
	}
}
class FordCar extends Car
{
	int run()
	{
		return super.run()+40;
	}
	
}


public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FordCar f=new FordCar();
		//f.run();
		System.out.println(f.run());

	}

}
