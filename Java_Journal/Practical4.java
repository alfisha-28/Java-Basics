// Write a program to print inputs given from command line arguments on the console.

package Java_Journal;

public class Practical4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
