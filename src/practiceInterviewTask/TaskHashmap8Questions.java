package practiceInterviewTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskHashmap8Questions {

	public static void main(String[] args) {
		 /*
	    Tasks:
	 1. write a program that can remove the duplicated characters from String and store them into variable
	     */
		
		String alpha = "abababa";
		// s
		String[] words = alpha.split("");
		
		Set<String> uAlpha = new HashSet<String>(); 
		
		for (String name : words) {
			uAlpha.add(name);
		}
		System.out.println("Q#1*************");
		System.out.println(uAlpha);
		
		
		/*
 2. write a program that can identify if two strings are build out of the same letters
	 		ex:
	 			str1 = "abababa";  //ab ==> ab
	 			str2 ="baba";     // ba ==> ab
	 			output: true 
	 			*/
		
		String	str1 = "abababa";  
		String	str2 ="baba";    
		System.out.println("Q#2*************");
		System.out.println(str1.contains("ab") && str2.contains("ab")); 
		
/*3. Write a Java program to test if a map contains a mapping for the specified key.
		The Original map: {Red=1, White=4, Blue=5, Black=3, Green=2}           
		1. Is key 'Green' exists?                                              
		yes! - 2                                                               
		2. Is key 'orange' exists?                                             
		no! */		
		
		
		HashMap<String, String> row1 = new HashMap<String, String >();
		row1.put("Red", "1");
		HashMap<String, String> row2 = new HashMap<String, String >();
		row2.put("White","4");
		HashMap<String, String> row3 = new HashMap<String, String >();
		row3.put("Blue","5");
		HashMap<String, String> row4 = new HashMap<String, String >();
		row4.put("Black","3");
		HashMap<String, String> row5 = new HashMap<String, String >();
		row5.put("Green","2");
		
		ArrayList<HashMap<String, String>> rows = new ArrayList<>();
		rows.add(row1);
		rows.add(row2);
		rows.add(row3);
		rows.add(row4);
		rows.add(row5);
		System.out.println("Q#3*************");
for (int i = 0; i < rows.size(); i++) {
			
			Set set=rows.get(i).entrySet();//Converting to Set so that we can traverse  
			
		    Iterator itr=set.iterator();  
		    
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();
		        
		        if (entry.getKey().equals("Green")) {
		        	System.out.println("The value: "+entry.getValue()); 
		        }
		        if (entry.getKey().equals("Orange")) {
		        	System.out.println("The value: "+entry.getValue());
		        } else {
		        	System.out.println("No!!");
		        }
		        //System.out.println("Key : "+entry.getKey()+" | Value: "+entry.getValue()); 
		}	
 }

//4. Write a Java program to count the number of key-value (size) mappings in a map.
System.out.println("Q#4*************");
	int countNum = rows.size();
	System.out.println("Number of key-value is: "+countNum);

	
	//5. Write a Java program to copy all of the mappings from the specified map to another map.
	HashMap<Integer, String> name1 = new HashMap<Integer, String >();
	HashMap<Integer, String> name2 = new HashMap<Integer, String >();
	name1.put(1, "Arron");
	name1.put(2, "Bissaka");
	name1.put(3, "Clevery");
	name1.put(4, "Darren");
	name1.put(5, "Kevin");
	
	System.out.println(name1.size());
	
	for (Integer chk : name1.keySet()) {
		String key = chk.toString();
		String value = name1.get(chk).toString();
		System.out.println(key +" "+value);
		
		name2.putAll(name1);
		
		System.out.println(name2);
		//6. Write a Java program to remove all the mappings from a map.
		name2.clear();
		System.out.println("After removing size: "+name2.size());
		
		
		
		// 7. Write a Java program to check whether a map contains key-value mappings (empty) or not.
		
		boolean yesEmp = true;
		boolean noEmp = false;
		
		if (name1.isEmpty()) {
			
			System.out.println(yesEmp);
		}else {
			System.out.println(noEmp);
		}
		
		
	}
	
	}
		

	}//end class 


