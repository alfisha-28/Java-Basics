package Functions_Methods;

import java.util.Scanner;

public class Sum_Function {
    public static int calculateSum(int a, int b) {
        int sum = a + b ;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();
        
        int sum = calculateSum(a, b);
        System.out.println("Sum of two numbers is : " + sum);

        sc.close();
    }
}


