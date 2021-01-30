package day24Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTask {

	public static void main(String[] args) {
		HashMap<String, String> row = new HashMap<>();
		row.put("COUNTRY_ID","FR");
		row.put("COUNTRY_NAME","France");
		row.put("REGION_ID","1");
		row.put("UserName","admin");
		row.put("Password","admin123");
		//System.out.println(row.get("COUNTRY_NAME"));
		// sendKey(row.get("UserName"))
//		System.out.println(row.get("UserName"));
//		System.out.println(row.get("Password"));
		//Store the country names
		List<String> countries = new ArrayList<>();
		countries.add("BE");
		countries.add("CH");
		countries.add("DE");
		List<String> names = new ArrayList<>();
		names.add("Belgium");
		names.add("Switzerland");
		names.add("Germany");
		List<String> regions = new ArrayList<>();
		regions.add("1");
		regions.add("1");
		regions.add("1");
		int index = 0;
		for(int i = 0 ; i < countries.size(); i ++) {
			//System.out.println(countries.get(i));
			String currentElement = countries.get(i);
			if (currentElement.equals("CH")) {
				index = i;
			}
		}
		System.out.println("Country code = "+ countries.get(index));
		
		System.out.println("Country name = "+ names.get(index));
		
		System.out.println("Region code = "+ regions.get(index));

	}

}
