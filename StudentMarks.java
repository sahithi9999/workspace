package emp1;
import java.util.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
	
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(new Marks1(105,50,80,80,"ramu"));
		al.add(new Marks1(104,90,10,30,"raju"));
		al.add(new Marks1(103,30,80,50,"john"));
		al.add(new Marks1(102,20,20,10,"rama"));
		Collections.sort(al,new reg123());
		Iterator itr=al.iterator();  
        while(itr.hasNext()){  
        Marks1 st=(Marks1)itr.next();  
        System.out.println(st.regnum+" "+st.sname);
	}
	    Collections.sort(al,new Student12());
		Iterator itr1=al.iterator();  
        while(itr1.hasNext()){  
        Marks1 st1=(Marks1)itr1.next();  
        System.out.println(st1.sname+" "+st1.regnum);
	}
	
}
}




