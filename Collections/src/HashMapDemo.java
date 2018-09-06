import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);

		/*Set<Map.Entry<String,Integer>> s=hm.entrySet();
		
		for(Map.Entry<String ,Integer> me:s)
		{
			System.out.print("Key = "+me.getKey()+" : ");
			System.out.println("Value = "+me.getValue());
		}*/
		
		//----------------------------------------------
		
		Set set=hm.entrySet();
		Iterator itr= set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Integer> me=(Map.Entry<String, Integer>)itr.next();
			System.out.print("Key = "+me.getKey()+" : ");
			System.out.println("Value = "+me.getValue());
		}
		
	}

}
