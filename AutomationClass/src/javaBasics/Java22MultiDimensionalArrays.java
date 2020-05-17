package javaBasics;

public class Java22MultiDimensionalArrays {

	public static void main(String[] args) {
		// MultiDimensional Arrays
		
		/* 2 4 5 6 5
		   7 8 3 4 6
		   5 6 9 7 8 */
		//int a[] = {2,4,5,6};
		int a[][] = new int[3][5];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[0][3] = 6;
		a[0][4] = 5;
		a[1][0] = 7;
		a[1][1] = 8;
		a[1][2] = 3;
		a[1][3] = 4;
		a[1][4] = 6;
		a[2][0] = 5;
		a[2][1] = 6;
		a[2][2] = 9;
		a[2][3] = 7;
		a[2][4] = 8;
		
		
		int b[][] = {{2,4,5,6,5},{7,8,3,4,6},{5,6,9,7,0}};
		//int i;
		/*for( i = 0;i < a.length; i++) {
			System.out.println(a[i]);
		} */
		
		for(int i = 0; i < 3; i++ )
		{
			for(int j = 0; j < 5; j++) {
				System.out.println(b[i][j]);
			}
		}
		
	}

}
