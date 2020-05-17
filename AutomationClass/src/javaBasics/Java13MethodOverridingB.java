package javaBasics;

public class Java13MethodOverridingB extends Java12MethodOverriding {

	public void Method1(int a) {
		System.out.println("This is a method from child class " + a);
	}
	public static void main(String[] args) {
		// If a sub class have the same method name and same parameter it is call method overriding
		
		Java13MethodOverridingB MOB= new Java13MethodOverridingB();
		MOB.Method1(10);
		
		Java12MethodOverriding MO = new Java12MethodOverriding();
		MO.Method1(10);

	}

}
