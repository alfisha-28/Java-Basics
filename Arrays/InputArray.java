package Arrays;

import java.util.Scanner;

public class InputArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0 ; i<size; i++){
            System.out.print("Enter array element" + " " + i + " :");
            numbers[i] = sc.nextInt();
            }
        
        System.out.print("Enter value of x : ");
        int x = sc.nextInt();

        for(int i=0 ; i<size; i++){
            if(numbers[i] == x){
                System.out.print("X found at index " + i);
            } 
        }
        sc.close();
    }
}
