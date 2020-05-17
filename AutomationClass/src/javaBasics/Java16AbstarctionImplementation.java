package javaBasics;

public class Java16AbstarctionImplementation extends Java15Abstraction {

	public static void main(String[] args) {
		Java16AbstarctionImplementation AI = new Java16AbstarctionImplementation();
		AI.Method1();
		AI.Method2();
		AI.Method3();

	}

	@Override
	public void Method1() {
		System.out.println("This is my Method");	
	}
	
	public void Method2() {
		System.out.println("This is my method2");
	}

}
