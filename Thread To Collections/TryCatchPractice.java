import java.util.Scanner;
// Order of the exception ->  first Child exception, later Parent exception






// Question 4
class CustomException extends RuntimeException{
    public CustomException(String msg){
        super(msg);
    }
}
public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 54, 76, 9, 80, 72, 80, 23};
        int attempts = 5;
        int count = 0;
        boolean bn = true;
        while(bn && count <attempts){
            try{
                if(count<attempts){
                    int index = sc.nextInt();
                    System.out.print("The value of index " + index + " is: " + arr[index]);
                    bn = false;
                }
            }
            catch(Exception e){
                System.out.println("Invalid index.");
                count++;
            }
        }
        if(count >= attempts){
            throw new CustomException("You crossed your maximum exception.");
        }
    }
}


/* // Question 3
public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 54, 76, 9, 80, 72, 80, 23};
        int attempts = 5;
        int count = 0;
        boolean bn = true;
        while(bn && count <attempts){
            try{
                if(count<attempts){
                    int index = sc.nextInt();
                    System.out.print("The value of index " + index + " is: " + arr[index]);
                    bn = false;
                }
            }
            catch(Exception e){
                System.out.println("Invalid index.");
                count++;
            }
        }
        if(count >= 5){
            System.out.println("Error");
        }
    }
}*/




/* // Question 2
public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try{
            if(n<0){
                throw new IllegalArgumentException();
            }

            for(int i=1; i<=n; i++){
                System.out.println(n/i);
            }
        }
        catch(IllegalArgumentException e){
            // e.printStackTrace();
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
            // System.out.print(e.toString());
        }
    }
}*/



/*// Question 1
public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt()  // syntax error
        int n = sc.nextInt();
        // for(int i=0; i >n; i++){ // logical error
        for(int i=0; i < n; i++){
            System.out.println(n/i); // Runtime Error
        }
    }
}*/



/* // creating custom exception -> unchecked exception
class CustomException extends RuntimeException{
    public CustomException(String msg){
        super(msg);  // store message in parent Exception class
    }
    @Override
    public String  toString(){
        return "CustomException: " + super.getMessage(); // getMessage() inherited (no override needed)
    }
}
public class TryCatchPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<100){
            throw new CustomException("Invalid number: " + num);
        }
    }
}*/




// when other person use this program then it gives intruction to handle it
/*// throws used in built-in method
public class TryCatchPractice {
    public static int divideTwoNumber(int a, int b){
        int c= a/b;
        return c;
    }
    public static void main(String[] args) throws Exception{ //if exception occurs then main method gives responsibility to JVM. <- forward(propagate)
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int div = divideTwoNumber(num1, num2);
        System.out.println("The division of "+ num1 + " and "+ num2 + " is: " + div);
    }
}*/




/* // creating custom exception -> checked exception without handle exception so we must Declare(throws).
class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);  // store message in parent Exception class
    }
    @Override
    public String  toString(){
        return "CustomException: " + super.getMessage(); // getMessage() inherited (no override needed)
    }
}
public class TryCatchPractice {
    public static void main(String[] args) throws CustomException{ //if exception occurs then main method gives responsibility to JVM. <- forward(propagate)
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<100){
            throw new CustomException("Invalid number: " + num);
        }
    }
}*/







/*// creating custom exception -> checked exception with Handle(try-catch) exception.
class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);  // store message in parent Exception class
    }
    @Override
    public String  toString(){
        return "CustomException: " + super.getMessage();     // getMessage() inherited (no override needed)
    }
    // I avoided overriding getMessage() to prevent redundancy and keep behavior consistent with Exception.
    // @Override
    // public String getMessage(){ // remove this because it is redundant
    //     return "CustomException: " + super.getMessage();
    // }
}
public class TryCatchPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<100){
            try{
                throw new CustomException("Invalid number: " + num);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
            finally{
                sc.close();
                System.out.println("Resources closed.");
            }
        }
    }
}*/







/* // throw keyword in build-in exception
public class TryCatchPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<100){
            try{
                throw new ArithmeticException("Learning throw keyword");
            }
            catch(Exception e){
                System.out.println(e.getMessage());

                System.out.println(e.toString());
                System.out.println(e);

                e.printStackTrace();
            }
        }
    }
}*/








