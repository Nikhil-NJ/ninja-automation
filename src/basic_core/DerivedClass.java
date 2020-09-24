package basic_core;

public class DerivedClass {
	
	private String companyName;
	
	public static void aMessage() {
		System.out.println("This is a simple message print");
	}
	
	public void nonStatMessage() {
		System.out.println("This is a simple message print with creating object");
	}
	
	public void aMessageWithPara(String name) {
		System.out.println("Hello " + name);
	}
	
	public void setName(String name) {
		companyName = name;
	}
	
	public String getName() {
		return companyName;
	}
	
	public void companyNamePrint() {
		System.out.println("Name of company is " + getName());
	}

}
