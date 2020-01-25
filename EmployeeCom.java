package emp1;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	 public int empid;
	 public String ename;
	 public int esalary;
public	Employee(int empid,String ename,int esalary)
{
	this.empid=empid;
	this.ename=ename;
	this.esalary=esalary;
}
@Override
public int compareTo(Employee e) {
	// TODO Auto-generated method stub
	return this.empid-e.empid;
	
}
}


public class EmployeeCom {


	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101,"john",3000));
		al.add(new Employee(102,"raju",3006));
		al.add(new Employee(106,"ram",3009));
		al.add(new Employee(108,"abc",2900));
		Collections.sort(al);
		for(Employee e1:al)
			System.out.println(e1.ename + e1.empid);
	}

}
