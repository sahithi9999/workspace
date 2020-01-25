package emp1;
import java.util.*;   
class employee12 {
	int empid;
	String ename;
	int esal;
employee12(int empid,String ename,int esal) {
	this.empid=empid;
	this.ename=ename;
	this.esal=esal;
}
	
}

public class Map2 {

	public static void main(String[] args) {
		Map<Integer,employee12> m =new HashMap<Integer,employee12>();
        employee12 e3=new employee12(101,"john",3000);
        employee12 e1=new employee12(103,"ram",3007);
        employee12 e2=new employee12(106,"ramu",3008);
        m.put(1,e1);
        m.put(2,e2);
        m.put(3,e3);
        for(Map.Entry<Integer, employee12> entry:m.entrySet()){    
            int key=entry.getKey();  
            employee12 b=entry.getValue();  
            System.out.println(key+" Details:");  
            System.out.println(b.empid+" "+b.ename+" "+b.esal);   
        }    

        
        
		// TODO Auto-generated method stub

	}

}
