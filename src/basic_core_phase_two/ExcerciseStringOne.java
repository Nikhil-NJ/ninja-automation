package basic_core_phase_two;

public class ExcerciseStringOne {

	public static void main(String[] args) {
		
		String sampleOne = "Perform Operations";
		String sampleTwo = "Perform Operations";
		
		String sampleThree = " With String";
		
		int position = 14;
		int indexOne = sampleOne.charAt(position);
		System.out.println("Character at position " + position + " is "  + (char)indexOne);		
		System.out.println(sampleOne.equals(sampleTwo));
		
		System.out.println("#######################################################################################");
		
		int result = sampleOne.compareTo(sampleTwo);
//		int result = sampleOne.compareToIgnoreCase(sampleTwo);

		if(result < 0) {
			System.out.println("The string " + sampleOne + " is less than " + sampleTwo);
		} else if(result == 0) {
			System.out.println("\nBoth are same.\n");
		} else if(result > 0) {
			System.out.println("The string " + sampleOne + " is gretter than " + sampleTwo);
		}
		String concate = sampleOne.concat(sampleThree);
		System.out.println(concate);
	}

}
