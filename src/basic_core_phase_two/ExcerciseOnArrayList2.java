package basic_core_phase_two;

import java.util.ArrayList;
import java.util.Collections;

public class ExcerciseOnArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> element = new ArrayList<String>();
		element.add("Nikhil");
		element.add("Discovery");
		element.add("Khurram");
		element.add("Verginia");
		element.add("America");
		
		if(element.contains("America")) {
			System.out.println("Found ele");
		} else {
			System.out.println("Not ele");
		}
		
		System.out.println("Before sort " + element);
		Collections.sort(element);
		System.out.println("After sort " + element);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(121);
		numbers.add(112121);
		numbers.add(1112311);
		numbers.add(11111);
		
		if(numbers.contains(12)) {
			System.out.println("Number is present");
		} else 
			System.out.println("Number doesn't exists");
		
	}

}
