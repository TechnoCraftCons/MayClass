package javaBasics;

public class Java10MLInheritanceB extends Java09MLInheritanceA {
	int somePropertyB = 4500;
	public void SomeMethodB() {
		System.out.println("I am a method from class MLInheritance B");
	}
	public static void main(String[] args) {
		Java10MLInheritanceB MLB = new Java10MLInheritanceB();
		MLB.someProperty = 1500;
		System.out.println(MLB.somePropertyB);
		MLB.SomeMethod();
		MLB.SomeMethodB();

	}

}
