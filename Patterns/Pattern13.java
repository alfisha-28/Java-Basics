// Print this pattern
//     1
//    212
//   32123
//  4321234
// 543212345

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

         for(int i=1 ; i<=n ; i++){
            //Print space
            for(int j=1 ; j <= n-i ; j++) {
                System.out.print(" ");
                }
            //Print part 1
            for(int j=i ; j>=1 ; j--) {
                System.out.print(j);
                }
            
            //Print part 2
            for(int j=2 ; j<=i ; j++) {
                System.out.print(j);
                }
            System.out.println();
            }
         
    }
}