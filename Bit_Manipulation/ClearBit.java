package Bit_Manipulation;

/*Clear the 3rd bit (position = 2) of a number n. (n = 0101) i.e. (n = 5)
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
            = 1*/

public class ClearBit {
    public static void main(String args[]) {
     int n = 5; //0101
     int pos = 2;
     int bitMask = 1<<pos;

     int newBitMask = ~(bitMask);
     int newNumber = newBitMask & n;
     System.out.println(newNumber);

  }
}
