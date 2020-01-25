package shape1;

public class Shape {
	int shapeid;
	String shapename;
	@Override
	public String toString() {
		return "Shape [shapeid=" + shapeid + ", shapename=" + shapename + "]";
	}
	
	 public Shape(int shapeid, String shapename) {
		super();
		this.shapeid = shapeid;
		this.shapename = shapename;
	}
	
 public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getShapeid() {
		return shapeid;
	}

	public void setShapeid(int shapeid) {
		this.shapeid = shapeid;
	}

	public String getShapename() {
		return shapename;
	}

	public void setShapename(String shapename) {
		this.shapename = shapename;
	}

	
	
 
}
