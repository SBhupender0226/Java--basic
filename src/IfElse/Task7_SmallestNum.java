package IfElse;

import java.util.Scanner;

public class Task7_SmallestNum {
    public static void main(String[] args) {
//        Check the smallest number from the 2 numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Both number are same.");
        }
        else if (num1<num2){
            System.out.printf("%d is the Smallest number.", num1);
        }
        else {
            System.out.printf("%d is the Smallest number.", num2);

        }


    }
}
