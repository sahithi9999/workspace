package Exception1;
import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		    LocalDate date = LocalDate.now();  
		    LocalDate yesterday = date.minusDays(1);  
		    LocalDate tomorrow = date.plusDays(1);  
		    System.out.println("Today date: "+date);  
		    System.out.println("Yesterday date: "+yesterday);  
		    System.out.println("Tommorow date: "+tomorrow); 

	}

}
