import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number x : ");
        int x = sc.nextInt();

        if(x%2 == 0){
            System.out.println("Number is Even");
        } else if (x%2 != 0){
            System.out.println("Number is Odd");
        } else {
            System.out.println("Wrong Input");
        }
        
         sc.close();
    }
    
}
