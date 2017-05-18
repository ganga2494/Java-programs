

import java.util.Scanner;

public class dispalym {
	public static void main(String args[]){
		int m, n, i,j;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows and columns of matrix");
	      m = in.nextInt();
	      n  = in.nextInt();
	 
	      int matrix[][] = new int[m][n];
	      
	      
	 
	      System.out.println("Enter the elements of matrix");
	 
	      for (  i = 0 ; i < m ; i++ )
	         for ( j = 0 ; j < n ; j++ )
	            matrix[i][j] = in.nextInt();
	 
	      for ( i = 0 ; i < m ; i++ )
	      {
	         for ( j = 0 ; j < n ; j++ )
	            System.out.print(matrix[i][j]+"\t");
	 
	         System.out.println();
	      }
	   }


	}


