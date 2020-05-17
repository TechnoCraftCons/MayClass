package javaBasics;

public class Java12MethodOverLoading {
	int result;
	int a = 10;
	int b = 20;
	int c = 30;
	
	public void Add() {
		result = a + b+ c;
		System.out.println(result);	
	}
	
	public void Add(int x, int y) {
		result = x + y;	
		System.out.println("With int parameter " +result);	
	}

	public void Add(double d, double f) {
		double result = d + f;
		System.out.println("With double parameter" +result);	
	}
	
	public void Add(int x, int y, int z) {
		result = x + y + z ;
		System.out.println(result);
	}
	public static void main(String[] args) {
		// Method Overloading can have the same method name but with different parameters
		
		Java12MethodOverLoading MOL = new Java12MethodOverLoading();
		MOL.Add();
		MOL.Add(14, 28);
		MOL.Add(14.0, 28.0);
		
	}

}
