package hello;
import java.sql.*;
public class OracleCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
			Class.forName("com.mysql.jdbc.Driver");    
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","root");    
			Statement stmt=con.createStatement();    
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));    
			con.close();  
			}catch(Exception e){ System.out.println(e);}   
			}  
			}  


