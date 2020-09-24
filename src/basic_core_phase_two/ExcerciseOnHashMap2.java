package basic_core_phase_two;

import java.util.HashMap;

public class ExcerciseOnHashMap2 {

	public static void main(String[] args) {
		HashMap<Integer, String> example = new HashMap<Integer, String>();
		example.put(1, "GCR");
		example.put(2, "ON-Ramp");
		example.put(3, "Off-Ramp");
		example.put(4, "DDU");
		example.put(5, "Hive");
		
		System.out.println("Original " + example);
		HashMap<Integer, String> exampleTwo = new HashMap<Integer, String>();
		exampleTwo = (HashMap)example.clone();
		System.out.println("Cloned " + exampleTwo);
		
	}

}
