package IfElse;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if (age <= 0){
            System.out.println("Please enter Valid age.");
        }
        else if (age>=18){
            System.out.println("You are eligible for voting.");
        }
        else {
            System.out.println("You are not Eligible for the voting.");
        }
    }
}
