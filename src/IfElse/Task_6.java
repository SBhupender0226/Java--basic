package IfElse;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
//        Programme to find the Largest of Three Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3 : ");
        int num3 = sc.nextInt();
        if ((num1==num2)&&(num1==num3)){
            System.out.println("All Three number are Equal.");
        }
        else if ((num1>=num2)&&(num1>=num3)){
            System.out.printf("%d number is Largest", num1);
        }
        else if ((num2>=num1)&&(num2>=num3)){
            System.out.printf("%d number is Largest", num2);
        }
        else{
            System.out.printf("%d number is Largest", num3);
        }

    }
}
