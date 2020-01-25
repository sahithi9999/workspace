class Employee

{
 int empid;
 String ename;
 int esalary;
    public Employee()
    {
      int empid=0;
      String ename="0";
      int esalary=1;
    }
    public Employee(int empid,String ename,int esalary)
    {
      this.empid=empid;
      this.ename=ename;
      this.esalary=esalary;
    }

    void setEmployee(int id,String name,int salary)
    {
      empid=id;
      ename=name;
      esalary=salary;
    }
    void getEmployee()
    {
     System.out.println(" "+empid+""+ename+""+esalary);
    }
    void calculatesal()
    {
     System.out.println(esalary+1000);
    }
}
class EmployeeMain
{
  public static void main(String args[])
  {
    Employee e=new Employee(102,"john",4000);
    //e.setEmployee(101,"john",4000);
    e.getEmployee();
    e.calculatesal();
}
}
 
     
     