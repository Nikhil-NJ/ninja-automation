package basic_core;

/*
 * Program for inheritance concept
 * */
 class Employee {	
	int salary =  10000;
	public static void main(String args[]) {
		Employee emp = new Employee();
		Programmer programmer = emp.new Programmer();
		System.out.println("Employee salary : " + programmer.salary);
		System.out.println("Employee bonus : " + programmer.bonus);
	}
	 class Programmer extends Employee {
		int bonus = 4000;
		
	}
}



