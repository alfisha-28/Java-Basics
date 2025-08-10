package Bit_Manipulation;

/*Update the 2nd bit (position = 1 ) of a number n to 1. (n = 0101) i.e. (n = 5)
For 1 => (Set Bit)
>Step-1 --> Bit Mask : 1 << i
>Step-2 --> Operation : OR
=> Bit Mask : here i = position = 1
              1 < 1
            = 0001 < 1
            = 0010 
   Operation : 0010 AND n
            = 0010 AND 0101
            = 0111 
            = 7

For 2 => (Clear Bit)
>Step-1 --> Bit Mask : 1 << i
>Step-2 --> Operation : AND with NOT
=> Bit Mask : here i = position = 1
              1 < 2
            = 0001 < 2
            = 0100 
   Operation :  
              ~ (0100) --> 1011
            = 1011 AND 0101
            = 0001 
            = 1 */

import java.util.Scanner;

public class UpdateBit {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int opr = sc.nextInt();
       // opr=1 -> set; opr=0 -> clear
      int n = 5;
      int pos = 1;
     
      int bitMask = 1<<pos;

      if(opr == 1) {
          //set
          int newNumber = bitMask | n;
          System.out.println(newNumber);
          } else {
       //clear
       int newBitMask = ~(bitMask);
       int newNumber = newBitMask & n;
       System.out.println(newNumber);
      }
     
      sc.close();
   }

}
