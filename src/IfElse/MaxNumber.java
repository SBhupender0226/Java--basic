package IfElse;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.printf("%d number is max.",num1);
        }
        else {
            System.out.printf("%d number is max.",num2);

        }


    }
}
