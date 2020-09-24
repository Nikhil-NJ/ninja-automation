package basic_core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExcerciseList {	
	public static void main(String[] args) {
		// List
		List<String> listOne = new ArrayList<String>();
		listOne.add("Nikhil");
		listOne.add("Khurram");
		listOne.add("Ninja-automation");
		listOne.add("Discovery");
		listOne.add(2, "MiddleOne");
		listOne.add(4, "ForthOne");
	
		
		System.out.println("\nValue in position 5 is   " + listOne.get(1));
		listOne.set(5, "SetValue");
		
		// Using iterator	
//		Iterator itrListObj = listOne.iterator();
//		while(itrListObj.hasNext()) {
//			System.out.println(itrListObj.next());			
//			//listOne.clear();
//		}
		// Using Object toArray
		//Object value  ? Why not ?		
		Object[] arrayList = listOne.toArray();
		for(Object value : arrayList) {
			System.out.println(value);
		}
		
		String value1 = (String) arrayList[0];
		//System.out.println(arrayList);


		
		System.out.println("\n***************************\n");
		
		// Set
		Set<Object> setOne = new HashSet<Object>();
		setOne.add(11);
		setOne.add("Java tutorials");
		setOne.add(11);
		setOne.add(true);
		setOne.add(true);

		for (Object setval: setOne) {
			System.out.println(setval + setval.getClass().getSimpleName());
		}
		
//		Iterator itrSetObj = setOne.iterator();
//		while(itrSetObj.hasNext()) {
//			System.out.println(itrSetObj.next());
//			System.out.println(itrSetObj.next().getClass().getSimpleName());
//
//			//listOne.clear();
//		}

	}

}
