package javaBasics;

public class Java23Constructors {
	// Constructors are always called at the creation of an object
	// Constructors have no return type
	// If the name matches the class name it is a constructor
//	public Java23Constructors() {
//		int a = 2;
//		int b = 3;
//		int result;
//		result = a + b;
//		System.out.println(result);
//		
//	}
	public Java23Constructors(int a, int b) {
		int result;
		result = a + b;
		System.out.println(result);
	}

	public void Method() {
		System.out.println("This is my method");
	}
	public static void main(String[] args) {
		Java23Constructors JC = new Java23Constructors(5,6);
		Java03Methods JM = new Java03Methods();
		//JM.AddTwoNumbers();
		//JC.Method();


	}

}
