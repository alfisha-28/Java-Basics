//Print this pattern
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
public class Pattern10 {
    public static void main(String[] args) {
        int n = 4;
        
        // Upper half
        for(int i=1 ; i<=n ; i++){

             //Print part 1
            for(int j=1 ; j<=i ; j++) {
                System.out.print("*");
                }
            int space = 2 * (n - i);

            //Print space
            for(int j=1 ; j <= space ; j++) {
                System.out.print(" ");
                }

            //Print part 2
            for(int j=1 ; j<=i ; j++) {
                System.out.print("*");
                }
            System.out.println();
            }
            
         // Lower half
        for(int i=n ; i>=1 ; i--){

             //Print part 3
            for(int j=1 ; j<=i ; j++) {
                System.out.print("*");
                }
            int space = 2 * (n - i);

            //Print space
            for(int j=1 ; j <= space ; j++) {
                System.out.print(" ");
                }

            //Print part 4
            for(int j=1 ; j<=i ; j++) {
                System.out.print("*");
                }
            System.out.println();
            }
        }   
    }