/*public class TryCatchPractice {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // we used try catch block to handle runtime error and avoid program crash.
        // We use try-catch to handle runtime errors and prevent program crash.
        try{ // outer try   // input, array creation, loop
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            System.out.print("Enter the elements of array: ");
            int i=0;
            while(i<arr.length){
                arr[i] = sc.nextInt();
                i++;
            }
            System.out.print("Enter the divisor: ");
            int b = sc.nextInt();

            boolean execute = true;
            while(execute){
                System.out.print("Enter the index for divide the arrays element: ");
                int a = sc.nextInt();

                try{ // actual risky code
                    int c = arr[a]/b;
                    System.out.println("The division of is: " + c);
                    execute = false;
                }
                catch(ArrayIndexOutOfBoundsException e){ // handle invalid array index
                    System.out.println("Error: Your array index is not exist.");
                }
                catch(ArithmeticException e){ // handle division by zero
                    System.out.println("Error: Division by zero is not allowed.");
                }
                finally{// gives message
                    System.out.println("Attempts completed.");
                }
            }
        }
        catch(Exception e){// handle other exception if occurs like -: InputMismatchException, OutOfMemoryError
            System.out.println("Error : " + e);
        }
        finally{ // It close files, DataBase connection, Resources release
            sc.close();
            System.out.println("Resources closed.");
        }
    }
}*/




// Throwable = parent of everything thrown
// Error = system problems
// Exception = application problems

/*// important methods comes through Throwable class. means we got these methoda if exception occurs.
// 1️⃣ String getMessage()    -> it gives only message.
// 2️⃣ String toString()      ->it gives exception type with message.
// 3️⃣ void printStackTrace() ->it gives full error with line number Mostly used by developer for debugging.

public class TryCatchPractice {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements of aarray: ");
        int i=0;
        while(i<arr.length){
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter the index for divide the arrays element: ");
        int a = sc.nextInt();

        System.out.print("Enter the number to divide array elements: ");
        int b = sc.nextInt();

        try{
            int c = arr[a]/b;
            System.out.println("The division of is: " + c);
        }
        catch(Exception e){
            System.out.println(e.getClass()); // it gives className

            System.out.println(e.getMessage()); // it gives message

            // it gives exception type with message.
            System.out.println(e.toString()); // or System.out.println(e); because it internally call to e.toString().

            e.printStackTrace(); // it gives full error with line number Mostly used by developer for debugging.
        }
        finally{ // It close files, DataBase connection, Resources release
            sc.close();
            System.out.println("Resources closed.");
        }
    }
}*/






/*public class TryCatchPractice {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements of aarray: ");
        int i=0;
        while(i<arr.length){
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter the index for divide the arrays element: ");
        int a = sc.nextInt();

        System.out.print("Enter the number to divide array elements: ");
        int b = sc.nextInt();

        // we used try catch block to handle runtime error and avoid program crash.
        // We use try-catch to handle runtime errors and prevent program crash.
        try{ // used to test/monitor for risky code.
            int c = arr[a]/b;
            System.out.println("The division of is: " + c);
        }
        catch(ArrayIndexOutOfBoundsException e){ // // handle the exception if occurs
            System.out.println("Error: Your array index is not exist.");
        }
        catch(ArithmeticException e){ // handle the exception if occurs
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(Exception e){// handle the exception if occurs
            System.out.println("Error : " + e);
        }
        finally{ // It close files, DataBase connection, Resources release
            sc.close();
            System.out.println("Resources closed.");
        }
    }
}*/







/*public class TryCatchPractice {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        // we used try catch block to handle runtime error and avoid program crash.
        // We use try-catch to handle runtime errors and prevent program crash.
        try{ // used to test/monitor for risky code.
            int c = a/b;
            System.out.println("The division of " + a + " and " + b + " is: " + c);
        }
        catch(ArithmeticException e){ // used to handle the exception if it occurs
            System.out.println("Error: Division by zero is not allowed.");
        }
        // finally always executes (except System.exit(0)), ensuring resource cleanup.
        // System.exit(0) terminate the JVM immediately.
        finally{ // It close files, DataBase connection, Resources release
            sc.close();
            System.out.println("Resources closed.");
        }
    }
}*/
