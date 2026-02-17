import java.util.Scanner;


public class RecursionPractice {

    public static int calculatePower(int x, int n){
        if(x == 0){ // base case
            return 0;
        }
        if(n == 0){ // base case
            return 1;
        }
        return x * calculatePower(x, n-1);

    }

    // calculate exponential(x^n or x ki power n) using recursion. where n= stack height
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int expo = calculatePower(num, pow);
        System.out.print(expo);

    }

    /*public static int printFavonacciTerm(int n){
        if(n==1 || n ==2){
            return n-1;
        }
        return printFavonacciTerm(n-1) + printFavonacciTerm(n-2);
    }
    // print nth term of fabonacci series
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int term = printFavonacciTerm(n);
        System.out.print("The "+ n+"th term of favonacci is: "+ term);
    }
    public static int printFavonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }
        return printFavonacci(num -1) + printFavonacci(num -2);
    }
    // print fabonacci series
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            System.out.print(printFavonacci(i) + " ");
        }
    }
    
    
    
    /* public static int sumOfNaturalNum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + sumOfNaturalNum(n-1);
        }
        
    }
    // sum of n natural numbers
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(sumOfNaturalNum(num));

    }

    /*public static int factorialRecusion(int num){
        if(num<0){
            System.out.print("invalid number.");
            return -1;
        }
        if(num==0 || num ==1){
            return 1;
        }
        else{
            return num * factorialRecusion(num-1);
        }
    }

    public static int factorialIterative(int num){
        int fact = 1;
        if(num<0){
            System.out.print("invalid number.");
            return -1;
        }
        else if(num==0 || num ==1){
            return fact;
        }
        else{
            for(int i= num; i<=1; i--){
                fact *= i;
            }
            return fact;

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("THe factorial of "+ n + " is: "+ factorialIterative(n));
        System.out.println("THe factorial of "+ n + " is: "+ factorialRecusion(n));

    }*/
}
