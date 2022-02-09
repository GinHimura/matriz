package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Project {
   public static void main(String args[]) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter matrix row and column values:");
	   int n = sc.nextInt();
	   int m = sc.nextInt();
	   
	   System.out.println("\nEnter array values");
	   int [][] mat = new int[n][m];
	   
	   for(int i = 0; i < mat.length; i++) {
		   for(int j = 0; j < mat[i].length; j++) {			   
			   mat[i][j] = sc.nextInt();
		   }
	   }
	  
	   System.out.print("\nEnter a number entered in the matrix to know your neighbors: ");
	   int number = sc.nextInt();
	   for(int i = 0; i < mat.length; i++) {
		   for(int j = 0; j < mat[i].length; j++) {			   
			   if(number == mat[i][j]) {
				   System.out.println("Position " + i + "," + j + ":");
				   if(j != 0) {
				       System.out.println("Left: " + mat[i][(j - 1)]);
				   }
				   
				   if(j < (m - 1)) {
					   System.out.println("Right: " + mat[i][j + 1]);
				   }
				   
				   if(i != 0) {
					   System.out.println("Up: " + mat[i - 1][j]);
				   }
				   
				   if(i < (n - 1)) {
					   System.out.println("Down: " + mat[i + 1][j]);
				   }	   
			   }	   
		   }
	   }
	   sc.close();
   }
}