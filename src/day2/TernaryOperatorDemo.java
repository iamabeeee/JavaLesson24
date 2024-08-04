package day2;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		//Conditional or ternary operators ? :
		
		int age = 18;
		String result 	=(age >= 18) ?  "Eligible to vote!!" : "Not eligible!!";
		System.out.println(result);
		System.out.println((age >= 18) ?  "Eligible to vote!!" : "Not eligible!!");
		
		int a = 25, b = 10; 
		System.out.println("initial value of a is: " + a + " and b is: "+ b);
		a = a+b;//35
		b = a-b;//25
		a = a-b;
		System.out.println("Final value of a is: " + a + " and b is: "+ b);
		
		
		
		
		
		
		

	}

}
