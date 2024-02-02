package pkg_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Combination {

	public static void main(String[] args) {
		// Create a list of strings and list of integers
		List<String> stringList = new ArrayList<>();
		stringList.add("White");
		stringList.add("Yellow");
		stringList.add("Black");
		Set<Integer> integerSet = Set.of(21, 50, 51);
		// Create a Map with keys from the List and values from the Set
		Map<String, Integer> combinedMap = new HashMap<>();

		for (String color : stringList) {
			combinedMap.put(color, integerSet.iterator().next());
		}

		System.out.println("CombinedMap:" + combinedMap);

	}

}
