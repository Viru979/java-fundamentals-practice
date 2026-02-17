import java.util.Scanner;
import java.util.Arrays;
// Local variables Java me default value nahi lete.
// If one operand of + is a String, Java performs string concatenation.
// 'A' = 65
// 'a' = 97


public class SubString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        /* // reverse the string using char Array
        // method 1
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int len = ch.length;
        char temp;
        for(int i=0; i<len/2; i++){
            temp = ch[i];
            ch[i] = ch[len-i-1];
            ch[len-i-1] = temp;
        }
        System.out.println(ch);*/

        
        /*// method 2
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int i=ch.length -1; i>=0; i--){
            System.out.print(ch[i]);
        }*/
        

        
        /* // method 3
        // reverse string using loop with string operation
        String str = sc.nextLine();
        String revStr = "";
        for(int i=str.length()-1; i >= 0; i--){
            revStr = revStr + str.charAt(i);
        }
        System.out.println(revStr);*/



        /*String email= sc.nextLine();
        String username = ""; //aur Java is not allowed to use local variable without initialization.
        // int lastIndex = email.indexOf("@");
        // username = email.substring(0, lastIndex);
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);*/



/*public class SubString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String orgStr = sc.nextLine();
        // String result = orgStr.replace("e","i");
        // System.out.println(orgStr);
        // System.out.println(result);
        String result = "";
        for(int i=0; i<orgStr.length(); i++){
            if(orgStr.charAt(i) == 'e'){ // .equals() use only for non-primitive(object -> int, string etc.) data.
                result = result + 'i'; // internally implicit type conversion by java. result = result + String.valueOf('i');
            }
            else{
                result =result + orgStr.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
        
        
        // total length of string in array
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine(); // Required when reading a String using nextLine() after nextInt() or other numeric input.
        String str[] = new String[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<str.length; i++){
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
        int totallen = 0;
        for(int i=0; i<str.length; i++){
            totallen= totallen + str[i].length();
        }
        System.out.println("Total length of th array is: "+ totallen);
        
        
        
        /*int num = 979299;
        String nm = Integer.toString(num);
        System.out.println(nm);
        
        
        // String to integer
        String str = "2861";
        int number = Integer.parseInt(str);
        System.out.println(number);
        
        // substring
        String intro = "My name is Viru.";
        String name = intro.substring(11, intro.length());
        System.out.println(name);

        // compare
        String name1 = "Viru";
        String name2 = "Vinu";
        System.out.println(name1.equals(name2)); // content/value compare
        System.out.println(name1 == name2 ); // reference compare

        // Lexicographical order
        // s1 > s2 : +ve value
        // s1 == s2 : 0(Zero)
        // s1 < s2 : -ve value
        System.out.println(name1.compareTo(name2));



        /*
        String intro = "     Hello, Good Morning sir, thankyou for giving me this opertunity to introduce myself. I am Virendra Maurya. ";
        intro = intro.strip(); // we can't modify original string
        // The strip() method returns a new String which is reassigned to 'intro'.
        // The original String remains unchanged and becomes eligible for garbage collection.
        System.out.println(intro);

        // string traversal
        for(int i=0; i<intro.length(); i++){
            System.out.println(intro.charAt(i));
        }

        // concatenation
        String firstName = "Viru";
        String lastName = "Don";

        String name = firstName + "@" + lastName;  // @ is automatically deleted from memory after execurion of this line

        firstName.concat(" Don"); // value is not stored
        System.out.println(firstName);

        firstName = firstName.concat(lastName); // WITHOUT SPACE
        firstName = firstName.concat(" ").concat(lastName); // WITH SPACE or  firstName + " " + lastName; 
       */
    }
}



// public class SubString{
//     public static void main(String[] args){
//         String str = " Hello  I am learning String in java.    ht";
//         int len = str.length();
//         String uprcs = str.toUpperCase();
//         String lwrcs = str.toLowerCase();
//         String trm = str.trim();
//         System.out.println(len);
//         System.out.println(uprcs);
//         System.out.println(lwrcs);
//         System.out.println(trm);
//         System.out.println(str.substring(3));
//         System.out.println(str.substring(3, 10));
//     }
// }