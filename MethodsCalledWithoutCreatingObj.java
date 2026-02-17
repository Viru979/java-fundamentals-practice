import java.util.Scanner;
import java.util.Arrays;
// Methods make programs clean, reusable, and easy to understand.

public class MethodsCalledWithoutCreatingObj{
    
    public static void changeValue(int num){
        num = 12;
        return;
    }
    public static void changeArray(int marks[]){
        marks[0] = 5;
        return;
    }
    public static void changeReassignArray(int marks[]){
        marks = new int[]{12, 42, 63, 5, 70}; // change Only reference of copy, not Original array.
    }

    public static void main(String[] args){
        int num = 32;
        changeValue(num);
        System.out.println("The value of num after running changeValue is: "+num); // value not change but in case of array value changed
        int arr[] = {23, 54, 65, 12, 3, 17, 79}; // here arr is a referece
        changeArray(arr); // giving address
        //Java is pass-by-value. In case of objects and arrays, the value passed is the reference
        System.out.print("The value of first element of the array after running changeArray is: " + arr[0]); // value changed successfully.
        changeReassignArray(arr);
        System.out.print("The array after running(reassinging) changeReassignArray is: " + Arrays.toString(arr));

    }
    
    
    
    /*public static void checkEvenOdd(int num){
        if(num%2==0){
            System.out.print("The number is even.");
            return;
        }
        else{
            System.out.print("The number is odd.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkEvenOdd(num);
    }



/*public static int calculateFactorial(int num){
    if(num<0){
        System.out.print("Please, Enter a valid number.");
        return -1;
    }
    int fact = 1;
    for(int i=num; i>0; i--){
        fact *= i;
    }
    return fact;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = calculateFactorial(num);
        if(fact != -1){
            System.out.print("the factorial of "+ num + " is: " + fact);
        }
    }


   /* public static float addTwoNumber(float x, float y){
        float sum = x + y;
        return sum;
    }
    public static float calculateProduct(float m, float n){
        float s = m * n;
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float product = calculateProduct(a, b);
        System.out.println("The product of two number is: " + product);

        float result = addTwoNumber(a, b);
        System.out.print("the sum of "+ a + " and " + b + " is: " + result);

    }
    
    
    /*public static void myName(String name){
        System.out.println("My name is: "+ name);
        return;  // optional not required
    }

    public static String printMyName(String name){
        //System.out.print("My name is:"+ name);   <- this is bad we can't do this again.
        return "My name is:"+ name; //<- this is right approach
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nm = sc.nextLine();
        
        myName(nm); //A void method prints the output directly.
        printMyName(nm); //A method with a return type sends the value back to the caller.    no output shows
        //so it must be printed or stored explicitly.
        System.out.print(printMyName(nm)); // print output*/
    
}
