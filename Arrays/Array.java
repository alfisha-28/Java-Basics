package Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
          sc.close();
    }
}
