package Functions_Methods;

import java.util.Scanner;

public class Factorial {
    public static void calculateFact(int n) {
       
       int factorial = 1;
       if (n <= 0){
        System.out.println("Invalid");
        return;
       } else{
        for(int i = 1; i<=n; i++){
           factorial = factorial * i;
            }   
        System.out.println("Factorial of" + " " + n + " " + "is" + " " + factorial + ".");
        return;
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n : ");
        int n = sc.nextInt();
        
        calculateFact(n);

        sc.close();
    }
}
