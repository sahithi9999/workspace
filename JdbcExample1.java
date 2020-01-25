
import java.sql.*;
import java.sql.PreparedStatement;

public class JdbcExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
        PreparedStatement stmt=con.prepareStatement("insert into regions values(?,?)");
        stmt.setInt(1,101);
        stmt.setString(2,"phillipines");
        int i=stmt.executeUpdate();
        System.out.println(i + "records inserted");
        con.close();
		}catch(Exception e) {
			System.out.println(e);}
		}
        



}
