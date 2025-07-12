import java.util.Scanner;

public class Sumloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        // do-while loop starts
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);  // Loop runs until user enters 0

        System.out.println("Total sum = " + sum);

        sc.close();
    }
}
