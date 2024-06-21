package may28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String args[]) {
	Map<String,Integer>hm=new HashMap<String,Integer>();
	hm.put("Suresh",100);
	hm.put("Naresh",101);
	hm.put("Ramesh", 109);
	hm.put("Kamlesh", 107);
	System.out.println(hm);
	System.out.println(hm.keySet());
	
	System.out.println(hm.values());
	Set<Entry<String,Integer>> entries=hm.entrySet();
	for(Entry<String,Integer> temp:entries) {
		System.out.println(temp.getKey()+"------->"+temp.getValue());
	
		
	}
	Collection<Integer> values=hm.values();
	System.out.println(values);
	
}}
