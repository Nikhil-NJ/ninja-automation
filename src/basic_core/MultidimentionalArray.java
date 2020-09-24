package basic_core;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		int firstArray [][] = {{1,2,3,4},{11,22,33,44}};
		int secondArray [][] = {{111,222,333,444},{1111,1122,1133,1144},{2211,2222,2233,2244}};
		
		System.out.println("FIRST ARRAY VALUES\n");
		displayResults(firstArray);
		
		System.out.println("\nSECOND ARRAY VALUES\n");
		displayResults(secondArray);
		
	}
	
	public static void displayResults(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for(int column=0; column<x[row].length; column++) {
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}

}
