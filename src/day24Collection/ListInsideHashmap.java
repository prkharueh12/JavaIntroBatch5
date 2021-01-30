package day24Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ListInsideHashmap {

	public static void main(String[] args) {

		HashMap<String, String> row = new HashMap<String, String >();
		row.put("COUTNRY_ID", "BE");
		row.put("COUNTRY_NAME", "Belgium");
		row.put("REGION_ID", "1");
		
		HashMap<String, String> row2 = new HashMap<String, String >();
		row2.put("COUTNRY_ID", "CH");
		row2.put("COUNTRY_NAME", "Switzerland");
		row2.put("REGION_ID", "1");
		
//		row.put("UserName", "admin");
//		row.put("Password", "admin123");
		
		HashMap<String, String> row3 = new HashMap<String, String >();
		row3.put("COUTNRY_ID", "DE");
		row3.put("COUNTRY_NAME", "Germany");
		row3.put("REGION_ID", "1");
		
		HashMap<String, String> row4 = new HashMap<String, String >();
		row4.put("COUTNRY_ID", "DK");
		row4.put("COUNTRY_NAME", "Denmark");
		row4.put("REGION_ID", "1");
		
		HashMap<String, String> row5 = new HashMap<String, String >();
		row5.put("COUTNRY_ID", "FR");
		row5.put("COUNTRY_NAME", "France");
		row5.put("REGION_ID", "1");
		
		HashMap<String, String> row6 = new HashMap<String, String >();
		row6.put("COUTNRY_ID", "IT");
		row6.put("COUNTRY_NAME", "Italy");
		row6.put("REGION_ID", "1");
		
		HashMap<String, String> row7 = new HashMap<String, String >();
		row7.put("COUTNRY_ID", "NL");
		row7.put("COUNTRY_NAME", "Netherlands");
		row7.put("REGION_ID", "1");
		
		
		HashMap<String, String> row8 = new HashMap<String, String >();
		row8.put("COUTNRY_ID", "UK");
		row8.put("COUNTRY_NAME", "United Kingdom");
		row8.put("REGION_ID", "1");
		
		ArrayList<HashMap<String, String>> rows = new ArrayList<>();
		
		rows.add(row);
		rows.add(row2);
		rows.add(row3);
		rows.add(row4);
		rows.add(row5);
		rows.add(row6);
		rows.add(row7);
		rows.add(row8);
		
		for (int i = 0; i < rows.size(); i++) {
			
			Set set=rows.get(i).entrySet();//Converting to Set so that we can traverse  
			int rowNum = i+1 ;
			System.out.println("ROW#"+ rowNum);
		    Iterator itr=set.iterator();  
		    
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println("Key : "+entry.getKey()+" | Value: "+entry.getValue()); 
		}
	
}

}

	}


