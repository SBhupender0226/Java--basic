package IfElse;

import java.util.Scanner;

public class task_23 {
    public static void main(String[] args) {
//        Convert Days into Years, Months, and Days.
        System.out.print("Enter the number of days: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int year=(num/365);
//        System.out.println("year: "+ year);
        if (year>0){
            num = num - (year*365);
        }
        int mnth = num/30;
        if (mnth>0){
            num = num - (mnth*30);
        }
        System.out.println(year+" Year "+mnth +" month " + num +" days");

    }
}
