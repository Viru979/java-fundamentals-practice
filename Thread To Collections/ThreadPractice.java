/* NEW        → Thread object created
RUNNABLE   → start() called, waiting for CPU
RUNNING    → CPU allocated, run() executing
TERMINATED → run() finished*/

//A thread is created in NEW state, becomes RUNNABLE after start(), runs when CPU is allocated, and finally terminates

/* 5️⃣ Each thread has its own stack, but heap is shared
👉 i variable → thread-local (stack)
👉 Objects → shared (heap)*/

// start() creates a new thread and internally calls the run() method
// Runnable is preferred because it supports multiple inheritance and better OOP design.

// Thread constructor only creates the object; start() actually creates a new thread.

// Thread scheduling is handled by the JVM and OS, so execution order is not predictable.

// “Thread priority and yield are hints to the scheduler; actual execution depends on the JVM and OS.”

class MyThread extends Thread{
    public MyThread(String name){ // Thread(String name) constructor is used to assign a custom name to a thread.
        super(name);
    }
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);

            // It gives a hint to the scheduler(CPU), not a command.
            Thread.yield();

            try {
                // Pause thread
                Thread.sleep(500); //sleep() → pause current thread for fixed time
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadPractice{
    public static void main(String[] args){
        MyThread t1 = new MyThread("Viru");
        MyThread t2 = new MyThread("Virendra Bhai");
        
        System.out.println("Before setting the priority. Normal Priority is: " + t1.getPriority());
        System.out.println("Before setting the priority. Normal Priority is: " + t2.getPriority());

        // setPriority()
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        System.out.println("After setting the priority. the Priority is: " + t1.getPriority());
        System.out.println("After setting the priority. the Priority is: " + t2.getPriority());

        System.out.println("The name of the thread is: " + t1.getName());
        System.out.println("The name of the thread is: " + t2.getName());
        
        // start the thread
        t1.start();

        // join() : join() is meaningful only when thread already started.
        try {
            t1.join(); // join() → wait for another thread to complete
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();

    }
}







/*class Task extends Thread{
    public Task(String name){ // Thread(String name) constructor is used to assign a custom name to a thread.
        // super(); // calling default constructor
        super(name); // calling parameterized constructor // sets thread name
    }
    public void run(){
        System.out.println("Running task");
    }
}
class MyThread extends Thread{
    public MyThread(){
        super("Viru"); // calling thread's parameterized constructor with constructor name ("Viru").
    }
    @Override
    public void run(){
        int i=0;
        while(i<1){
            System.out.println("Thread is running");
            i++;
        }
    }
}
class MyTask extends Thread{// default constructor // No name passed
// JVM automatically assigns name like: Thread-0, Thread-1
    @Override
    public void run(){
        int i=0;
        while(i<1){
            System.out.println("My task is completed");
            i++;
        }
    }
}
public class ThreadPractice{
    public static void main(String[] args){
        Task t = new Task("Hero");
        MyThread mth = new MyThread();
        MyTask mt = new MyTask();
        t.start();
        mth.start();
        mt.start();
        System.out.println(t.getName());
        System.out.println(mth.getName());
        System.out.println(mt.getName());
        System.out.println(mt.getPriority());
    }
}*/





/*class MyThread extends Thread{
    @Override
    public void run(){ // run() is mandatory to override in case of Thread or Runnable because JVM allows run() as a entry point
        int i=0;
        while(i<100){
            System.out.println("Thread is running");
            i++;
        }
    }
}
class MyTask extends Thread{
    @Override
    public void run(){ // run() is mandatory in case of Thread or Runnable because JVM allows run() as a entry point
        int i=0;
        while(i<100){
            System.out.println("My task is completed");
            i++;
        }
    }
}
public class ThreadPractice{
    public static void main(String[] args){
        MyThread t = new MyThread(); // NEW
        MyTask tsk = new MyTask(); // NEW
        t.start(); // RUNNABLE // MyYhread and MyTask both executes concurrently (time slicing by JVM & OS)
        tsk.start(); // RUNNABLE // MyYhread and MyTask both executes concurrently (time slicing by JVM & OS)
    }
}





/*class MyThread extends Thread{
    @Override
    public void run(){ // run() is a abstract method inside Thread class so it is mandatory to override because JVM allows run() as a entry point
        task(); // it is allowed   // JVM calls run(), run() calls task()
        int i=0;
        while(i<100){
            System.out.println("Thread is running");
            i++;
        }
    }
    public void task(){   // task() is NOT called directly by JVM,
        int i=0;
        while(i<100){
            System.out.println("My task is completed");
            i++;
        }
    }
}
public class ThreadPractice{
    public static void main(String[] args){
        MyThread t = new MyThread(); // NEW
        // t.run();  // no new thread, normal method call
        t.start();// RUNNABLE // creates a new thread and calls run()
    }
}*/





/*class MyThread extends Thread{
    @Override
    public void run(){ // run() is a abstract method inside Thread class so it is mandatory to override because JVM allows run() as a entry point
        int i=0;
        while(i<100){
            System.out.println("Thread is running");
            i++;
        }
    }
    public void task(){   // ❌ JVM will ignore this because JVM don't know this method directly
        int i=0;
        while(i<100){
            System.out.println("My task is completed");
            i++;
        }
    }
}
public class ThreadPractice{
    public static void main(String[] args){
        MyThread t = new MyThread();  // NEW
        // t.run(); // no new thread, normal method call
        t.start(); // RUNNABLE // creates a new thread and calls run()
    }
}*/
