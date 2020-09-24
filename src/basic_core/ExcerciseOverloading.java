package basic_core;

class Overloading {
	int offshore_emp_id;
	String offshore_emp_name;	
	String company_name;
	
	public void display(int offshore_emp_id) {
		this.offshore_emp_id = offshore_emp_id;
		System.out.println("Display 1st method " + offshore_emp_id);
	}
	//Change- Number of Arguments
	public void display(int offshore_emp_id, String offshore_emp_name) {
		this.offshore_emp_id = offshore_emp_id;
		this.offshore_emp_name = offshore_emp_name;
		System.out.println("Display 2nd method " + offshore_emp_id + " " + offshore_emp_name);
		
	}	
	
	//Change- Number of datatypes
	public void display(String company_name) {
		this.company_name = company_name;
		System.out.println("Company name is " + company_name);
	}
}

class Overriding extends Overloading {
	
	int onsite_emp_id;
	String onsite_emp_name;
	
	public void display(int onsite_emp_id) {
		this.onsite_emp_id = onsite_emp_id;
		System.out.println("Display 1st method " + onsite_emp_id);
	}
	
	public void display(int onsite_emp_id, String onsite_emp_name) {
		this.onsite_emp_id = onsite_emp_id;
		this.onsite_emp_name = onsite_emp_name;
		System.out.println("Display 2nd method " + onsite_emp_id + " " + onsite_emp_name);		
	}
	// Overriding
	public void display(String company_name) {
		this.company_name = company_name;
		System.out.println("Company name is " + company_name);
	}
}

public class ExcerciseOverloading {
	public static void main(String arge[]) {
		Overloading overloading = new Overloading();
		System.out.println("\n**************  Overloading ********************************");

		overloading.display(1);		
		overloading.display(1,  "Nikhil");
		overloading.display("LTI- Discovery");
		System.out.println("\n**************  Overriding ********************************");
		Overriding overriding = new Overriding();
		overriding.display(2);
		overriding.display(2, "Khurram");
		overloading.display("Discovery");			
	}
}
