package basic_core;

public class VariableLengthArg {

	public static void main(String[] args) {
		System.out.println(averagNumber(12,34,99,80));

	}
	
	public static int averagNumber(int...numbers) {
		int total = 0;
		for(int x: numbers)
			total += x;
		
		return total/ numbers.length;
	}
	
	

}
