package IfElse;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character: ");
        char letter = sc.next().charAt(0);
        char lowerLetter = Character.toLowerCase(letter);
        if ((lowerLetter=='a')||(lowerLetter=='e')||(lowerLetter=='i')||(lowerLetter=='o')||(lowerLetter=='u')){
            System.out.printf("%c is a Vowel.", letter);
        }
        else {
            System.out.printf("%c is a Consonant", letter);
        }
    }
}
