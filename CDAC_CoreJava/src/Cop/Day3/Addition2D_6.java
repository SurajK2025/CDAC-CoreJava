//Write a java program to make the addition of two 2D array And store result in Third array.

package Cop.Day3;

import java.util.Scanner;

public class Addition2D_6 {

	public static void main(String[] args) {
		int arr1[][],arr2[][];
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.println("Enter number of rows and columns for both the array: ");
		row = sc.nextInt();
		col = sc.nextInt();
		arr1 = new int[row][col];
		arr2 = new int[row][col];


		System.out.println("Enter the elements of the array for arr1");

		for(int i=0; i<row;i++)
			for(int j=0; j<col;j++)
			{
				arr1[i][j] = sc.nextInt();
			}


		System.out.println("Enter the elements of the array for arr2");

		for(int i=0; i<row;i++)
			for(int j=0; j<col;j++)
			{
				arr2[i][j] = sc.nextInt();
			}





		for(int i=0; i<row;i++) {
			for(int j=0; j<col;j++)
			{
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			}	
			System.out.println("");
		}
	}



}


