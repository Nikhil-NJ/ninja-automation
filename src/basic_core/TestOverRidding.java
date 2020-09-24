package basic_core;


	class Bank {
		int getRateOfIntrest() {
			return 10; 
		}		 
	}
	
	class HSBC extends Bank {
		int getRateOfIntrest() {
			System.out.println("Super" + super.getRateOfIntrest());			
			return 11;
		}
	}
		
	class SBI extends Bank {
		int getRateOfIntrest() {
			return 12; 
		}
	}
	
	class ICICI extends Bank {
		int getRateOfIntrest() {
			return 13; 
		}
	}

	public class TestOverRidding {

			public static void main(String[] args) {
				HSBC hsbc = new HSBC();
				System.out.println("HSBC " + hsbc.getRateOfIntrest());
				SBI sbi = new SBI();
				System.out.println("SBI " + sbi.getRateOfIntrest());
				ICICI icici = new ICICI();
				System.out.println("ICICI " + icici.getRateOfIntrest());

			}
	 }
