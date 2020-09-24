package basic_core_phase_two;

public class ExcerciseReturnArray {

	static int[] get() {
		return new int[]{10, 20, 30, 40, 80, 90, 100, 200, 400};
	}
	
	public static void main(String[] args) {
		int arr[] = get();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
//		int arrayOfNumbers [][] = {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.println(arrayOfNumbers[i][j]);
//			}
//			 System.out.println();  
//		}
	}

}
