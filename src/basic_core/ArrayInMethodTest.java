package basic_core;

public class ArrayInMethodTest {

	public static void main(String[] args) {
		
		int number []= {1,2,3,4,5,6,7,8,9};
		String empName [] = {"Nikhil", "khurram"} ;
		
		change(number);		
		stringDisplay(empName);
		
		for(int j : number)
			System.out.println(j);
		
		for(String k : empName)
			System.out.println(k);

	}
	
	public static void change(int x[]) {
		for(int i=0; i<x.length; i++)
			x[i]+= 2;
	}
	
	public static void stringDisplay(String name[]) {
		for(int i=0; i<name.length; i++) {
			//name[i].concat("Jadhav");
			name[i]+= " Discovery";
		}
		
	}
}
