package Cop.Day3;

import java.util.Scanner;
public class MenuDriven_9 {	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		boolean flag=false;

		int[]arr= new int[5];
		System.out.println("Menu:1.read array 2:Print Array 3:Search element in array");
		System.out.println("4:Reverse Array 5:Even number from array6:sum of array element");
		System.out.println("6.Exit");

		do
		{
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the 5 elements of array");
				for(int i=0;i<arr.length;i++)
					arr[i]=sc.nextInt();
				break;

			case 2:
				for(int n:arr)
					System.out.print(n +" ");
				break;

			case 3:
				System.out.println("Enter the element for searching");
				int num =sc.nextInt();

				for(int key:arr)
				{
					if(key==num)
						flag=true;
				}
				if(flag)
					System.out.println("Number is present");
				else
					System.out.println("Number is not present");
				break;

			case 4: System.out.println("Elements in reverse order");
			for(int i=arr.length-1;i>=0;i--)
				System.out.print(arr[i]+" ");
			break;

			case 5:System.out.println("The even elements of array are:");
			for(int element:arr)
			{
				if(element%2==0)
					System.out.println(element+" ");
			}
			break;

			case 6:
				int sum=0;
				for(int i=0;i<arr.length;i++)
				{
					sum=sum+arr[i];
				}
				System.out.println("sum" + sum);
				break;
			default:
				System.out.println("exit");
			}
		}while(choice!=7);							
	}
}