package emp1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  
import java.util.stream.Stream;   
class Employee123{  
    int id;  
    String ename;  
    float salary;  
    public Employee123(int id, String ename, float salary) {  
        super();  
        this.id = id;  
        this.ename = ename;  
        this.salary = salary;  
    }  
}  


public class Lambda {

	public static void main(String[] args) {
		ArrayList<Employee123> list=new ArrayList<Employee123>();  
        list.add(new Employee123(1,"xyz",10000f));  
        list.add(new Employee123(6,"ramu",65000f));  
        list.add(new Employee123(3,"raju",25000f));  
        list.add(new Employee123(2,"john",15000f));  
        list.add(new Employee123(5,"ramya ",26000f));  
        list.add(new Employee123(4,"rama",19000f));  
		// TODO Auto-generated method stub
        //Collections.sort(list,(e1,e2)->{  
            //return e1.ename.compareTo(e2.ename);  
            //});  
            //for(Employee123 e:list){  
              //  System.out.println(e.id+" "+e.ename+" "+e.salary);  
            //}
        Stream<Employee123> filtered_data = list.stream().filter(e ->e.salary > 10000);  
        
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                Employee123 -> System.out.println(Employee123.ename+": "+Employee123.salary)  
        );  


	}

}
