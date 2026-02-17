

// question 3
class MyGreet implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class Swagat implements Runnable{
    public void run(){
        try{
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Welcome!");
    }
}
public class ThreadQuestionSolve {
    public static void main(String[] args){
        Runnable g = new MyGreet();
        Thread t1 = new Thread(g, "greeting");

        Runnable s = new Swagat();
        Thread t2 = new Thread(s, "Swagatam");
        // State: NEW
        System.out.println("The state of "+ t1.getName() + " is: " + t1.getState());
        System.out.println("The state of "+ t2.getName() + " is: " + t2.getState());
        
        t1.start();
        t2.start();

        System.out.println("The state of "+ t1.getName() + " is: " + t1.getState()); // all possible state for t1: RUNNABLE, TERMINATED
        System.out.println("The state of "+ t2.getName() + " is: " + t2.getState()); // all possible state for t2: TIMED_WAITING, RUNNABLE, TERMINATED
        System.out.println("The state of "+ t2.getName() + " is: " + Thread.currentThread().getState());
    }
}



/*// question 3
class MyGreet implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class Swagat implements Runnable{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Welcome!");
        }
    }
}
public class ThreadQuestionSolve {
    public static void main(String[] args){
        Runnable g = new MyGreet();
        Thread t1 = new Thread(g, "greeting");

        Runnable s = new Swagat();
        Thread t2 = new Thread(s, "Swagatam");
        System.out.println("The priority of "+ t1.getName() + " is: " + t1.getPriority());
        System.out.println("The priority of "+ t2.getName() + " is: " + t2.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("the priority of "+ t1.getName() + " is: " + t1.getPriority());
        System.out.println("the priority of "+ t2.getName() + " is: " + t2.getPriority());
        
        t1.start();
        t2.start();

        System.out.println("The state of "+ t1.getName() + " is: " + t1.getState());
        System.out.println("The state of "+ t2.getName() + " is: " + t2.getState());
    }
}*/






/*// question 2
class MyGreet implements Runnable{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class Swagat implements Runnable{
    public void run(){
        for(int i=0; i<100; i++){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome!");
        }
    }
}
public class ThreadQuestionSolve {
    public static void main(String[] args){
        Runnable g = new MyGreet();
        Thread t1 = new Thread(g, "greeting");

        Runnable s = new Swagat();
        Thread t2 = new Thread(s, "Swagatam");
        t1.start();
        t2.start();
    }
}*/



/* // Question 1
class MyGreet implements Runnable{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Good Morning!");
            i++;
        }
    }
}
class Swagat implements Runnable{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Welcome!");
        }
    }
}
public class ThreadQuestionSolve {
    public static void main(String[] args){
        Runnable g = new MyGreet();
        Thread t1 = new Thread(g, "greeting");

        Runnable s = new Swagat();
        Thread t2 = new Thread(s, "Swagatam");
        t1.start();
        t2.start();
    }
}*/
