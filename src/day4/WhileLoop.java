package day4;

public class WhileLoop {

	public static void main(String[] args) {
	
// 		initialization; condition/logic; increment/decrement;
		//System.out.println("***** Using for loop *****".repeat(2));
		
		//for (int num = 1; num <= 5; num++) {
		//	System.out.println(num);
		//}
		//System.out.println("***** Using while loop *****".repeat(2));
		//print 1 to 5 using while loop
		//int num = 1; 
		//while (num <= 5) {
		//	System.out.println(num);
		//	num ++;
		
		//}		
		// print 1 to 5 using do while loop
		//System.out.println("***** Using do while loop *****".repeat(2));
	//	int number = 1;
		//do {
		//	System.out.println(number);
			//System.out.println("***John***");
		//	number++;
	//	}while(number<=5);
		
	// situation 1
		for (int i=1; i<=10;  i++) {
			System.out.println(i);
			//keeping the code intact, exclude printing 1-10
			if(i==5) {
				break;// jumping statement (jumping out the loop)
			}
	
		}
		
		System.out.println("Situation 2");
		//situation 2 print all the numbers less than 5
		for (int i=1; i <=10; i++) {
			if(i==5) {			
				continue; //skip the current sequence
			
			}
			System.out.println(i);
		
		
		}
		
		
		}
		
		}
		
		
		