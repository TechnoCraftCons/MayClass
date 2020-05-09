package javaBasics;

public class Java03Methods {
	double a= 15;
	double b = 5;
	double result;
	
	// Any method which have void doesn't have a return type
	public void AddTwoNumbers() {
		result = a + b;
		System.out.println("Sum of the two numbers is: " + result);
	}
	// This is a method with return type
	public double AddTwoNumbersWithReturnType() {
		result = a + b;
		return result;
	}
	
	public boolean ReturnBoolean() {
		return true;
	}
	
	public void SubTwoNumbers() {
		result = a - b;
		System.out.println("Sub of the two numbers is: " + result);
	}
	
	public void MultiplyTwoNumbers() {
		result = a * b;
		System.out.println(result);
	}
	
	// Method With parameters
	public void AddTwoNumbersWithParameter(int x, double y) {
		result = x + y;
		System.out.println("My result is " + result);
	}
	
	// Method with parameter and return type
	public double AddTwoNumbersWithParameterAndReturnType(int x, int y) {
		result = x + y;
		return result;
	}

	public static void main(String[] args) {
		
		// How we create an object is className name = className()
		Java03Methods opr = new Java03Methods();
		opr.SubTwoNumbers();
	}

}
