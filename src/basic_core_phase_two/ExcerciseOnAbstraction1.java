package basic_core_phase_two;

public class ExcerciseOnAbstraction1 extends Excercise1 implements Excercise2 {

	public static void main(String[] args) {		
		ExcerciseOnAbstraction1 excerciseOnAbstraction1 = new ExcerciseOnAbstraction1();
		excerciseOnAbstraction1.add();
		excerciseOnAbstraction1.sub();	
		excerciseOnAbstraction1.mult();
		excerciseOnAbstraction1.div();
	}

	@Override
	void sub() {
		int resultSub = num2 - num1;
		System.out.println("Substraction is " + resultSub);
	}

	@Override
	public void mult() {
		int resultMult = num1 * num2;
		System.out.println("Multiplication is " + resultMult);
	}

	@Override
	public void div() {
		int resultDiv = num1 / num2;
		System.out.println("Division is " + resultDiv);		
	}

}

abstract class Excercise1 {	
	int num1 = 10;
	int num2 = 20;
	
	void add() {		
		int resultAdd =  num1 + num2;
		System.out.println("Addition of two numbers is " + resultAdd);
	}
	
	abstract void sub();
	
}

interface Excercise2 {
	void mult();
	void div();
}
