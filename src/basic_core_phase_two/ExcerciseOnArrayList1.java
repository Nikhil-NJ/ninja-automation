package basic_core_phase_two;

import java.util.ArrayList;

public class ExcerciseOnArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> element = new ArrayList<String>();
		element.add("Nikhil");
		element.add("Discovery");
		element.add("Khurram");
		element.add("Verginia");
		element.add("America");
		
		for(String ele : element) {
			System.out.println(ele);
		}
		
		element.add(0, "GCR");
		element.add(6, "End");
		System.out.println("\n");
		System.out.println(element);
		
		String retrive = element.get(6);
		System.out.println(retrive);
		
		retrive = element.get(2);
		System.out.println(retrive);
		// Update value
		element.set(2, "Discovery_Update");
		System.out.println(element);
		//Remove
		element.remove(6);
		System.out.println(element);

	}

}
