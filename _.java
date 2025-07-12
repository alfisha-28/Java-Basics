import java.util.Scanner;

public class A_ {
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
         System.out.print("Addition of two numbers is : " + sum);
         System.out.print("Subtraction of two numbers is : " + sub);    
         System.out.print("Multiplication of two numbers is : " + mul);
         System.out.print("Division of two numbers is : " + div);

         sc.close();
    }
}
