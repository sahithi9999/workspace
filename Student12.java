package emp1;
import java.util.*;  
import java.util.Comparator;
class Student12 implements Comparator{
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Marks1 s1=(Marks1)o1;
			Marks1 s2=(Marks1)o2;
			
			return s1.sname.compareTo(s2.sname);

		}

}
