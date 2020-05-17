package javaBasics;

class shape{
	public void draw() {
		System.out.println("Drawing a shape ...");
	}
}
class rectangle extends shape{
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
	
}

class circle extends shape{
	public void draw() {
		System.out.println("Drawing a circle");
	}
}
public class Java14ShapePolymorphism {

	
	public static void main(String[] args) {
		shape s = new rectangle();
		s.draw();
		shape s1 = new circle();
		s1.draw();

	}

}
