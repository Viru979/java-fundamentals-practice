
// Java supports single class inheritance
// Runnable supports better OOP design
// Runnable is preferred over Thread because it supports better OOP design and multiple inheritance.

// To execute a Runnable in a new thread, we must pass it to a Thread object and call start() on the Thread.

// Thread(Runnable, String) is used to assign a meaningful name to a thread for easier debugging.




class MyThread implements Runnable{
    public void run(){
        int i =1;
        while(i < 5){
            System.out.println("Thread is running by runnable." + Thread.currentThread().getName());
            i++;
            try{
            Thread.sleep(1000); // sleep() pauses the current thread
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class ThreadUsingRunnableInterface{
    public static void main(String[] args){
        MyThread mt1 = new MyThread();
        Thread th1 = new Thread(mt1, "Viru");

        MyThread mt2 = new MyThread();
        Thread th2 = new Thread(mt2, "Virendra Bhai");

        System.out.println("The name of the thread is: " + th1.getName());
        System.out.println("The name of the thread is: " + th2.getName());

        th1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("The priority of the thread is: " + th1.getPriority());
        System.out.println("The priority of the thread is: " + th2.getPriority());

        th1.start();
        try{
            th1.join(); // join() waits for another thread to finish
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        th2.start();
    }
}










/*class Task implements Runnable{
    @Override
    public void run(){
        System.out.println("Task running in: " +
                Thread.currentThread().getName());
    }
}
class MyThread1 implements Runnable{
    @Override
    public void run(){ // run() is mandatory in case of Thread or Runnable because JVM allows run() as a entry point
        for(int i=1; i<100; i++){
            System.out.println("Thread is running by Runnable");
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<100; i++){
            System.out.println("My task is completed");
        }
    }
}
public class ThreadUsingRunnableInterface{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1(); //Runnable target constructor calling // or Thread th1 = new Thread(new MyThread1());
        Thread th1 = new Thread(t1); // target passed to thread

        MyThread2 t2 = new MyThread2(); // or Thread th2 = new Thread(new MyThread2());
        Thread th2 = new Thread(t2); // target passed to thread
        
        // start() creates new threads and executes run() concurrently
        th1.start();
        th2.start();

        Runnable task = new Task();
        Thread t = new Thread(task, "Worker-1");
        t.start();
    }
}*/






/*class MyThread implements Runnable{
    @Override
    public void run(){ // run() is mandatory in case of Thread or Runnable because JVM allows run() as a entry point
        for(int i=1; i<100; i++){
            System.out.println("Thread is running by Runnable");
        }
        task(); // run() calls task()
    }
    public void task(){
        for(int i=1; i<100; i++){
            System.out.println("My task is completed");
        }
    }
}
public class ThreadUsingRunnableInterface{
    public static void main(String[] args){
        MyThread t1 = new MyThread(); // or Thread th = new Thread(new MyThread());
        Thread th = new Thread(t1);// Thread object // for creating new object using runnable we must pass Thread objects
        th.start(); // starts new thread
    }
}*/





/*class MyThread extends Thread implements Runnable{// bad approach(redundent) because Thread already implements Runnable.
    public void run(){ // run() is mandatory in case of Thread or Runnable because JVM allows run() as a entry point
        for(int i=1; i<100; i++){
            System.out.println("Thread is running by Runnable");
        }
    }
    public void task(){   // ❌ JVM will ignore this because JVM don't know this method directly
        for(int i=1; i<100; i++){
            System.out.println("My task is completed");
        }
    }
}
public class ThreadUsingRunnableInterface{
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();// ❌ ERROR because start() is a method of Thread class, not Runnable interface
    }
}







/*class MyThread implements Runnable{
    public void run(){ // run() is mandatory in case of Thread or Runnable because JVM allows run() as a entry point
        for(int i=1; i<100; i++){
            System.out.println("Thread is running by Runnable");
        }
    }
    public void task(){   // ❌ JVM will ignore this because JVM don't know this method directly
        for(int i=1; i<100; i++){
            System.out.println("My task is completed");
        }
    }
}
public class ThreadUsingRunnableInterface{
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start(); // ❌ ERROR because start() is a method of Thread class, not Runnable interface
    }
}*/
