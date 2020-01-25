package shape1;

public class square extends Shape {
	int length;

	
	@Override
	public String toString() {
		return "square [length=" + length + ", shapeid=" + shapeid + ", shapename=" + shapename + "]";
	}


	public square(int shapeid, String shapename, int length) {
		super(shapeid, shapename);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	
	public square() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int calculateArea() {
		return length*length;
	}
	

}
