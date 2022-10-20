package Cop.Day3;

import java.util.Scanner;

public class ArrayConcat_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st array size ");
		int size1 = sc.nextInt();
		System.out.println("Enter 2nd array size ");
		int size2 = sc.nextInt();
		
		int size3 = size1 + size2;
		int arr1 [] = new int[size1] ;
		int arr2 [] = new int[size2];
		int arr3 [] = new int[size1+size2];
		
		System.out.println("Enter the elements of 1st array: ");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of 2nd array: ");
		for(int j=0;j<size2;j++)
		{
			arr2[j]=sc.nextInt();

		}
		for(int i=0;i<size1;i++)
		{
			arr3[i]=arr1[i];
			System.out.print(arr3[i]+" ");

		}
		
		for(int j=0; j<size2; j++)
		{
			arr3[size1+j]=arr2[j];
			System.out.print(arr3[size1+j]+ " ");
		}
	}

}
