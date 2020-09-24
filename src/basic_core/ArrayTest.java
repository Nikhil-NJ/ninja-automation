package basic_core;

public class ArrayTest {

	public static void main(String[] args) {
		int number [] = new int [10];
		int number2 [] = {1,21,34,8,9,23,8,1,22,21,23,11};
		
		number[0] = 100;		
		number[1] = 300;
		number[2] = 800;
		number[3] = 100;		
		number[4] = 300;
		number[5] = 800;
		number[6] = 100;		
		number[7] = 300;
		number[8] = 800;
		number[9] = 100;	
		
		
//		System.out.println(number.length);
//		System.out.println(number2.length);
		
		System.out.println("******************************************************************************");
		
		System.out.println("Index\tValue");
		for (int i=0; i<number2.length; i++) {
			System.out.println(i + "\t" + number2[i]);
		}
		
		System.out.println("**************************Sum of values in number2 array*************************");
		int sum=0;
		int add=0;
		for (int i=0; i<number.length; i++) {
			sum+=number[i];
		}		
		System.out.println("sum is " + sum);
		
		// Enhanced
		for (int j : number2) {
			add+= j;
		}
		System.out.println("add is " + add);

	}

}
