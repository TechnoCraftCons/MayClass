package javaBasics;

public class Java05Strings {

	public static void main(String[] args) {
		//There are two ways of declaring a string
		
		//The first way
		String name = "Nebyou Getaneh";
		char a = 's';
		
		System.out.println(name);
		
		
		// The second way by creating an object of the string class
		
		String str = new String("Nebyou123");
		
		System.out.println(str);
		
		// I want the the 5th character on the name
		char index = name.charAt(2);
		System.out.println("The nth character is " + index);
		
		// I want the index of the character
		int indexof = name.indexOf("u");
		System.out.println("Index of the character is " + indexof);
		
		boolean ends = name.endsWith("h");
		//System.out.println(ends);
		
		if(ends == true) {
			System.out.println(" the char u exists at the end of the string");
		}
		else if(ends == false) {
			System.out.println(" the char u doesn't exist at the end of the string");
		}
		
	String nameValue = name.toUpperCase();
	System.out.println(nameValue);
	
	String nameLower = name.toLowerCase();
	System.out.println(nameLower);
	
		int nameLength = name.length();
		System.out.println(nameLength);
		

	}

}
