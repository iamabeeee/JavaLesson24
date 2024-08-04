package day3;

public class IfElseIfLadderDemo {

public static void main(String[] args) {
	//if result >=90 grade A ---> 
	//if result <90 >=70 grade B ---> 
	//if result >=60 >70 grade C --->
	//rest = grade F
		
		
	//use if else if statements
	int result = 99;
	
	if(result<=100 && result>=90) {  // << USING && HAS TO BOTH BE TRUE TO BE EXECUTED CORRECTLY
		System.out.println("Grade A");
	} else if(result<=90 && result>=70) { // << USING ELSE IF IS USING MORE THAN 1 CONDITION
		System.out.println("Grade B");
	}
	  else if(result<=70 && result>=60) {
		System.out.println("Grade C");
	} else {                          // << USING ELSE IS USING 1 CONDITION 
		System.out.println("Grade F");
	}
		
		
		
		
		
		
			
		

	}

	}
