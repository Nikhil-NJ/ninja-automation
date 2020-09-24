package basic_core;
import java.io.File;


public class ExcerciseFileClass {

	public static void main(String[] args) {
		
		File file = new File("C:\\Test\\testFile.txt");
		
		if(file.exists()) 
			System.out.println( file.getName() + " Test file is exist !"); 
		else
			System.out.println("The File Desn't Exist !");	
		
		System.out.println("***************************************************************");
		
		ExcerciseOpenFile fileObj = new ExcerciseOpenFile();
		fileObj.openFile();
		fileObj.readFile();
		fileObj.closeFile();		 
	   }
}
