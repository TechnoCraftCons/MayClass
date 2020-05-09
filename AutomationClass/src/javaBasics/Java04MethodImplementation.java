package javaBasics;

public class Java04MethodImplementation {

	public static void main(String[] args) {
		Java03Methods method = new Java03Methods();
		method.SubTwoNumbers();
		method.MultiplyTwoNumbers();
		double returnValue =method.AddTwoNumbersWithReturnType();
		System.out.println("The return value of the method is" + returnValue);
		
		method.AddTwoNumbersWithParameter(12,10.25);
		double returnParameterValue = method.AddTwoNumbersWithParameterAndReturnType(12, 10);
		System.out.println("My return value of the method with parameter is " + returnParameterValue);
		

	}

}
