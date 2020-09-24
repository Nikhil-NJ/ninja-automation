package basic_core;

public class Switch {

	public static void main(String[] args) {
		int age = 6;
		
		switch(age) {
		case 16:
			System.out.println("You cannot vote");;
			break;
		case 6:
			System.out.println("You can talk");;
//			break;
		default:
			System.out.println("Anyways execute");
			break;
		}
				
	}

}
