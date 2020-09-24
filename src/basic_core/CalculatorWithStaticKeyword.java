package basic_core;

public class CalculatorWithStaticKeyword {
	static int cube(int x) {
		return x*x*x;
	}

	public static void main(String[] args) {
		int results = cube(4);
		System.out.println(results);
	}

}
