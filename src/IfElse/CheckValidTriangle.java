package IfElse;

import java.util.Scanner;
import java.util.SortedMap;

public class CheckValidTriangle {
    public static void main(String[] args) {
//        Check the triangle is valid or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sides of Triangle");
        System.out.print("Side 1: ");
        int a = sc.nextInt();
        System.out.print("Side 2: ");
        int b = sc.nextInt();
        System.out.print("Side 3: ");
        int c = sc.nextInt();
        if ((a+b>c)&&(a+c>b)&&(b+c>a)){
            System.out.println("It's a Triangle.");
        }
        else {
            System.out.println("It's not a Triangle.");
        }
    }
}
