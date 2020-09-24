package basic_core;

public class KeywordStatic {
	
	int rollno; 
	String name;  
	final static String company ="Discovery";
	
	static int countValue = 0;
	
	void counter() {
		countValue++ ;
		System.out.println("Counter number " + countValue);
	}
	
	public KeywordStatic() {
	}
	
	public KeywordStatic(int rnum, String ename) {
		rollno = rnum;
		name = ename;
	}
	
	protected void display() {
		System.out.println(rollno + " " + name +" " + company);
	}	

}
