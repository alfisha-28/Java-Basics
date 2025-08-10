package String;

public class StringBuilders {
    public static void main(String[] args) {

    // Declaration
        StringBuilder sb = new StringBuilder("Tony Stark");
        System.out.println(sb);

    // Get A Character from Index
    //Set Char
        System.out.println(sb.charAt(0));

    // Set a Character at Index
    //Get Char
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    
    // Insert a Character at Some Index
    //Insert char
        sb.insert(0, 'S');
        System.out.println(sb);

    //delete char
     sb.delete(0, 1);
     System.out.println(sb);

    //append char
     sb.append(" is Ironman");
     System.out.println(sb); 
 
    }
}
