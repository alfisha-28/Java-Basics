// Write a program that prompts the user to enter three integers and display the integers in decreasing order.

package Java_Journal;
import java.util.*;

public class Practical5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int[] nums = new int[3];

       for(int i=0 ; i<3 ; i++){
            System.out.print("Enter integer " + (i) + ": ");
            nums[i] = sc.nextInt();
       }

        // Sort in ascending order, then reverse
        Arrays.sort(nums);
        System.out.println("Numbers in decreasing order: " + nums[2] + " " + nums[1] + " " + nums[0]);

       sc.close();
    }
}
