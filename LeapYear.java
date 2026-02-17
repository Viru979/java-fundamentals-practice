import java.util.Scanner;
/*A leap year is divisible by 400,
or it is divisible by 4 but not divisible by 100 Because every 100 years is not a leap year,
That is why I used modulo operator with logical operators */
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if((year %400 == 0) || (year%4 == 0 && year%100 != 0)){
            System.out.print("Leap Year.");
        }
        else{
            System.out.print("Not a Leap year.");
        }
        sc.close();
    }
}
