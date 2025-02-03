package IfElse.Task_1Feb;

import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {
// Find if a Person is Senior Citizen Based on Age.
        System.out.print("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt() ;
        if(age>0 && age <=12){
            System.out.println("Child");
        }
        else if (age>12 && age <=19){
            System.out.println("Teenager");
        }
        else if(age>19 && age <=64){
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior Citizen");
        }
    }
}
