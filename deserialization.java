package emp1;
import java.io.*;

public class deserialization {
	int id;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\f.txt"));  
		  Student s=(Student)in.readObject();  
		  //printing the data of the serialized object  
		  System.out.println(s.sid+" "+s.slocation);  
		  //closing the stream  
		  in.close();  
		  }catch(Exception e){System.out.println(e);} 

	}

}
