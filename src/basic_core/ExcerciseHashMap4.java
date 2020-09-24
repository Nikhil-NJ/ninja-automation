package basic_core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExcerciseHashMap4 {

	public static void main(String[] args) {
		HashMap<Integer, String> details = new LinkedHashMap<Integer, String>();
		
		HashMap.Entry<Integer, String> mapEntry;
		
		details.put(11, "Ninja-Automation");
		details.put(12, "Verginia");
		details.put(13, "Sterling");
		details.put(14, "USA");
		
		//System.out.println(details);
		// Display value using iterator
		Set<HashMap.Entry<Integer, String>> setDetails = details.entrySet();
		Iterator<Entry<Integer, String>> iterator = setDetails.iterator();
		while(iterator.hasNext()) {
			
			mapEntry = (Map.Entry<Integer, String>)iterator.next();		
			System.out.print("key is: "+ mapEntry.getKey() + " & Value is: " + mapEntry.getValue() + "\n");
		}
		
		String secondValue = details.get(12);
		System.out.println("Displaying second value " + secondValue);
		
		details.put(20, "Delete_String");
		//System.out.println("After adding new element : key is: "+ mapEntry.getKey() + " & Value is: " + mapEntry.getValue() + "\n");
		//System.out.println(details.get(key));
	
	}

}
