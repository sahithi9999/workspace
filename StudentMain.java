package emp1;
import java.util.*;  

public class StudentMain {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		// TODO Auto-generated method stub
        al.add(new Student(101,"chennai"));
        al.add(new Student(105,"hyderabad"));
        al.add(new Student(102,"banglore"));
        al.add(new Student(103,"pune"));
        Collections.sort(al,new StudentLocation());
        Iterator itr=al.iterator();  
        while(itr.hasNext()){  
        Student st=(Student)itr.next();  
        System.out.println(st.sid+""+st.slocation);
	}
        Collections.sort(al,new StudentId());
        for(Object e:al)
        	System.out.println(e);
        	
        //Iterator itr2=al.iterator();  
        //while(itr2.hasNext()){  
        //Student st=(Student)itr2.next(); 
        //System.out.println(st.sid+""+st.slocation);
        }


}
