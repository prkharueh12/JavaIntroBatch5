package day24Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapCollection {

	public static void main(String[] args) {
		
		Map<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(1, "Beenish");
		data.put(2, "Kanin");
		data.put(3, "Park");
		data.put(4, "Charlee");
		data.put(5, "Gift");
		data.put(6, "Ilham");
		
		
		System.out.println(data.get(6));
		
		
//		for (int i = 0; i < data.size(); i++) {
//			
//			System.out.println(data.get(i));
//			
//		}
		
		Set set=data.entrySet();//Converting to Set so that we can traverse  
		
	    Iterator itr=set.iterator();  
	    
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println("Key : "+entry.getKey()+" | Value: "+entry.getValue());  
	    }  

		
		
		
	}

}


