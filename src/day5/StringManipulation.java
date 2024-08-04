package day5;

public class StringManipulation {

	public static void main(String[] args) {

//		Strings are immutable - it can not be changed
		String s = "Welcome 123";// String Literal
		String s2 = new String("Welcome");// through string object
//		 to learn important methods of String class

//		 length() -- counts all the characters in a string and returns the number in

		int length = s2.length();
		System.out.println("The length is: " + length);

		System.out.println(s.length());

//		Concat() -- Join multiple string
		String s1 = "Welcome";
		String s3 = " to java";
		String s4 = " programming.";
		System.out.println(s1.concat(s3).concat(s4));// Welcome to java programming.

		// trim() -- Would trim any leading and trailing spaces from a string
		s = "   welcome to java        ";
		System.out.println(s.length());
		s.trim();
		System.out.println(s.trim().length());

		// charAt() -- Returns a single character of a string from a specific index
		// index start from 0
		s = "Java Selenium";
		System.out.println(s.charAt(5));

//		contains();  --Returns a boolean (True/False)
//		check a string is the part of the main string or not
		
		System.out.println(s.contains("Jav"));//true
		System.out.println(s.contains("Sel"));//true
		System.out.println(s.contains("ium"));//true
		System.out.println(s.contains("Sli"));//false
		System.out.println(s.contains("a S"));//true
		
//		equals(); equalsIgnoreCase() ----> compares two strings and returns true/false
		s1 = "Welcome";
		s2 = "welcome";
		System.out.println(s1.equals("welcome"));//false
		System.out.println(s1.equalsIgnoreCase("welcome"));
		
//		replace() -- It replaces a single character or character sequence of a given string
		s = "welcome to java selenium automation";
		System.out.println(s.replace("w", "W"));
		System.out.println(s.replace("java","python"));
		
		
//		substring() --- Extracts substring from the main string
		System.out.println(s.substring(11));//java selenium automation
		System.out.println(s.substring(11, 15));//java

		
//		toUppercase()   toLowerccase()  --> Converts cases 
		s = "Welcome";
		System.out.println(s.toUpperCase());//WELCOME
		System.out.println(s.toLowerCase());//welcome
		
//		split() -- split or divide original string into multiple parts based on delimiter
		s = "abc@xyz";
		String a[] = s.split("@");
		System.out.println(a[1]);//goes to the only @ symbol and splits the words
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");
		System.out.println(b[4]);
		
		
		s = "welcome to java selenium automation";
		System.out.println(s.replace(" ", "_"));
		
		//extract only abc from the following string
		s = "abc,123@m.com";
		String[] c = s.split(",");
		System.out.println(c[0]);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
