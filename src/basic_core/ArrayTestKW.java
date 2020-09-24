package basic_core;

import java.util.ArrayList;
import java.util.List;

public class ArrayTestKW {

	public static void main(String[] args) {
		
		int values [] = new int [2];
		values[1] = 32132;
		values[0] = 231;


		System.out.println(values.length);
		
		int testNumbers [] = {92329, 6468, 9020};
		String testNames [] = {"Khurram", "Nikhil", "Discovery"};
		//System.out.println(testNames[1] + " " + testNumbers[1]);
		for(int i = 0; i < testNumbers.length; i++) {
			System.out.println(testNames[i] + " " + testNumbers[i]);
		}
		System.out.println("*************************");
		int i = 0;
		
		for(int testNumber : testNumbers) {
			System.out.println(testNumber +" "+ testNames[i]);
			i++;
		}
		
		int dynamic [] = new int[0];
	
		
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(30);
		integers.add(79);
		dynamic = new int[integers.size()];

		for(int j = 0; j < integers.size(); j++) {
			System.out.println(j*10);
			dynamic[j] = j * 10;
			System.out.println("*************************");
		}	
		
		for (int x : dynamic) {
			System.out.println("*************************");

			System.out.println(x);
		}
	}
						
}
