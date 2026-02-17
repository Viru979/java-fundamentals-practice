package Package.Solution.question3Package;

import java.util.Scanner;

class MessageDisplay{
    public void massage(String str){
        System.out.println("The message is: "+ str);
    }
}

abstract class Greetings{
    static void methodGreet(){
        System.out.println("Good Morning Baby!");
    }
}

// question 1
class calculator{
    private int a = 25;
    protected int b = 6;
    void calc(){
        System.out.println("The sum of a and b is: "+ (a + b));
    }
}

class ScientficCalculator{
    static void science(int a, int b){
        System.out.println("the value of sin(a+b) is: "+ Math.sin(a+b));
    }
}
    // Question 5
class HybrideCalculator{
    int a = 7;
    protected int b = 4;
    HybrideCalculator(){
        System.out.println("The subtraction of a and b is: "+ (a - b ));
    }
}
class Calc extends HybrideCalculator{
    void sumMethod(){
        System.out.println("The sum of a and b is: "+ (a + b));
    }
}
public class PackagePractice {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.sumMethod();

        /*Greetings.methodGreet();
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String msg = sc.nextLine();
        MessageDisplay m = new MessageDisplay();
        m.massage(msg);
        // Question 2


        /* Question1
        // calculator cal = new calculator();
        // cal.calc();
        // ScientficCalculator.science(6, 9);
        // HybrideCalculator CL = new HybrideCalculator();
        */
    }
}
