package IfElse;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        Check the leap Year
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if (year%4==0){
            if ((year%100==0)&&(year%400==0)){
            System.out.println("It's a Leap Year.");
            }
            else {
                System.out.println("It's not a leap year");
            }
        }
        else {
            System.out.println("It's not a leap year");
        }

    }
}
