// Abstract methods must be implemented by the child class.
// An abstract class can be created without inheritance, but it becomes meaningful
// only when a subclass extends it and implements its abstract methods.

// Abstract class = incomplete class
// Child class = completes it

// abstract class Pen { }           // ✅ allowed
// public abstract class Pen { }    // ✅ allowed
// private abstract class Pen { }   // ❌ NOT allowed
// protected abstract class Pen { } // ❌ NOT allowed

// class A {
//     private class B { }      // ✅ allowed
//     protected class C { }    // ✅ allowed
// }

// Access level order (weak → strong):
// private < default < protected < public


abstract class Parent{
    // public Parent(){
    //     System.out.println("I am a constructor of parent class.");
    // }
    public Parent(int n){
        System.out.println("I am a parameterized constructor of parent class.");
    }
    public void sayHello(){
        System.out.println("Hello! Dear Friends.");
    }
    public static void askQuestion(){ // static method allowed h
        System.out.println("How are you?");
    }
    abstract public void greet();
}
class Child extends Parent{
    // if parent class hava a parameterized constructor instead of default constructor then
    // we sholud build a constructor in child class to call the parent class constructor.
    public Child(){
        super(9);
    }
    @Override  // it helps catch errors at compile time
    public void greet(){
        System.out.println("Good Morning!");
    }
}
public class OopsAbstrationPractice {
    public static void main(String args[]){
        Child obj = new Child(); // Abstract class ka constructor child object ke saath call hota hai.
        obj.sayHello();
        obj.greet();
        Parent.askQuestion();
    }
}


/*abstract class Parent{
    public Parent(){
        System.out.println("I am a default constructor of parent class.");
    }
    public Parent(int n){
        System.out.println("I am a parameterized constructor of parent class.");
    }
    public void sayHello(){
        System.out.println("Hello! Dear Friends.");
    }
    
    abstract public void greet();
}
class Child extends Parent{
    public void greet(){
        System.out.println("How are you?");
    }
}
public class OopsAbstrationPractice {
    public static void main(String args[]){
        Child obj = new Child(); // Abstract class ka constructor child object ke saath call hota hai.
        obj.sayHello();
        obj.greet();

    }
}*/




/*abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of parent class.");
    }
    public void sayHello(){
        System.out.println("Hello! Dear Friends.");
    }
    abstract public void greet(); /*{ // abstract method has no body.
        System.out.println("How are you?");}
}
class Child extends Parent{ // Abstract class ka object nahi ban sakta, isliye uska use child class ke through hota hai.
// Agar parent class me abstract method hai,to child class ko Parent class ke sabhi abstract method ko implement
//(override) karna hoga OR  child class ko bhi abstract banana hoga.
}

public class OopsAbstrationPractice {
    public static void main(String args[]){
        // Parent obj = new Parent(); // abstract class ka object nhi bna sakte hai. lekin abstract class ka reference bna sakte h
        // obj.sayHello();
        // obj.greet();

    }
}*/





/*abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of parent class.");
    }

    // static methods abstract ya override nhi hote h means --> abstract static void sayHello(); // ❌ not allowed
    static void sayHello(){ // static method ho sakte h
        System.out.println("Hello! Dear Friends.");
    }
    public void greet() {
        System.out.println("How are you?");}
}
public class OopsAbstrationPractice {
    public static void main(String args[]){
        //❌ Parent obj = new Parent(); // abstract class ka object nhi bna sakte hai. lekin abstract class ka reference bna sakte h
        Parent obj; // ye allowed h
        // obj.sayHello();
        // obj.greet();
        Parent.sayHello();
    }
}*/
