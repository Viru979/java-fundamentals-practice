import java.util.Scanner;
// binary number is a sequence of digits
// Toggle = flip
// Update = force


/*public class BitManipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 5-> 0101  4-> 0100

        // Question 3
        // Brian Kernighan Algorithm (INTERVIEW FAVORITE)
        // count the number of 1 bits
        int count = 0;
        while(num >0){
            num = num & (num -1); // every step removes 1 set bit
            count++;
        }
        System.out.println("Number of 1 bits: " + count);

        /* // second method
        int count =0;
        while(num > 0){
            if((num & 1) ==1){
                count++;
            }
            num = num >> 1;
        }
        System.out.println("Number of 1 bits: " + count);*/

        // Question 2
        /*// check power of 2 by removing the rightmost set bit.
        if((num & (num-1)) == 0){
            System.out.println(num + " is in power 2");
        }
        else{
            System.out.println(num + " is not in power 2");
        }*/


        // Question 1
        /*// check number is odd or even using bit
        if((1 & num) == 0){
            System.out.println( num + " is a even number.");
        }
        else{
            System.out.println(num + " is odd number");
        }
    }
}*/
public class BitManipulation {
    public String decimalToBinary(int x){
        if(x==0){
            return "0";
        }
        
        String binary = "";
        while(x>0){
            binary = x%2 + binary;
            x = x/2;
        }
        return binary;
    }
    // We traverse from right because binary powers start from 2⁰ and increase leftwards.
    public int binaryToDecimal(String x){
        int dec =0;
        int power =0;
        for(int i=x.length()-1; i>=0; i--){
            int bit = x.charAt(i)- '0';
            // dec = dec +(int)(bit * Math.pow(2,power));
            dec = dec + (bit << power);
            power++;
        }
        return dec;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BitManipulation obj = new BitManipulation();

        System.out.print("Enter the decimal value: ");
        int dec = sc.nextInt();
        System.out.println("The Binary number is: "+ obj.decimalToBinary(dec));

        System.out.print("Enter the binary value: ");
        String bin = sc.next();
        System.out.println("The decimal number is: " + obj.binaryToDecimal(bin));
    }
}




/*public class BitManipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); // 5-> 0101

        System.out.print("Enter the position: ");
        int pos = sc.nextInt();

        // System.out.print("Enter the operation(0 or 1): ");
        // int op = sc.nextInt();

        int bitMask = (1<<pos);
        // toggle bit -> it changes the bit 0 to 1 or 1 to 0 at given position without user decision.
        int newNum = (bitMask ^ num);
        System.out.println("The new number is: "+ newNum);


        /*if(op == 1){
            // SET BIT → Force the bit at a given position to 1
            int newNum = (bitMask | num);
            System.out.println("The new number is: " + newNum);
        }
        else{
            // CLEAR BIT → Set the bit at a given position to 0
            int negationMask = ~(bitMask);
            int newNum = (negationMask & num);
            System.out.println("The new number is: " + newNum);
        }*/

        /*// CLEAR BIT → Set the bit at a given position to 0
        int bitMask = 1<<pos;
        int notmask = ~(bitMask);
        int newNum = (notmask & num);
        System.out.println("The new number is: " + newNum);*/

        /*// SET BIT → Force the bit at a given position to 1
        // Step 1: Create bitMask by left shifting 1 to the desired position
        int bitMask = 1 << pos;
        int newNum = (bitMask | num);
        System.out.println("The new number is: " + newNum);*/

        /*// GET BIT → Check whether the bit at a given position is 0 or 1
        // Step 1: Create a bitMask by left shifting 1 to the desired position
        int bitMask = 1 << pos;
        if((bitMask & num) != 0){
            System.out.println("Bit is 1");
        }
        else{
            System.out.println("Bit is 0.");
        }
    }
}*/
