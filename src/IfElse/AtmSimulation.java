package IfElse;

import java.util.Scanner;

public class AtmSimulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double balance = 10000;
        System.out.print("Enter the amount you want to withdraw : ");
        double withdraw = sc.nextDouble();
        if((withdraw>0)&&(withdraw%100==0)){
            if (withdraw<=balance){
                balance = balance-withdraw;
                System.out.printf("Withdraw Successful! Remaining Balance is : %.2f",balance);
            }
            else {
                System.out.println("Insufficient Balance.");
            }
        }
        else {
            System.out.println("Please enter the Amount in the multiple of 100");
        }

    }
}
