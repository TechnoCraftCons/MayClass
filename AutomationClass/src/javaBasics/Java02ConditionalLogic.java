package javaBasics;

public class Java02ConditionalLogic {

	public static void main(String[] args) {
		
		Java03Methods methods = new Java03Methods();
		methods.AddTwoNumbers();
		methods.AddTwoNumbersWithParameter(1, 1);
		double returnParameterValue = methods.AddTwoNumbersWithParameterAndReturnType(12, 10);
		System.out.println("My return value is " + returnParameterValue);
		 double firstNumber = 45;
		 double secondNumber = 0;
		 double result;
		 
		 if (secondNumber > 0) {
			 result = firstNumber / secondNumber;
			 System.out.println(result);
		 }
		 else {
			 System.out.println("We can not divide a number by Zero");
		 }

	}

}
