package javaBasics;

public class Java06Arrays {

	public static void main(String[] args) {
		// Exception concept
		// We have two types of exceptions or errors 1. Runtime exception 2. compile time exception
        String fisrtName = "Nebyou";
        String lastName = "Getaneh";
        
        String name[] = {"Nebyou", "Getaneh","Ezana","Manny","Henok"};
        //System.out.println(name[3]);
        
        // There are two ways of declaring arrays
        // We declare them with allocated values
        // Arrays are collection of objects
        int a[] = new int[5];
        a[0] = 23;
        a[1] = 100;
        a[2] = 25;
        a[3]= 87;
        //a[4] = 102;
        //System.out.println(a[4]);
        
        // The system will allocate the memory automatically
        int b[] = {23,100,4,56};
        //System.out.println(b[2]);
        
        // Single Dimensional array
         int num[] = {45,89,56,54,87,4566};
        // System.out.println(num.length);
         // i < 5
        for(int i =0; i < num.length; i++) {
        	System.out.println(num[i]);
        }
        
        
        
	}

}
