// Write a program that reads a number in meters, converts it to feet, and displays the result.

package Java_Journal;
import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter number n in meters (m) : ");
    double n = sc.nextDouble();

    double ft = (n * 3.28084);
    System.out.println(n + "m = " + ft + "ft");
    System.out.printf("%.2fm = %.2fft\n", n, ft);

    sc.close();

    }
}
