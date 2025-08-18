/*Idea: The inner loop selects the minimum element in the unsorted array and places the elements in increasing order. 
Time complexity: O(N2) 
 */

package Sorting;

public class SelectionSort {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6, 4, 3, 7, 9, 2, 1, 5};

        //SelectionSort
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }
}
