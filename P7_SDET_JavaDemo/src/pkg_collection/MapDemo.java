package pkg_collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("INDIA", 100);
		map.put("US", 101);
		map.put("AUS", 102);
		System.out.println(map.get("US"));// get value by key
		System.out.println(map.keySet());// derive set of keys
		System.out.println(map.values());// derive collection of values
		
//remove an element
		map.remove("AUS", 102);
		System.out.println((map));
	
		System.out.println("___________FOR EACH LOOP____________");
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + "--->" + entry.getValue());
	}

}
