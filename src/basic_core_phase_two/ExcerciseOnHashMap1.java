package basic_core_phase_two;

import java.util.HashMap;
import java.util.Map;

public class ExcerciseOnHashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> example = new HashMap<Integer, String>();
		example.put(1, "GCR");
		example.put(2, "ON-Ramp");
		example.put(3, "Off-Ramp");
		example.put(4, "DDU");
		example.put(5, "Hive");
		
		for(Map.Entry<Integer, String> x : example.entrySet()) {
			System.out.println( x.getKey() + " " + x.getValue());
		}
		
		System.out.println("\nSize of a map " + example.size());
		boolean check = example.containsValue("GCR");
		System.out.println(check);
		example.replace(5, "HiveMetaData");
		System.out.println(example);
		
		example.clear();
		System.out.println("New hashmap " + example);
		
	}

}
