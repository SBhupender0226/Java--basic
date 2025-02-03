package IfElse.Task_1Feb;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
//        Check number is divisible by 5 and 11
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if ((num%5==0)&&(num%11==0)){
            System.out.println("Number is divisible by 5 and 11 both");
        }
        else if (num%5==0){
            System.out.println("Number is divisible by 5");
        }
        else if (num%11==0){
            System.out.println("Number is divisible by 11");
        }
        else{
            System.out.println(" Not divisible.");
        }
    }
}
