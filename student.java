class Student
{
int sid;
String sname;
String sbranch;
int sfees;
void setstudent(int id,String name,String branch,int fees)
{
sid=id;
sname=name;
sbranch=branch;
sfees=fees;
}
void getstudent()
{
System.out.println("id"+sid+"name"+sname+"branch"+sbranch+"fees"+sfees);
}
public static void main(String args[])
{
Student s=new Student();
s.setstudent(101,"ramu","cse",20000);
s.getstudent();
}
}

