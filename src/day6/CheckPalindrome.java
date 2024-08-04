package day6;

public class CheckPalindrome {
//	Q5. Check to see if a string is Palindrome or not.
	public static void main(String[] args) {
	

		String input = "racecar"; //<< any word that can be spelt back words or front words is a palidrome
		
		System.out.println("Given string is palidrome = " + isPalindrome(input));
		String doubtFullInput = "This is my string with special characters :_*&^%$#@!";
		String result = doubtFullInput.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);
	}

	
	public static boolean isPalindrome(String str) {
		
		String reversed = "";
		for(int i = str.length() -1; i>=0; i--) {
			reversed += str.charAt(i); 
			
			
		}
		return str.equals(reversed);
	}
	
	
}
