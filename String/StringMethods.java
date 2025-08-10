package String;

public class StringMethods {
    public static void main(String args[]) {
    
     // Declaration
       String firstName = "Tony";
       String secondName = "Stark";

    //Concatenation (Joining 2 strings)
       String fullName = firstName + " " + secondName;
       System.out.println(fullName);

    // Print length of a String
       System.out.println(fullName.length());

    // Access characters of a string
        for(int i=0; i<fullName.length(); i++) {
           System.out.println(fullName.charAt(i));
       }

    // The substring of a string is a subpart of it.
       String name = "TonyStark";
       System.out.println(name.substring(0, 4));
        
    // ParseInt Method of Integer class
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);

    // ToString Method of String class
       int numbers = 123;
       String strs = Integer.toString(numbers);
       System.out.println(strs.length());


    // Note :
    // ALWAYS REMEMBER ---> Java Strings are Immutable.

    }
}