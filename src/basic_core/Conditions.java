package basic_core;

public class Conditions {

	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		
//		if x is greater than 5 and less than 15 print greater than 5 and less than 15
//		if x is 100 or (x is greater than 8 and less than 12) print x is special
//		if x is 10 print x is equal to 10
//		else print x is not expected
		
		if(x == 10) {
			System.out.println("X is 10");
		}else if(x ==100 | (x > 8 && x < 12)) {
			System.out.println("X is special");
		} else if (x > 5 && x < 15) {
			System.out.println("greater than 5 and less than 15");			
		} else {
			System.out.println("not expected");
		}
		System.out.println(!false);
	}

}
