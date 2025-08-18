/*Bubble Sort
Idea: if arr[j] > arr[j+1] swap them. To place the element in their respective position, we have to do the following operation N-1 times. 
Time Complexity: O(N^2)
 */

package Sorting;

public class BubbleSorting {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 3, 7, 9, 2, 1, 5};
 
        // Time Complexity = O(n^2)
        // BubbleSort
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length-i-1; j++) {
                  if(arr[j] > arr[j+1]) {
                    // Swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                           
                  }
            }
        }

        printArr(arr);
    }
}
