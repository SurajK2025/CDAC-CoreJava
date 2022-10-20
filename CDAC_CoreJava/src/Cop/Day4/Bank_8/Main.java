package Cop.Day4.Bank_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements you want in an array");
        int size=sc.nextInt();
        Bank a[]=new Bank[size];
        int index=0;
        int choice;
        do{
            System.out.println("enter 1 to display info, enter 2 to deposit, enter 3 to withdraw, enter 4 checkbalance");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    index++;
                    a[index]=new Bank();
                    System.out.println("enter your name and balance you want to enter");
                    a[index].acceptUser(sc.next(), sc.nextInt());
                    break;

                case 2:
                    a[index].DisplayInfo();
                    break;

                case 3:
                    a[index].withdraw(sc.nextInt());
                    break;

                case 4:
                    a[index].deposit(sc.nextInt());
                    break;

                case 5:
                    a[index].checkBalance();
                    break;
            }
        }while(choice!=5);
    }
}