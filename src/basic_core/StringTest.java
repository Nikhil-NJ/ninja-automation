package basic_core;

public class StringTest {

	private String firstName;
	private String secondName;
	private static int members = 0;
	
	public StringTest(String fName, String sName) {
		firstName = fName;
		secondName = sName;
		System.out.println(members + firstName + " " + members + secondName);
		members++;
	}	
}




