package basic_core;

public class TestExample {
	
	static int a = 10;
	
	void displa1() {
		int a = 111;
		System.out.println(a);
	}
	
	void display2() {
		int a = 222;
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		TestExample test = new TestExample();
		test.displa1();
		test.display2();
	}

}
