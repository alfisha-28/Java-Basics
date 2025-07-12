import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read a full line

        System.out.print("Enter your age: ");
        int age = sc.nextInt();       // Read an integer

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble(); // Read a decimal

        System.out.println("\nHello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is " + gpa);

        sc.close(); // Always close the scanner
    }
}
