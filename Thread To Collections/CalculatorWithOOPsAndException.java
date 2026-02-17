import java.util.Scanner;


// Exercise 6: You have to create a custom calculator with following operations
// + → Addition
// - → Subtraction
// * → Multiplication
// / → Division
// which throws the following exceptions:
// Invalid input Exception e.g.: 8 & 9 where & is not any operator
// Cannot divide by 0 Exception
// Max Input Exception if any of the inputs is greater than 100000
// Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000



class MaxInputException extends Exception{
    public MaxInputException(String msg){
        super(msg);
    }
}
class InvalidInputException extends Exception{
    public InvalidInputException(String msg){
        super(msg);
    }
}
class MaxMultiplierReachedException extends Exception{
    public MaxMultiplierReachedException(String msg){
        super(msg);
    }
}
class CannotDivideByZeroException extends Exception{
    public CannotDivideByZeroException(String msg){
        super(msg);
    }
}
class Calculator{
    public void checkInput(int x, int y) throws MaxInputException{
        if(x > 100000 || y > 100000){
            throw new MaxInputException("Input can't be greater then 100000");
        }
    }
    public int add(int a, int b) throws MaxInputException{
        checkInput(a, b);
        int c = a + b;
        return c;
    }
    public int subtract(int x, int y) throws MaxInputException{
        checkInput(x, y);
        int sub = x-y;
        return sub;
    }
    public int multiply(int x, int y) throws MaxInputException, MaxMultiplierReachedException{
        checkInput(x, y);
        if(x>700 || y>700){
            throw new MaxMultiplierReachedException("Multiply input can't allow greater than 700");
        }
        int mul = x * y;
        return mul;
    }
    public float divide(int x, int y) throws MaxInputException, CannotDivideByZeroException{
        checkInput(x, y);
        if(y == 0){
            throw new CannotDivideByZeroException("Can't divide by Zero");
        }
        float div = x/y;
        return div;
    }
}
public class CalculatorWithOOPsAndException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        try{
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
    
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
    
            System.out.print("Enter the operator(+, -, *, /): ");
            char operator = sc.next().charAt(0);
    
            float res =0.0f;
    
            switch(operator){
                case '+':
                    res = c.add(a, b);
                    break;
                case '-':
                    res = c.subtract(a, b);
                    break;
                case '*':
                    res = c.multiply(a, b);
                    break;
                case '/':
                    res = c.divide(a, b);
                    break;
                default:
                    throw new InvalidInputException("Invalid operator!");
            }
            System.out.println("Result : "+ res);
        }
        catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("Program End.");
        }
    }
}
