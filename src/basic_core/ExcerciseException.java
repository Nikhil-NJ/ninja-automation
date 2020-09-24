package basic_core;

public class ExcerciseException {

	public static void main(String[] args) {
		
		try {
			
			int num1 = 10;
			int num2 = 0;
			int calculate = num1 / num2;			
			System.out.println("Total calculation is : " + calculate);		
					
		} catch (ArithmeticException e) {
			System.out.println("You can't do that");
		} 
		try {
			
			String s="ABC";  
			System.out.println(s.length());
			
		}
		catch (NullPointerException e) {
			System.out.println("String is incorrect");
		}
	}

}
