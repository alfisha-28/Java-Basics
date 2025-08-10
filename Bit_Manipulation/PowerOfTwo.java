package Bit_Manipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        
        /*num & (num - 1) → A power of 2 in binary has exactly one bit set (e.g., 1 → 0001, 2 → 0010, 4 → 0100).
            Subtracting 1 flips all bits after that single set bit.
            Performing AND results in 0 only if the number is a power of 2.*/
            
        if (num > 0 && (num & (num - 1)) == 0) {   
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }
        
        sc.close();
    }
}

