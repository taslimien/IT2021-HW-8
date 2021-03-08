package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapHomeWork {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		numbers.put("a", 10);
		numbers.put("b", 20);
		numbers.put("c", 30);
		numbers.put("d", 40);
		numbers.put("e", 50);
		
		System.out.println(numbers.get("c"));
		System.out.println(numbers);
		
		

	}

}
