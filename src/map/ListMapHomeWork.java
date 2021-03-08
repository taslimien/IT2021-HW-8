package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListMapHomeWork {

	public static void main(String[] args) {
		
		List<String> statesOfUSA = new ArrayList<String>();
		statesOfUSA.add("New York");
		statesOfUSA.add("New Jersey");
		statesOfUSA.add("Pennsylvania");
		statesOfUSA.add("Connecticut");
		statesOfUSA.add("Massachusetts");
		
		List<String> statesOfUK = new ArrayList<String>();
		statesOfUK.add("England");
		statesOfUK.add("Scotland");
		statesOfUK.add("Manchester");
		statesOfUK.add("Wales");
		statesOfUK.add("Northern Ireland");
		
		List<String> statesOfCanada = new ArrayList<String>();
		statesOfCanada.add("Alberta");
		statesOfCanada.add("British Columbia");
		statesOfCanada.add("Manitoba");
		statesOfCanada.add("Nova Scotia");
		statesOfCanada.add("New Brunswick");
		
		List<String> statesOfAustralia = new ArrayList<String>();
		statesOfAustralia.add("New South Wales");
		statesOfAustralia.add("Queensland");
		statesOfAustralia.add("South Australia");
		statesOfAustralia.add("Tasmania");
		statesOfAustralia.add("Victoria");
		
		List<String> statesOfJapan = new ArrayList<String>();
		statesOfJapan.add("Tokyo");
		statesOfJapan.add("Naga Saki");
		statesOfJapan.add("Herosema");
		statesOfJapan.add("Osaka");
		statesOfJapan.add("Toyo");
		
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("USA",statesOfUSA);
		map.put("UK",statesOfUK);
		map.put("Canada", statesOfCanada);
		map.put("Australia", statesOfAustralia);
		map.put("Japan", statesOfJapan);
		
		for(Map.Entry<String, List<String>> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"----->"+entry.getValue());
		}
		System.out.println(map);

	}

}
