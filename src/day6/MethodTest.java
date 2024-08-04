package day6;

public class MethodTest {

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();//1.
		m.methodOne();
		String result = m.methodTwo();
		System.out.println(result);//2.

		m.methodThree("Sarmin");//3.
		
		int sum = m.add(100, 300);
		System.out.println(sum);//4.
	}
}
