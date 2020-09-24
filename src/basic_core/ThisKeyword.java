package basic_core;

public class ThisKeyword {
	int roll_no;
	String name;
	int fees;
	String college_name;
	
	public ThisKeyword() {
	}
	
	public ThisKeyword(int roll_no, String name, int fees) { 
		this.roll_no = roll_no;
		this.name = name;
		this.fees = fees;
	}
	
	public void keyword(String name, int fees, int roll_no) { 
		this.roll_no = roll_no;
		this.name = name;
		this.fees = fees;
		System.out.println(roll_no + " " + name + " " + fees);		
	}
	
	public ThisKeyword(int roll_no, int fees, String college_name) {
		this.roll_no = roll_no;
		this.college_name = college_name;
		this.fees = fees;
	}

	void display() {
		System.out.println(roll_no + " " + name + " " + fees);
	}
	
	public static void main(String args[]) {
		ThisKeyword obj1 = new ThisKeyword(111, "Nikhil", 2000);
		ThisKeyword obj2 = new ThisKeyword(222, "Khurram", 4000);
		obj1.display();		
		obj2.display();
		
		ThisKeyword obj3 = new ThisKeyword();
		obj3.keyword("Discovery", 1000, 333);
		

	}
}
