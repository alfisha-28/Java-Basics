import java.util.Scanner;

public class Operations {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter number a : ");
         int a = sc.nextInt();

         System.out.print("Enter number b : ");
         int b = sc.nextInt();

         int sum = a + b;
         int sub = a - b;
         int mul = a * b;
         int div = a / b;
         System.out.println("Addition of two numbers is : " + sum);
         System.out.println("Subtraction of two numbers is : " + sub);    
         System.out.println("Multiplication of two numbers is : " + mul);
         System.out.println("Division of two numbers is : " + div);

         sc.close();
    }
}
