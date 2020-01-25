package Exception1;

public class Sum {
	static void display(int... num) {
		int s=0;
	for(int i:num) {
		s=s+i;
	}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1,4);
		display(2,3);
		display(3,2,1);
		
		

	}
}

