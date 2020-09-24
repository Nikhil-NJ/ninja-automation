package basic_core_phase_two;

import java.util.HashMap;
import java.util.Set;

public class ExcerciseOnHashMap3 {

	public static void main(String[] args) {
		HashMap<Integer, String> example = new HashMap<Integer, String>();
		example.put(1, "GCR");
		example.put(2, "ON-Ramp");
		example.put(3, "Off-Ramp");
		example.put(4, "DDU");
		example.put(5, "Hive");
		
		Set setValues = example.entrySet();
		System.out.println(setValues);
		// Added value in map, it reflets in set also
		example.put(6, "PDS");
		System.out.println(setValues);
		example.remove(4, "DDU");
		System.out.println(setValues);	
	}

}
