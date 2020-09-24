package basic_core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExcerciseHashMap {	
	public static void main(String[] args) {
		// Hashmap
		HashMap<Integer, String> mapOne = new HashMap<Integer, String>();
		
		HashMap<Integer, String> mapTwo = new HashMap<Integer, String>();
		
//		mapOne.put(1, "Nikhil");
		mapOne.put(2, "Khurram");
		mapOne.put(3, "Ninja-automation");
		mapOne.put(4, "Discovery");
		mapOne.put(5, "Discovery");

		mapTwo.put(3, "Khurram");
		mapTwo.put(2, "Ninja-automation");
		mapTwo.put(4, "Discovery");
//		mapTwo.put(1, "Nikhil");
		
		
		for(Map.Entry<Integer, String> m : mapOne.entrySet()) {    
		    System.out.println(m.getKey()+" "+m.getValue());
		    //System.out.println("Is euqal" + mapOne.equals(mapTwo) + "\n");
		}
		System.out.println("\nIs euqal " + mapOne.equals(mapTwo));
		System.out.println("\n " + mapTwo.entrySet());
		
		System.out.println("****************************************************************\n ");
		int i = 0;
		for(Map.Entry<Integer, String> m1Entry : mapOne.entrySet()) {  
			
			Integer m1key = m1Entry.getKey();
			String m1value = m1Entry.getValue();
			
			for(Map.Entry<Integer, String> m2Entry : mapTwo.entrySet()) {
				i++;
				System.out.println("**********************"+i);

			    Integer m2Key = m2Entry.getKey();
			    String m2value = m2Entry.getValue();
			    
			    if (m1key == m2Key) {
			    	System.out.println("found matching key"+ m1key);
			    	
			    	if (m1value.equals(m2value)) {
			    		System.out.println("the value for the key"+m1key+" matched" + m1value);
			    	} else {
			    		System.out.println("the value did not match for the key");
			    	}
			    	break;
			    }

			}	
			
		}
	
		
		List<HashMap<String, String>> persons = new ArrayList<HashMap<String,String>>();
		
		HashMap<String, String> person1 = new HashMap<String, String>();
		person1.put("name", "khurram");
		person1.put("age", "36");
		
		HashMap<String, String> person2 = new HashMap<String, String>();
		person2.put("name", "Nikhil");
		person2.put("age", "28");
		
		persons.add(person1);
		persons.add(person2);
		
		System.out.println(persons.get(1).get("age"));
		
		
	}

}
