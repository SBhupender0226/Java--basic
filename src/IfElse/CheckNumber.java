package IfElse;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num==0){
            System.out.printf("%d is neither positive nor negative", num  );
        }
        else if (num>0){
            System.out.printf("%d is Positive number", num  );
        }
        else {
            System.out.printf("%d is Negative number", num  );
        }
    }
}
