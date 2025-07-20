package Java_Journal;

import java.util.Scanner;

public class Practical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = sc.next().toLowerCase().charAt(0); // Convert to lowercase

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter an alphabet letter.");
        } else if ("aeiou".indexOf(ch) != -1) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        sc.close();
    }
}

