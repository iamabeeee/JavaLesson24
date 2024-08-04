package day6;

/*1. Method name is a user defined name
 * but it should display the intent of performing an action
 *2. Method may or may not retrun any value
 *3. Method may or may not accept parameters
 *4. Methods can be invoked through objects
 *5. A method is created to perform some actions
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class MethodDemo {

	// 1. No param and no return

	public void methodOne() {
		System.out.println("Hey, we are learning method!");
	}

	// 2. No param Return value
	public String methodTwo() {
		String a = "Hello.";
		String b = " How are you?";
		return a + b;

	}

	// 3. Accepts a param but does not reurn
	public void methodThree(String name) {
		System.out.println(name + ", how are you?");
	}

	// 4. Accepting the param and returning values
	public int add(int a, int b) {
		return (a + b);

	}

}