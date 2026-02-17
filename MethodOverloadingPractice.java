import java.util.Scanner;


// Overloading requires the same method name with different parameters and return type can be anything.
public class MethodOverloadingPractice{

    public static int plusMethod(int x, int y){
        int z = x + y;
        return z;
    }
    public static int plusMethod(int x, float y){
        int z = x + (int) y;
        return z;
    }
    public static float plusMethod(float x, float y){
        float z = x * y;
        return z;
    }
    public static float plusMethod(float x, int y){
        float z = x + y +1;
        return z;
    }
    public static float plusMethod(float a, float b, int c){
        float z = a + b + c;
        return z;
    }


    public static void main(String[] args){
        int sum = plusMethod(2, 3);
        int add = plusMethod(2, 3.5f);
        float mul = plusMethod(2.5f, 3.0f);
        float onePlus = plusMethod(2.5f, 3);
        float threePlus = plusMethod(2.5f, 3.5f, 6);
        System.out.println("The sum of two number with  both integer type is: "+sum);
        System.out.println("The sum of two number with one integer and one float type is: "+add);
        System.out.println("The mul of two number with both float type is: "+mul);
        System.out.println("The sum of two number with one float and one integer type is: "+onePlus);
        System.out.println("The sum of three number with all float type is: "+threePlus);
        
    }
}

    /*public static void checkPrime(int num){
        if(num<=1){
            System.out.println("The given number "+ num+ " is not a prime number.");
            return;
        }
        for(int i=2; i*i<= num; i++){
            if(num%i==0){
                System.out.print(("The given number "+ num+ " is not a prime number.");
                return;
            }
        }
        System.out.print("The given number "+ num+ " is a prime number.")
    }

    public static void main(String[] args){
        checkPrime(9);
    }
}*/