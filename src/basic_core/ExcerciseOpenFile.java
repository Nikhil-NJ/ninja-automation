package basic_core;

import java.util.Scanner;

public class ExcerciseOpenFile {
	private Scanner scanner;

	public void openFile() {
		try {
			scanner = new Scanner("C:\\Test\\testFile.txt");
		} catch (Exception e) {
			System.out.println("File Not Found");
		}	
	}
	
	public void readFile() {
			//while(scanner.hasNext()) {
				String firstValue = scanner.next();
				String secondtValue = scanner.next();
				String thirdValue = scanner.next();
				
				System.out.println(firstValue + " " + secondtValue + " " + thirdValue);
			//}
	}
	
	public void closeFile() {
		scanner.close();
		
	}
	
}
