package Cop.Day3;

import java.util.Scanner;

public class ArrayMinMax_3 {

	public static void main(String[] args) {
		int size, arr[];
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		arr = new int[size];
		
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();
		
		int min = arr[0], max = arr[0];
		
		for(int i=0; i<size; i++)
			if(min > arr[i])
				min = arr[i];
	
		for(int i=0; i<size; i++)
			if(max < arr[i])
				max = arr[i];
		
		System.out.println("Minimum: "+min);
		System.out.println("Maximum: "+max);
	}
}