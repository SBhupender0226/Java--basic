package PrintFormatting;

import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        sc.close();
        System.out.printf("%03d%-3d%n",num,num1);
        System.out.printf("%15s",str);
    }
}
