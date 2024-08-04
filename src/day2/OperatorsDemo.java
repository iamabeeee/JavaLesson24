package day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		//	1. Arithmetic operators + - * / %
		int a = 20 , b =10;
		
		System.out.println("Sum of a and b is: " + (a+b));//30
					      //^^ This is the String   ^^ without paring quotations the code wouldn"t work
		System.out.println("Subs of a and b is: " + (a-b));//10
		System.out.println("Multi of a and b is: " + (a*b));//200
		System.out.println("Divi of a and b is: " + (a/b));//2
		System.out.println("Percent of a and b is: " + (a%b));//0
		
		// 2. Relational/Comparison operators > < >= <= != ==
		// Returns boolean value - true or false 
	
		System.out.println("===========Relational operators======".repeat(3));
		
		//int a = 20 , b =10;
		
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		// 3. Logical Operators && | | !
		System.out.println("===========Logical operators======".repeat(3));
		//returns a boolean value
		//works between 2 boolean values
		
		boolean x = true, y = false;
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		
		
		
		
		
		
		
		
	}
	
}






