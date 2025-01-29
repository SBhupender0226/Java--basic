package IfElse;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.printf("%d is Even Number.", num);
        }
        else {
            System.out.printf("%d is Odd number", num);
        }


    }
}
