package shape1;

public class rectangle extends Shape {
	int length;
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}

	int width;
	@Override
	public String toString() {
		return "rectangle [length=" + length + ", width=" + width + ", shapeid=" + shapeid + ", shapename=" + shapename
				+ "]";
	}

	
	public rectangle(int shapeid,String shapename,int length, int width) {
		super(shapeid,shapename);
		this.length = length;
		this.width = width;
	}

	public rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public int calculatearea()
	 {
		 return length*width;
	 }

}
