package Bit_Manipulation;

/*Get the 3rd bit (position = 2) of a number n. (n = 0101) i.e. (n = 5)
   >Step-1 --> Bit Mask : 1 < i
   >Step-2 --> Operation : AND

=> Bit Mask : here i = position = 2
              1 < 2
            = 0001 < 2
            = 0100 
   Operation : 0100 AND n
            = 0100 AND 0101
            = 0100
            = Non-zero
            = 4 */

public class GetBit {
   public static void main(String args[]) {
      int n = 5; //0101
      int pos = 2;
      int bitMask = 1<<pos;

    //   if((bitMask & n) == 0) {
    //       System.out.println("bit was zero");
    //   } else {
    //       System.out.println("bit was one");
    //   }

    int newNumber = bitMask & n;
      System.out.println(newNumber);
   }
}


