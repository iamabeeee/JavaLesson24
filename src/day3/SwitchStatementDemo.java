package day3;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		
	
		/*Conditional statements 
		 * 
		 * Conditional statements 
		 * if else
		 * switch statement
		 */
		
		/*Syntax of switch statement 
		switch(variable) {
		case 1: {
			//code
			break;
			
		}
		case 2: {
			//code
			break;
		}default:
		}      //
		*/
		
		int num = 2;
	switch (num) {
	case 1: {
		System.out.println("Monday");
		break;
	}
	case 2: {
		System.out.println("Tuesday");
		break;
	
	}
	case 3: {
		System.out.println("Wednesday");
		break;
		}
		
	default: {
		System.out.println("This number is not any day of the week");
	}
	 
	}
	
	System.out.println("Out of switch statement");
	
	
	}
	
	}
