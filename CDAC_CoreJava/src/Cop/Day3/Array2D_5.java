//5:Write a Java program to accept 2D aaray elements.Display all elements.
package Cop.Day3;

import java.util.Scanner;

public class Array2D_5 {

	public static void main(String[] args) {
		int arr[][];
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.println("Enter number of row and columns: ");
		row = sc.nextInt();
		col = sc.nextInt();
		arr = new int[row][col];
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0; i<row;i++)
			for(int j=0; j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		for(int i=0; i<row;i++) {
			for(int j=0; j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println("");
		}
	}

}
