package basic_core;

public class Statement {
	public static void main (String [] args) {
		int printNumber = 1;
		int boy = 22;
		int girl = 18;
		
		if (printNumber < 10) {
			System.out.println("Print the correct number" + printNumber);
		}
		else {
			System.out.println("Condition failed because of incorrect" + printNumber);

		}
		
		if (printNumber == 10) {
			System.out.println("Print the correct number" + printNumber);
		}
		else {
			System.out.println("Condition failed because of incorrect" + printNumber);

		}
		/*
		 *  Logical Operators
		 * */
			
		if (boy > 18 && girl < 16) {
			System.out.println("You are allowed.");
		}
		else {
			System.out.println("Not allowed.");
		}
		
		if (boy > 18 || girl < 16) {
			System.out.println("You are allowed.");
		}
		else {
			System.out.println("Not allowed.");
		}
	}

}
