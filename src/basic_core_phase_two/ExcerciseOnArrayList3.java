package basic_core_phase_two;

import java.util.ArrayList;

public class ExcerciseOnArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<String> elementOne = new ArrayList<String>();
		elementOne.add("Nikhil");
		elementOne.add("Discovery");
		elementOne.add("Khurram");
		elementOne.add("Verginia");
		elementOne.add("America");
		
		ArrayList<String> elementTwo = new ArrayList<String>();
		elementTwo.add("Khurram");
		elementTwo.add("Discovery");
		elementTwo.add("Nikhil");
		elementTwo.add("New York");
		elementTwo.add("North America");
		
		ArrayList<String> element = new ArrayList<String>();
		for(String ele : elementOne) {
			element.add(elementTwo.contains(ele)  ? "Match" : "No Match");
		}
		System.out.println(element);

	}

}
