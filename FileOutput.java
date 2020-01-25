package emp1;
import java.io.FileOutputStream;  

public class FileOutput {

	public static void main(String[] args) {
		     
		           try{    
		             FileOutputStream fout=new FileOutputStream("D:\\output.txt");    
		             
		             String h="hello";
		             byte b[]=h.getBytes();
		             fout.write(b);    
		             fout.close();    
		             System.out.println("hello");    
		            }catch(Exception e){System.out.println(e);}    
		      }   
	}