package basic_core;

public class MainClass {
	//static String name = "Nikhil";
	/*Why we cannot create object outside the method
	DerivedClass dClass = new DerivedClass();    */	

	public static void main(String[] args) {
		
		DerivedClass dClass = new DerivedClass();
		
		MultipleConstructor multi1 = new MultipleConstructor();
		MultipleConstructor multi2 = new MultipleConstructor(1);
		MultipleConstructor multi3 = new MultipleConstructor(1,2);
		MultipleConstructor multi4 = new MultipleConstructor(1,2,3);
		
		KeywordStatic keywordStatic1 = new KeywordStatic(111, "Nikhil");
		KeywordStatic keywordStatic2 = new KeywordStatic(222, "Khurram");
		KeywordStatic keywordStaticCount1 = new KeywordStatic();
		KeywordStatic keywordStaticCount2 = new KeywordStatic();
		KeywordStatic keywordStaticCount3 = new KeywordStatic();
		KeywordStatic keywordStaticCount4 = new KeywordStatic();

		
		StringTest stringTest1 = new StringTest("Nikhil", "Khurram");

		String name = "Nikhil";
		String companyName = "Discovery";
		
		System.out.println("\n************Non static*************************");
		dClass.nonStatMessage();
		
		System.out.println("\n************Static*************************");
		DerivedClass.aMessage();
		
		System.out.println("\n*************With parameter method call*****");
		dClass.aMessageWithPara(name);
		
		System.out.println("\n*************Many Method and instance*****");
		dClass.setName(companyName);
		dClass.companyNamePrint();
		
		System.out.printf("%s\n", multi1.finalDisplay());
		System.out.printf("%s\n", multi2.finalDisplay());
		System.out.printf("%s\n", multi3.finalDisplay());
		System.out.printf("%s\n", multi4.finalDisplay());
		
		System.out.println("******************************************");
		
		keywordStatic1.display();
		keywordStatic2.display();
		
		keywordStaticCount1.counter();
		keywordStaticCount2.counter();
		keywordStaticCount3.counter();
		keywordStaticCount4.counter();


	}
}
