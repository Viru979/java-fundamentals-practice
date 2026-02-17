import java.util.Scanner;

/*First, I handle numbers less than or equal to one.
Then I check divisibility from 2 to square root of the number.
If any divisor exists, the number is not prime.
Otherwise, it is prime. */
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<=1){
            System.out.print("This number " + num + " is not a prime number.");
            sc.close();//please close resources before exit  at any path to avoid resource leaks.
            return;
        }
        for(int i=2; i*i<=num; i++){ // for optimized approach
            if(num%i==0){
                System.out.print("this number " + num + " is not a prime number but this is a composite number.");
                sc.close();
                return;
            }
        }
        System.out.print("this number "+ num + " is a prime number.");
        sc.close();
    }
}
