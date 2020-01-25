package emp1;
import java.util.*;
import java.util.Map.Entry; 

public class MapExample {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(101, "john");
		map.put(102, "ram");
		map.put(105, "ramu");
		//System.out.println(map);
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		map.remove(101);
		Set set1=map.entrySet();
		Iterator itr1=set1.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry1=(Entry)itr1.next();
			System.out.println(entry1.getKey()+""+entry1.getValue());
		}

		// TODO Auto-generated method stub
		//map.remove(101);
		//System.out.println(map);

	}

}
