package emp1;

import java.util.Comparator;

class reg123 implements Comparator {
			public int compare(Object o1,Object o2) {
			// TODO Auto-generated method stub
			Marks1 m1=(Marks1)o1;
			Marks1 m2=(Marks1)o2;
			//Marks1 m3=(Marks1)o3;
			//Marks1 m4=(Marks1)o4;
			//Marks1 m5=(Marks1)o5;
			if(m1.regnum==m2.regnum)
				return 0;
				if(m1.regnum>m2.regnum)
				return 1;
				else
				return -1;		
		}
	}

