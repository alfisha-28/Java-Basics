// Print this pattern
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;

        //Upper Half
        for(int i=1 ; i<=n ; i++){
            //Print space
            for(int j=1 ; j <= n-i ; j++) {
                System.out.print(" ");
                }
            //Print part 1
            for(int j=1 ; j<=i ; j++) {
                System.out.print("*");
                }

            //Print part 2
            for(int j=2 ; j<=i ; j++) {
                System.out.print("*");
                }
            System.out.println();
            }
            
        //lower Half
        for(int i=n ; i>=1 ; i--){
            //Print space
            for(int j=1 ; j <= n-i ; j++) {
                System.out.print(" ");
                }
            //Print part 1
            for(int j=1 ; j<=i ; j++) {
                System.out.print("*");
                }

            //Print part 2
            for(int j=2 ; j<=i ; j++) {
                System.out.print("*");
                }
            System.out.println();
            }
            
        }   
    }

