package Cop.Day3;

import java.util.Scanner;

public class CharArrayToString_7 {

	public static void main(String[] args) {
		char ch[];
		System.out.println("Enter characters: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().toCharArray();
		
		String str = new String(ch);
		System.out.println(str);
	}
}