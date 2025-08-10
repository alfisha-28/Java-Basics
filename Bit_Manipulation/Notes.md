Positions --> For example : 0101 = > positions = 3210

**Get Bit**

1. Get the 3rd bit (position = 2) of a number n. (n = 0101) i.e. (n = 5)
   >Step-1 --> Bit Mask : 1 << i
   >Step-2 --> Operation : AND

=> Bit Mask : here i = position = 2
              1 < 2
            = 0001 < 2
            = 0100 
   Operation : 0100 AND n
            = 0100 AND 0101
            = 0100
            = Non-zero
            = 1

2. Get the 3rd bit (position = 3) of a number n. (n = 0101) i.e. (n = 5)
   >Step-1 --> Bit Mask : 1 << i
   >Step-2 --> Operation : AND

=> Bit Mask : here i = position = 3
              1 < 3
            = 0001 < 3
            = 1000 
   Operation : 1000 AND n
            = 1000 AND 0101
            = 0000
            = Zero
            = 0 

**SET Bit**
Set the 2nd bit (position = 1) of a number n. (n = 0101) i.e. (n = 5)
   >Step-1 --> Bit Mask : 1 << i
   >Step-2 --> Operation : OR

=> Bit Mask : here i = position = 1
              1 < 1
            = 0001 < 1
            = 0010 
   Operation : 0010 OR n
            = 0010 OR 0101
            = 0111 
            = 7

**Clear Bit**
Clear the 3rd bit (position = 2) of a number n. (n = 0101) i.e. (n = 5)
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
            = 1

**Update Bit**
Update the 2nd bit (position = 1 ) of a number n to 1. (n = 0101) i.e. (n = 5)
For 1 =>  
>Step-1 --> Bit Mask : 1 << i
>Step-2 --> Operation : OR

For 2 =>
>Step-1 --> Bit Mask : 1 << i
>Step-2 --> Operation : AND with NOT
