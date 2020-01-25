interface Eatable {
	void eat();
}
class A {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eatable b=new Eatable() {

			@Override
			public void eat() {
				System.out.println("fruits");
			}// TODO Auto-generated method stub
			};
			b.eat();
			
		}

	}
