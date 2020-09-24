package basic_core_phase_two;

public class ExerciseOnArray3 {
    public static int  findIndex (int[] myArray, int number) {
     int arrayLength = myArray.length;
     int i = 0;
     while (i < arrayLength) {
         if (myArray[i] == number) {
        	 return i;
         } else {
        	 i=i+1;
         }
     }
     return 0;
 }
 public static void main(String[] args) {
   int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   System.out.println("Index position of 25 is: " + findIndex(myArray, 2512));
   System.out.println("Index position of 77 is: " + findIndex(myArray, 712127));
    }
}