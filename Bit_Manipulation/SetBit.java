package Bit_Manipulation;

/* Get the 2nd bit (position = 1) of a number n. (n = 0101) i.e. (n = 5)
   >Step-1 --> Bit Mask : 1 < i
   >Step-2 --> Operation : OR

=> Bit Mask : here i = position = 1
              1 < 1
            = 0001 < 1
            = 0010 
   Operation : 0010 AND n
            = 0010 AND 0101
            = 0111 
            = 7 */

public class SetBit {
     public static void main(String args[]) {
      int n = 5; //0101
      int pos = 1;
      int bitMask = 1<<pos;

      int newNumber = bitMask | n;
      System.out.println(newNumber);
   }

}
