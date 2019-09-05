package application;

import java.util.Scanner;

public class MatrixExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the matrix: ");
		int n = sc.nextInt();
		System.out.println();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j< mat[i].length; j++) {
				System.out.printf("Enter the %d,%d element: ",i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i<mat.length;i++) {
			System.out.print(mat[i][i]+ " ");
		}
		
		System.out.println();
		
		int count = 0;
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
			
		}
		
		System.out.println("Negative numbers = "+count);
		
		sc.close();
	}
}
